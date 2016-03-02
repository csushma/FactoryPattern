/**
 * 
 */
package org.java.PizzaStore;

/**
 * @author SUSHMARAVI
 *
 */
public abstract class PizzaStore {
	/** order pizza method has no clue which pizza it is creating either ny style or chicago style, 
	 * or what type like cheese, pepporoni, veggie etc.
	 * */
	public Pizza orderPizza(String type){
		Pizza pizza;
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		
		return pizza;
	}
	
	protected abstract Pizza createPizza(String type);

}
