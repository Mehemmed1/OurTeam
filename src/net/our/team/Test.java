package net.our.team;

import java.util.ArrayList;

import net.our.team.model.Person;

public class Test {

	public static void main(String[] args) {

	
		
		ArrayList<Person> myList=Utils.getPesonList();
		
		Person orxan = new Person("Orxan",  24, -350f);
		
		for (Person person : myList) {
			
		//if(person.getName().equals(orxan.getName())  && person.getAge() == orxan.getAge())   {
		if (person.equals(orxan)) {
			person.setSalary(2*person.getSalary());}	
		}
		
		for (Person person : myList) {
			person.toString();
			
		}
		
		
		
		
	}

}
