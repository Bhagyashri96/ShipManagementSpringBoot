package com.example.demo.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ShipDetail")
public class Shipdetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id ;
	
	String shipName;
	@Column(name = "ShipAge")
	Float age;
	
	@Enumerated(EnumType.ORDINAL)
	UsageType usageType;
	
	@Enumerated(EnumType.ORDINAL)
	ShipStatus shipStatus;
	
	Long humanCapacity;
	
	Long goodsCapacity;
	
	Float length;
	
	Float height;
	
	Float width;
	
	BigDecimal speed;
	
	Boolean isShipDiscontinued;
	
	Long orderId;
	
	public Shipdetails() {
		super();
	}

	

	public Shipdetails(Long id, String shipName, Float age, UsageType usageType, ShipStatus shipStatus,
			Long humanCapacity, Long goodsCapacity, Float length, Float height, Float width, BigDecimal speed,
			Boolean isShipDiscontinued, Long orderId) {
		super();
		this.id = id;
		this.shipName = shipName;
		this.age = age;
		this.usageType = usageType;
		this.shipStatus = shipStatus;
		this.humanCapacity = humanCapacity;
		this.goodsCapacity = goodsCapacity;
		this.length = length;
		this.height = height;
		this.width = width;
		this.speed = speed;
		this.isShipDiscontinued = isShipDiscontinued;
		this.orderId = orderId;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getShipName() {
		return shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public Float getAge() {
		return age;
	}

	public void setAge(Float age) {
		this.age = age;
	}

	public UsageType getUsageType() {
		return usageType;
	}

	public void setUsageType(UsageType usageType) {
		this.usageType = usageType;
	}

	public ShipStatus getShipStatus() {
		return shipStatus;
	}

	public void setShipStatus(ShipStatus shipStatus) {
		this.shipStatus = shipStatus;
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

	public Float getLength() {
		return length;
	}

	public void setLength(Float length) {
		this.length = length;
	}

	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public Float getWidth() {
		return width;
	}

	public void setWidth(Float width) {
		this.width = width;
	}

	public BigDecimal getSpeed() {
		return speed;
	}

	public void setSpeed(BigDecimal speed) {
		this.speed = speed;
	}

	public Boolean getIsShipDiscontinued() {
		return isShipDiscontinued;
	}

	public void setIsShipDiscontinued(Boolean isShipDiscontinued) {
		this.isShipDiscontinued = isShipDiscontinued;
	}



	public Long getOrderId() {
		return orderId;
	}



	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}



	@Override
	public String toString() {
		return "Shipdetails [id=" + id + ", shipName=" + shipName + ", age=" + age + ", usageType=" + usageType
				+ ", shipStatus=" + shipStatus + ", humanCapacity=" + humanCapacity + ", goodsCapacity=" + goodsCapacity
				+ ", length=" + length + ", height=" + height + ", width=" + width + ", speed=" + speed
				+ ", isShipDiscontinued=" + isShipDiscontinued + ", orderId=" + orderId + "]";
	}

	

	

}
