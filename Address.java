package com.myProgram;

public class Address {
	
	public String addr1;
	public String addr2;
	public String city;
	public String stateCode;
	public String ZipCode;
	public String Country;
	

	public Address(){
		
	}

	
	public Address( String a1, String a2, String cty, String sCode,String zCode, String Ctry){

		addr1 = a1;
		addr2 = a2;
		city = cty;
		stateCode = sCode;
		ZipCode = zCode;
		Country = Ctry;
	}


	public String getAddr1() {
		return addr1;
	}


	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}


	public String getAddr2() {
		return addr2;
	}


	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getStateCode() {
		return stateCode;
	}


	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}


	public String getZipCode() {
		return ZipCode;
	}


	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}


	public String getCountry() {
		return Country;
	}


	public void setCountry(String country) {
		Country = country;
	};
	
	
	
	
	
}
