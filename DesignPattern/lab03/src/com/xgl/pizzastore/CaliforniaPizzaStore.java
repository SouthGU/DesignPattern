package com.xgl.pizzastore;

import com.xgl.ingredientfactory.CaliforniaPizzaIngredientFactory;
import com.xgl.ingredientfactory.PizzaIngredientFactory;
import com.xgl.pizza.CheesePizza;
import com.xgl.pizza.Pizza;
import com.xgl.pizza.VeggiePizza;
/**
 * 工厂方法模式
 * 新增具体构造者1
 * 最近新增的PizzaStore
 * @author E103-teacher
 *
 */
public class CaliforniaPizzaStore extends PizzaStore {

	//CaliforniaPizzaStore当然需要CaliforniaPizzaIngredientFactory的原料工厂供应原料
	private PizzaIngredientFactory factory = new CaliforniaPizzaIngredientFactory();
	
	
	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza(factory);
			pizza.setPrice(5.5);
			pizza.setName("CaliforniaCheesePizza");
		}
		else if (type.equals("veggie")) {
			pizza = new VeggiePizza(factory);
			pizza.setPrice(2.5);
			pizza.setName("CaliforniaVeggiePizza");
		}
		
		return pizza;
	}

}
