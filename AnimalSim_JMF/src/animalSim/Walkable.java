package animalSim;
/**
 * This interface is used to let the BrownBear and Goldfinch walk.
 * @author James Frayser
 * Final Programming Project
 * CS131ON
 * Walkable.java
 */

public interface Walkable {

	/**
	 * walk to call where they are walking
	 * walkUp etc to allow the animal to walk in a certain direction
	 * @param direction
	 */
	public void walk(int direction);
	
	public void walkUp();
	public void walkDown();
	public void walkLeft();
	public void walkRight();

}//end interface

