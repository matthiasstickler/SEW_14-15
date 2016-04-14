/**
 * 
 */
package stickler;

/**
 * @author Matthias
 *
 */
public abstract class Beverage {
	protected String description = "Unknown";
	/**
	 * @param args
	 */
	public abstract double cost();
	
	public String getDescription(){
		return description;
	}

}
