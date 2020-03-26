package com.jdp.pizzastore;

import com.jdp.ingredientfactory.CaliforniaPizzaIngredientFactory;
import com.jdp.ingredientfactory.NYPizzaIngredientFactory;
import com.jdp.ingredientfactory.PizzaIngredientFactory;
import com.jdp.pizza.CheesePizza;
import com.jdp.pizza.Pizza;
import com.jdp.pizza.VeggiePizza;
/**
 * ��������ģʽ
 * �������幹����1
 * ���������PizzaStore
 * @author E103-teacher
 *
 */
public class CaliforniaPizzaStore extends PizzaStore {

	//CaliforniaPizzaStore��Ȼ��ҪCaliforniaPizzaIngredientFactory��ԭ�Ϲ�����Ӧԭ��
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
