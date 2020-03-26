package com.xgl.pizzastore;

import com.xgl.ingredientfactory.CaliforniaPizzaIngredientFactory;
import com.xgl.ingredientfactory.PizzaIngredientFactory;
import com.xgl.pizza.CheesePizza;
import com.xgl.pizza.Pizza;
import com.xgl.pizza.VeggiePizza;
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
