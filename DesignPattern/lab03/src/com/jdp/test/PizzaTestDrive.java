package com.jdp.test;

import com.jdp.pizza.Pizza;
import com.jdp.pizzastore.CaliforniaPizzaStore;
import com.jdp.pizzastore.ChicagoPizzaStore;
import com.jdp.pizzastore.NYPizzaStore;
import com.jdp.pizzastore.PizzaStore;

/**
 * ���Գ�����
 * @author E103-teacher
 *
 */
public class PizzaTestDrive {

	public static void main(String[] args) {
		//��̬���¿���3��PizzaStore�Ķ���
		PizzaStore NYStore = new NYPizzaStore();
		PizzaStore ChicagoStore = new ChicagoPizzaStore();
		PizzaStore CaliforniaStore = new CaliforniaPizzaStore();
		
		System.out.println("######################################");
		Pizza pizza = null;
		//С������
		pizza = NYStore.orderPizza("cheese");
		System.out.println(pizza.getName() +  "\n" + pizza.getDough() + "\n" + 
		pizza.getSauce() + "\n" + pizza.getPrice());
		System.out.println("######################################");
		//С�충��
		pizza = ChicagoStore.orderPizza("cheese");
		System.out.println(pizza.getName() +  "\n" + pizza.getDough() + "\n" + 
		pizza.getSauce() + "\n" + pizza.getPrice());
		System.out.println("######################################");
		//С������
		pizza = CaliforniaStore.orderPizza("cheese");
		System.out.println(pizza.getName() +  "\n" + pizza.getDough() + "\n" + 
		pizza.getSauce() + "\n" + pizza.getPrice());
		System.out.println("######################################");
		
	}

}
