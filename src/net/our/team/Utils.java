package net.our.team;

import java.util.ArrayList;

import net.our.team.model.Person;

public class Utils {
public static ArrayList<Person>  getPesonList(){
	
	
	ArrayList<Person> personList = new ArrayList<>();
	Person person = new Person("Fuad" ,26,700f);
	personList.add(person);
	personList.add(new Person("Orxan",  24, -350f));
	person= new Person("mehemmed", 20, -250);
	personList.add(person);
	personList.add(new Person("Orxan",  29, 50000f));
	
	
	return personList;
}
}
