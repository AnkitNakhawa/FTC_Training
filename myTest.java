package com.myProgram;


public class myTest {
	public static void main(String[] args){
		Person person = new Person("Ankit", "Nakhawa", 2008, 00, 10 );
		Address address = new Address( "10", "Sunrise Drive","Chelmsford","MA", "01886", "USA");
		person.setAddress(address);
		System.out.println(person.getFirstName() + " " + person.getLastName());
		System.out.println("Birthday: " + person.getBirthDate());
		System.out.println("Address:" + " " + person.getAddress());
		System.out.println("Ankit's age is" + " " + person.getAgeYear() + " years " + person.getAgeMonth() + " months " + person.getAgeDay() + " days old.");
		
	}
	
};
