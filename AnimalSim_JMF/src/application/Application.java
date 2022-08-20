package application;
/**
 * This main class is used to print all the information from animal and each subclass
 * @author James Frayser
 * Final Programming Project
 * CS131ON
 * Application.java
 */

import java.util.ArrayList;

import animalSim.*;

public class Application {

	public static void main(String[] args) {
		
		/**
		 * establishing objects to print later
		 */
		Goldfinch g = new Goldfinch(1, new Location (2,2), 9.0);
		BrownBear bb = new BrownBear(2, new Location(5,5), "Alsaskan");
		Location loc = new Location(0,0);
		
		/**
		 * generating the array list that can conatin any animal type
		 */
		ArrayList<Animal> animals = new ArrayList<Animal>();
		Location newLocation = new Location(45,67);
		
		//add objects to the Animal ArrayList
		animals.add(new Goldfinch(1, new Location(2,2), 9.0));
		animals.add(new Goldfinch(4, new Location(8,16), 12.2));
		animals.add(new BrownBear(3, new Location(10,22), "Kodiak"));
		animals.add(new BrownBear(2, new Location(5,5), "Alsaskan"));
		
		/**
		 * printing all the Location tests
		 */
		System.out.println("*********************************************\n");
		System.out.println("	     Location Tests				 \n");
		System.out.println("      " +loc.toString());
		System.out.println("Goldfinch Location: " +g.getLocation());
		System.out.println("BrownBear Location: " +bb.getLocation());
		System.out.println("");
		System.out.println("*********************************************\n");
		
		/**
		 * printing the fact that animal is abstract and can't be instantiated
		 */
		System.out.println("*********************************************\n");
		System.out.println("	     ANIMAL TESTS				 \n");
		System.out.println("Animal Is abstract and can't be instantiated ");
		System.out.println("");
		System.out.println("*********************************************\n");
		
		
		/**
		 * printing all the Goldfinch tests
		 */
		System.out.println("*********************************************\n");
		System.out.println("	     Goldfinch Tests				 \n");
		System.out.println(g.toString());
		g.eat();
		g.eat();
		System.out.println("The Goldfinch has eaten");
		System.out.println(g.toString());
		g.sleep();
		System.out.println("The Goldfinch has rested");
		System.out.println(g.toString());
		System.out.println("Goldfinch Location: " +g.getLocation());
		g.walkUp();
		g.update(0, 1);
		System.out.println("The Goldfinch has walked up");
		System.out.println("Goldfinch Location: " +g.getLocation());
		g.fly(newLocation);
		System.out.println("The Goldfinch has flown");
		System.out.println("Goldfinch Location: " +newLocation);
		System.out.println("");
		System.out.println("*********************************************\n");
		
		
		/**
		 * printing all the BrownBear tests
		 */
		System.out.println("*********************************************\n");
		System.out.println("	     BrownBear Tests				 \n");
		System.out.println(bb.toString());
		bb.eat();
		System.out.println("The BrownBear has eaten");
		System.out.println(bb.toString());
		bb.sleep();
		System.out.println("The BrownBear has rested");
		System.out.println(bb.toString());
		System.out.println("BrownBear Location: " +bb.getLocation());
		bb.walkUp();
		bb.update(0,3);
		System.out.println("The BrownBear has walked up");
		System.out.println("BrownBear Location: " +bb.getLocation());
		bb.swimUp();
		bb.update(0, 2);
		System.out.println("The BrownBear has swam up");
		System.out.println("BrownBear Location: " +bb.getLocation());
		System.out.println("");
		System.out.println("*********************************************\n");
		
		
		/**
		 * printing all the Generics tests
		 */
		System.out.println("*********************************************\n");

		System.out.println("	     Generics Tests				 \n");
		for(Animal a : animals) {
			System.out.println(a.toString());
		}
		System.out.println("");
		System.out.println("*********************************************\n");
		
		
	}//end main

}//end class
