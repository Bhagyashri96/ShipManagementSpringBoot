package com.example.demo.model;

public class ShipLoadingDetail {
	
	Long humanCapacity;
	
	Long goodsCapacity;
	
	Float shipAge;
	
	Long ShipId;

	public ShipLoadingDetail() {
		super();
	}

	public ShipLoadingDetail(Long humanCapacity, Long goodsCapacity, Float shipAge, Long shipId) {
		super();
		this.humanCapacity = humanCapacity;
		this.goodsCapacity = goodsCapacity;
		this.shipAge = shipAge;
		ShipId = shipId;
	}

	public Long getHumanCapacity() {
		return humanCapacity;
	}

	public void setHumanCapacity(Long humanCapacity) {
		this.humanCapacity = humanCapacity;
	}

	public Long getGoodsCapacity() {
		return goodsCapacity;
	}

	public void setGoodsCapacity(Long goodsCapacity) {
		this.goodsCapacity = goodsCapacity;
	}

	public Float getShipAge() {
		return shipAge;
	}

	public void setShipAge(Float shipAge) {
		this.shipAge = shipAge;
	}

	public Long getShipId() {
		return ShipId;
	}

	public void setShipId(Long shipId) {
		ShipId = shipId;
	}

	@Override
	public String toString() {
		return "ShipLoadingDetail [humanCapacity=" + humanCapacity + ", goodsCapacity=" + goodsCapacity + ", shipAge="
				+ shipAge + ", ShipId=" + ShipId + "]";
	}

	
}
