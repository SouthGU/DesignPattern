package com.jdp.pizzastore;

import com.jdp.ingredientfactory.NYPizzaIngredientFactory;
import com.jdp.ingredientfactory.PizzaIngredientFactory;
import com.jdp.pizza.CheesePizza;
import com.jdp.pizza.Pizza;
import com.jdp.pizza.VeggiePizza;
/**
 * 工厂方法模式
 * 具体构造者1
 * @author E103-teacher
 *
 */
public class NYPizzaStore extends PizzaStore {

	//NYPizzaStore当然需要NYPizzaIngredientFactory的原料工厂供应原料
	private PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
	
	
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza(factory);
			pizza.setPrice(8.5);
			pizza.setName("NYCheesePizza");
		}
		else if (type.equals("veggie")) {
			pizza = new VeggiePizza(factory);
			pizza.setPrice(3.5);
			pizza.setName("NYVeggiePizza");
		}
		
		return pizza;
	}

}
