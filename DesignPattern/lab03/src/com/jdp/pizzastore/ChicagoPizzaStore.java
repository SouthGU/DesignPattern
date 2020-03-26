package com.jdp.pizzastore;

import com.jdp.ingredientfactory.ChicagoPizzaIngredientFactory;
import com.jdp.ingredientfactory.NYPizzaIngredientFactory;
import com.jdp.ingredientfactory.PizzaIngredientFactory;
import com.jdp.pizza.CheesePizza;
import com.jdp.pizza.Pizza;
import com.jdp.pizza.VeggiePizza;
/**
 * 工厂方法模式
 * 具体构造者2
 * @author E103-teacher
 *
 */
public class ChicagoPizzaStore extends PizzaStore {

	//ChicagoPizzaStore当然需要ChicagoPizzaIngredientFactory的原料工厂供应原料
	private PizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();
	
	
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza(factory);
			pizza.setPrice(6.5);
			pizza.setName("ChicagoCheesePizza");
		}
		else if (type.equals("veggie")) {
			pizza = new VeggiePizza(factory);
			pizza.setPrice(4.5);
			pizza.setName("ChicagoVeggiePizza");
		}
		
		return pizza;
	}

}
