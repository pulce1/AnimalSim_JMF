package animalSim;
/**
 * This interface is used to let the BrownBear swim
 * @author James Frayser
 * Final Programming Project
 * CS131ON
 * swimmable.java
 */

public interface Swimmable {

	/**
	 * swim to call where they are swimming
	 * swimUp etc to allow the animal to swim in a certain direction
	 * @param direction
	 */
	public void swim(int direction);
	
	public void swimUp();
	public void swimDown();
	public void swimLeft();
	public void swimRight();

}//end interface