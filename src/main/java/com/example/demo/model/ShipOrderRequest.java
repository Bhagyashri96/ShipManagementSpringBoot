package com.example.demo.model;

import java.util.Date;

public class ShipOrderRequest {
	
	 Long orderId;
		
		String orderDescription;
		
		Long orderQuantity;
		
		Date orderDate;
		
		Date payementDate;
		
		Boolean isPaymentSuccessful;
		
		Long shipId;

		public ShipOrderRequest() {
			super();
		}

		

		public ShipOrderRequest(Long orderId, String orderDescription, Long orderQuantity, Date orderDate,
				Date payementDate, Boolean isPaymentSuccessful, Long shipId) {
			super();
			this.orderId = orderId;
			this.orderDescription = orderDescription;
			this.orderQuantity = orderQuantity;
			this.orderDate = orderDate;
			this.payementDate = payementDate;
			this.isPaymentSuccessful = isPaymentSuccessful;
			this.shipId = shipId;
		}



		public Long getShipId() {
			return shipId;
		}



		public void setShipId(Long shipId) {
			this.shipId = shipId;
		}



		public Long getOrderId() {
			return orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public String getOrderDescription() {
			return orderDescription;
		}

		public void setOrderDescription(String orderDescription) {
			this.orderDescription = orderDescription;
		}

		public Long getOrderQuantity() {
			return orderQuantity;
		}

		public void setOrderQuantity(Long orderQuantity) {
			this.orderQuantity = orderQuantity;
		}

		public Date getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(Date orderDate) {
			this.orderDate = orderDate;
		}

		public Date getPayementDate() {
			return payementDate;
		}

		public void setPayementDate(Date payementDate) {
			this.payementDate = payementDate;
		}

		public Boolean getIsPaymentSuccessful() {
			return isPaymentSuccessful;
		}

		public void setIsPaymentSuccessful(Boolean isPaymentSuccessful) {
			this.isPaymentSuccessful = isPaymentSuccessful;
		}



		@Override
		public String toString() {
			return "ShipOrderRequest [orderId=" + orderId + ", orderDescription=" + orderDescription + ", orderQuantity="
					+ orderQuantity + ", orderDate=" + orderDate + ", payementDate=" + payementDate
					+ ", isPaymentSuccessful=" + isPaymentSuccessful + ", shipId=" + shipId + "]";
		}

		

}
