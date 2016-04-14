/**
 * 
 */
package stickler;

/**
 * @author Matthias
 *
 */
public class DarkRoast extends Beverage {

	/**
	 * 
	 */
	public DarkRoast() {
		description = "Dark Roast";
	}

	/* (non-Javadoc)
	 * @see stickler.Beverage#cost()
	 */
	@Override
	public double cost() {
		return 2.59;
	}

}
