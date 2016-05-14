package net.our.team;

import net.our.team.model.Person;

public class Test1 {
public static void main(String[] args) {
	Person orxan = new Person("Orxan",  24, -350f);
	Person orxan1 = new Person("Orxan",  24, -350f);
	System.out.println("hashcode orxan :"+orxan.hashCode());
	System.out.println("hashcode orxan1 :"+orxan1.hashCode());
	
	System.out.println("orxan==orxan :"+(orxan==orxan));
	System.out.println("orxan1==orxan :"+(orxan1==orxan));

	
	System.out.println("orxan equals orxan :"+(orxan.equals(orxan)));
	System.out.println("orxan equals orxan1 :"+(orxan.equals(orxan1)));
	

}
}
