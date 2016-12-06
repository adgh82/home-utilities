package org.residential.usage.util.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="address")
public class Address extends AbstractEntity {
	
	private String addressId;
	private String line1;
	private String line2;
	private String line3;
	private String line4;
	private String city;
	private String state;
	private long pinCode;
	
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getLine3() {
		return line3;
	}
	public void setLine3(String line3) {
		this.line3 = line3;
	}
	public String getLine4() {
		return line4;
	}
	public void setLine4(String line4) {
		this.line4 = line4;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	

}
