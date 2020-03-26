package com.xgl.pizzastore;

import com.xgl.ingredientfactory.ChicagoPizzaIngredientFactory;
import com.xgl.ingredientfactory.PizzaIngredientFactory;
import com.xgl.pizza.CheesePizza;
import com.xgl.pizza.Pizza;
import com.xgl.pizza.VeggiePizza;
/**
 * ��������ģʽ
 * ���幹����2
 * @author E103-teacher
 *
 */
public class ChicagoPizzaStore extends PizzaStore {

	//ChicagoPizzaStore��Ȼ��ҪChicagoPizzaIngredientFactory��ԭ�Ϲ�����Ӧԭ��
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
