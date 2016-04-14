/**
 * 
 */
package stickler;

/**
 * @author Matthias
 *
 */
public class Choco extends CondimentDecorator {
	private Beverage beverage;

	/**
	 * 
	 */
	public Choco(Beverage beverage) {
		this.beverage = beverage;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see stickler.CondimentDecorator#getDescription()
	 */
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Schoko";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see stickler.Beverage#cost()
	 */
	@Override
	public double cost() {
		return 0.25 + beverage.cost();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
