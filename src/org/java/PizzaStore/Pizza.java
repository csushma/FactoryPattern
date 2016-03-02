/**
 * 
 */
package org.java.PizzaStore;

/**
 * @author SUSHMARAVI
 *
 */
public class Pizza {

	protected String name;
	protected String dough;
	protected String sauce;
	protected String toppings;
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing pizza: "+name);
		System.out.println("using "+dough+" dough");
		System.out.println("Adding sauce: "+sauce);
		System.out.println("Adding toppings: "+toppings);
		System.out.println("Pizza Prepared");
	}

	/**
	 * 
	 */
	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("Pizza baked");
	}

	/**
	 * 
	 */
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("Pizza cut into pieces");
	}

	/**
	 * 
	 */
	public void box() {
		// TODO Auto-generated method stub
		System.out.println("Pizza kept in box");
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}
