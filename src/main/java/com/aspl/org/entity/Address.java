package com.aspl.org.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")

public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "address_Code", nullable = false)
	private String addressCode;
	@Column(name = "Ship_To")
	private String shipTo;
	@Column(name = "Bill_To")
	private String billTo;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int id, String addressCode, String shipTo, String billTo) {
		super();
		this.id = id;
		this.addressCode = addressCode;
		this.shipTo = shipTo;
		this.billTo = billTo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddressCode() {
		return addressCode;
	}
	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}
	public String getShipTo() {
		return shipTo;
	}
	public void setShipTo(String shipTo) {
		this.shipTo = shipTo;
	}
	public String getBillTo() {
		return billTo;
	}
	public void setBillTo(String billTo) {
		this.billTo = billTo;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", addressCode=" + addressCode + ", shipTo=" + shipTo + ", billTo=" + billTo + "]";
	}
	
	

}
