package com.example.demo.service;

import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.ExceptionHandling.InvalidOperation;
import com.example.demo.dao.ShipDetailsRepo;
import com.example.demo.model.ShipLoadingDetail;
import com.example.demo.model.ShipOrderRequest;
import com.example.demo.model.ShipStatus;
import com.example.demo.model.Shipdetails;
import org.slf4j.Logger;


@Service
@Transactional
public class ShipService implements ShipServiceIfc {
	
	Logger logger = LoggerFactory.getLogger(ShipService.class);
	
    @Autowired
    ShipDetailsRepo shipdetailsdao;
    
	@Override
	public Shipdetails saveShipDetails(Shipdetails shipdetails) {
		if (null != shipdetails) {
		    shipdetailsdao.save(shipdetails);
		}
		return shipdetails;
	}

	@Override
	public ShipLoadingDetail loadship(ShipLoadingDetail detail) throws InvalidOperation {
		if (null != detail) {
			 Optional<Shipdetails> shipDetails = shipdetailsdao.findById(detail.getShipId());
		 if (shipDetails != null) {
			 Shipdetails shipdetailsfromDb =shipDetails.get(); 
			 
			if (detail.getGoodsCapacity() != null && detail.getGoodsCapacity() > shipdetailsfromDb.getGoodsCapacity()) {
				logger.error("Goods Capacity Overloaded,Cannot be greater than :"+shipdetailsfromDb.getGoodsCapacity());
				throw new InvalidOperation("Goods Capacity Overloaded,Cannot be greater than:"+shipdetailsfromDb.getGoodsCapacity());
			}
			if (detail.getHumanCapacity() != null && detail.getHumanCapacity() > shipdetailsfromDb.getHumanCapacity()) {
				logger.error("Human Capacity Overloaded,Cannot be greater than :" +shipdetailsfromDb.getHumanCapacity());
				throw new InvalidOperation("Human Capacity Overloaded,Cannot be greater than :" +shipdetailsfromDb.getHumanCapacity());
			}
			if (detail.getShipAge() != null && detail.getShipAge() > shipdetailsfromDb.getAge()) {
				logger.error("Ship age cannot be more than :" +shipdetailsfromDb.getAge());
				throw new InvalidOperation("Ship age cannot be more than :" +shipdetailsfromDb.getAge());
			}
		 }else {
			 logger.error("No Record found");
			 throw new InvalidOperation("No Record found");
		 }
		}
		return detail;
	}

	@Override
	public Shipdetails updateShipDetails(Shipdetails shipdetails) throws InvalidOperation {
		if (shipdetails != null) {
			   // shipdetailsdao.save(shipdetails);
			}else {
				logger.error("No Record found");
				throw new InvalidOperation("No Record found");
			}
		return shipdetails;
	}

	@Override
	public Shipdetails startship(Long id) throws InvalidOperation {
		Shipdetails shipdetails2 = null;
		 if (id != null) {
			 Optional<Shipdetails> shipDetails = shipdetailsdao.findById(id);
			 if (shipDetails != null) {
				  shipdetails2 =shipDetails.get(); 
				 if (shipdetails2 != null && shipdetails2.getShipStatus().equals(ShipStatus.STOPPED)) {
					 shipdetails2.setShipStatus(ShipStatus.STARTED);
					 updateShipDetails(shipdetails2);
				 }else {
					 logger.error("Ship is already started");
					 throw new InvalidOperation("Ship is already started");
				 }
			 }
		 }
		return shipdetails2;
	}

	@Override
	public ShipOrderRequest getOrderRequest(ShipOrderRequest orderRequest) {
		Shipdetails shipdetails2 = null;
		Optional<Shipdetails> shipDetails = shipdetailsdao.findById(orderRequest.getShipId());
		 if (shipDetails != null) {
			  shipdetails2 =shipDetails.get();
			  shipdetails2.setOrderId(orderRequest.getOrderId());
			  logger.info("Order request got succesfully");
		 }
		return orderRequest;
	}

}
