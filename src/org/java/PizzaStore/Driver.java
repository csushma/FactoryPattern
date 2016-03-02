/**
 * 
 */
package org.java.PizzaStore;

import org.java.ChicagoStylePizzaStore.ChicagoStylePizzaStore;
import org.java.NyStylePizzaStore.NyStylePizzaStore;

/**
 * @author SUSHMARAVI
 *
 */
public class Driver {
	
	public static void main(String[] args) {
		PizzaStore ethan = new NyStylePizzaStore();
		ethan.orderPizza("cheese");
		
		PizzaStore joel = new ChicagoStylePizzaStore();
		joel.orderPizza("veggie");
		
	}

}
