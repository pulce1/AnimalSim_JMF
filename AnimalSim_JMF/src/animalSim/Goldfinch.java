package animalSim;

/**
 * This class is used as a subclass to animal, using the super class to add the animal class
 * instance variables to give all the right variables for a Goldfinch
 * @author James Frayser
 * Final Programming Project
 * CS131ON
 * Goldfinch.java
 */
public class Goldfinch extends Animal implements Flyable, Walkable{

	private double wingSpan;

	/**
	 * empty argument constructor
	 */
	public Goldfinch(){
		super();
		this.wingSpan=9.0;
	}
	
	/**
	 * preferred argument constructor
	 */
	public Goldfinch(int simID, Location l, double wingSpan) {
		super(simID, l);
		this.wingSpan = wingSpan;
	}
	
	/**
	 * getters and setters for wingSpan
	 * @return
	 */
	public double getWingSpan() {
		
		return wingSpan;
	}
	
	public void setWingSpan(double wingSpan) {
		
		this.wingSpan=wingSpan;
	}


	/**
	 * implementation of the interface
	 */
	public void walkUp() {
		yCoord++;
		
	}

	public void walkDown() {
		yCoord--;
		
	}

	public void walkLeft() {
		xCoord--;
		
	}

	public void walkRight() {
		xCoord++;
		
	}

	public void walk(int direction) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * implementation of the fly interface
	 */
	@Override
	public void fly(Location l) {
		Goldfinch gg = new Goldfinch();
		gg.update(3, 5);
		
	}//end fly
	
	/**
	 * toString to print in the main
	 */
	@Override
	public String toString() {
		return "Goldfinch [wingSpan=" + wingSpan + ", simID=" + simID + ", location=" + l + ", full=" + full
				+ ", rested=" + rested + "]";
	}//end toString

	

}//end class
