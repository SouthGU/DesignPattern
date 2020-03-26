package com.xgl.pizzastore;

import com.xgl.ingredientfactory.NYPizzaIngredientFactory;
import com.xgl.ingredientfactory.PizzaIngredientFactory;
import com.xgl.pizza.CheesePizza;
import com.xgl.pizza.Pizza;
import com.xgl.pizza.VeggiePizza;
/**
 * ��������ģʽ
 * ���幹����1
 * @author E103-teacher
 *
 */
public class NYPizzaStore extends PizzaStore {

	//NYPizzaStore��Ȼ��ҪNYPizzaIngredientFactory��ԭ�Ϲ�����Ӧԭ��
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
