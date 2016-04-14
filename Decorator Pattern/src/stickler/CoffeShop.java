/**
 * 
 */
package stickler;

/**s
 * @author Matthias Stickler
 * @version1.0
 *
 */
public class CoffeShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beverage beverage = new DarkRoast();
		System.out.println(beverage.getDescription() + " €" + beverage.cost());

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Milk(beverage2);
		beverage2 = new Choco(beverage2);
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription() + " €" + beverage2.cost());

	}

}
