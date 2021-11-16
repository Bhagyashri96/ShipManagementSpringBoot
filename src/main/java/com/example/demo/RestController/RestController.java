package com.example.demo.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.ExceptionHandling.InvalidOperation;
import com.example.demo.model.ShipLoadingDetail;
import com.example.demo.model.ShipOrderRequest;
import com.example.demo.model.Shipdetails;
import com.example.demo.service.ShipServiceIfc;



@org.springframework.web.bind.annotation.RestController
@RequestMapping("/ShipOperation")
public class RestController {
	
	@Autowired
	ShipServiceIfc shipServiceIfc;
	
	@PostMapping("/addShipDetails")
	public Shipdetails saveShipDetails(@RequestBody Shipdetails shipdetails) {
		System.out.println(shipdetails);
		return shipServiceIfc.saveShipDetails(shipdetails);
	}
	
	@PutMapping("/updateShipDetails")
	public Shipdetails updateShipDetails(@RequestBody Shipdetails shipdetails) throws InvalidOperation {
		return shipServiceIfc.updateShipDetails(shipdetails);
	}
	
	@PostMapping("/shipLoading")
	public ShipLoadingDetail loadShip(@RequestBody ShipLoadingDetail detail) throws InvalidOperation {
		return shipServiceIfc.loadship(detail);
	}
	
	@PostMapping("/startShip/{id}")
	public Shipdetails startShip(@PathVariable Long id) throws InvalidOperation {
		return shipServiceIfc.startship(id);
	}
	@PostMapping("/getOrderRequest")
	public ShipOrderRequest getOrderRequest(@RequestBody ShipOrderRequest orderRequest) {
		return shipServiceIfc.getOrderRequest(orderRequest);
	}
	

}
