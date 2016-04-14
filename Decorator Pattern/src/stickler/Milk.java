/**
 * 
 */
package stickler;

/**
 * @author Matthias
 *
 */
public class Milk extends CondimentDecorator {
	private Beverage beverage;

	/**
	 * 
	 */
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see stickler.CondimentDecorator#getDescription()
	 */
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milch";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see stickler.Beverage#cost()
	 */
	@Override
	public double cost() {
		return 0.40 + beverage.cost();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
