package com.example.demo.service;

import com.example.demo.ExceptionHandling.InvalidOperation;
import com.example.demo.model.ShipLoadingDetail;
import com.example.demo.model.ShipOrderRequest;
import com.example.demo.model.Shipdetails;

public interface ShipServiceIfc {

	public Shipdetails saveShipDetails(Shipdetails shipdetails);

	public ShipLoadingDetail loadship(ShipLoadingDetail detail) throws InvalidOperation;

	public Shipdetails updateShipDetails(Shipdetails shipdetails) throws InvalidOperation;

	public Shipdetails startship(Long id) throws InvalidOperation;

	public ShipOrderRequest getOrderRequest(ShipOrderRequest orderRequest);

}
