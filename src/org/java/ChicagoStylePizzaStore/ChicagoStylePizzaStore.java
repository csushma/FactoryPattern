/**
 * 
 */
package org.java.ChicagoStylePizzaStore;

import org.java.PizzaStore.Pizza;
import org.java.PizzaStore.PizzaStore;

/**
 * @author SUSHMARAVI
 *
 */
public class ChicagoStylePizzaStore extends PizzaStore{

	public ChicagoStylePizzaStore() {
		System.out.println("calling Chicago Style Pizza Store");
	}
	
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("cheese")){
			System.out.println("Creating chicago style cheese pizza");
			return new ChicagoStyleCheesePizza();
		}
		else{
			System.out.println("Creating chicago style veggie pizza");
			return new ChicagoStyleVeggiePizza();
		}
	}

}
