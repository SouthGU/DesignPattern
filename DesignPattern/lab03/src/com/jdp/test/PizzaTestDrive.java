package com.jdp.test;

import com.jdp.pizza.Pizza;
import com.jdp.pizzastore.CaliforniaPizzaStore;
import com.jdp.pizzastore.ChicagoPizzaStore;
import com.jdp.pizzastore.NYPizzaStore;
import com.jdp.pizzastore.PizzaStore;

/**
 * 测试场景类
 * @author E103-teacher
 *
 */
public class PizzaTestDrive {

	public static void main(String[] args) {
		//多态：新开的3家PizzaStore的对象
		PizzaStore NYStore = new NYPizzaStore();
		PizzaStore ChicagoStore = new ChicagoPizzaStore();
		PizzaStore CaliforniaStore = new CaliforniaPizzaStore();
		
		System.out.println("######################################");
		Pizza pizza = null;
		//小明订购
		pizza = NYStore.orderPizza("cheese");
		System.out.println(pizza.getName() +  "\n" + pizza.getDough() + "\n" + 
		pizza.getSauce() + "\n" + pizza.getPrice());
		System.out.println("######################################");
		//小红订购
		pizza = ChicagoStore.orderPizza("cheese");
		System.out.println(pizza.getName() +  "\n" + pizza.getDough() + "\n" + 
		pizza.getSauce() + "\n" + pizza.getPrice());
		System.out.println("######################################");
		//小王订购
		pizza = CaliforniaStore.orderPizza("cheese");
		System.out.println(pizza.getName() +  "\n" + pizza.getDough() + "\n" + 
		pizza.getSauce() + "\n" + pizza.getPrice());
		System.out.println("######################################");
		
	}

}
