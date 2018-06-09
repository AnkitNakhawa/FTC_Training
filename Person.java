package com.myProgram;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Address address = new Address(); 
	private int ageYear;
	private int ageMonth;
	private int ageDay;

	public Person(){
		
	}

	public Person(String fName, String lName, int birthYear, int birthMonth, int birthDay){
		firstName = fName;
		lastName = lName;
		Calendar cal = new GregorianCalendar(birthYear, birthMonth, birthDay);
		birthDate = cal.getTime();	
	populateAge( birthYear, birthMonth, birthDay);
	
	
	
	}
	public int getAgeYear() {
		return ageYear;
	}

	public int getAgeMonth() {
		return ageMonth;
	}

	public int getAgeDay() {
		return ageDay;
	}

	public String getAddress() {
		return address.addr1 + " " + address.addr2 + ", " + address.city + ", " + address.stateCode + " " + address.ZipCode + " " + address.Country ;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		return sdf.format(birthDate);
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
public void populateAge(int birthYear, int birthMonth, int birthDay){
	Calendar now = Calendar.getInstance();
	int year = now.get(Calendar.YEAR);
	int month = now.get(Calendar.MONTH);
	int day = now.get(Calendar.DAY_OF_MONTH);
	int prevMonthMaxDay = getPreviousMonth().getActualMaximum(Calendar.DAY_OF_MONTH);
	ageYear = year - birthYear;
	ageMonth = month - birthMonth;	
	ageDay = prevMonthMaxDay - birthDay + day;
}
public Calendar getPreviousMonth (){
	Calendar pastMonth = Calendar.getInstance();
    pastMonth.set(Calendar.MONTH, pastMonth.get(Calendar.MONTH) -1);
	return pastMonth;
	}
}
