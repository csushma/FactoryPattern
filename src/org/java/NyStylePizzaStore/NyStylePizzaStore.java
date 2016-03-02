/**
 * 
 */
package org.java.NyStylePizzaStore;

import org.java.PizzaStore.Pizza;
import org.java.PizzaStore.PizzaStore;

/**
 * @author SUSHMARAVI
 *
 */
public class NyStylePizzaStore extends PizzaStore{
	
	public NyStylePizzaStore(){
		System.out.println("calling Ny Style Pizza Store");
	}

	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		
		if(type.equals("cheese")){
			System.out.println("Creating ny style cheese pizza");
			return new NyStyleCheesePizza();
		}
		else{
			System.out.println("Creating ny style veggie pizza");
			return new NyStyleVeggiePizza();
		}
	}

}
