package com.xgl.test;

import com.xgl.pizza.Pizza;
import com.xgl.pizzastore.CaliforniaPizzaStore;
import com.xgl.pizzastore.ChicagoPizzaStore;
import com.xgl.pizzastore.NYPizzaStore;
import com.xgl.pizzastore.PizzaStore;


public class  PizzaTestDrive {

	public static void main(String[] args) {
		//��̬���¿���3��PizzaStore�Ķ���
		PizzaStore NYStore = new NYPizzaStore();
		PizzaStore ChicagoStore = new ChicagoPizzaStore();
		PizzaStore CaliforniaStore = new CaliforniaPizzaStore();
		
		System.out.println("----------------------------------");
		Pizza pizza = null;
		//С������
		pizza = NYStore.orderPizza("cheese");
		System.out.println(pizza.getName() +  "\n" + pizza.getDough() + "\n" + 
		pizza.getSauce() + "\n" + pizza.getPrice());
		System.out.println("----------------------------------");
		//С�충��
		pizza = ChicagoStore.orderPizza("cheese");
		System.out.println(pizza.getName() +  "\n" + pizza.getDough() + "\n" + 
		pizza.getSauce() + "\n" + pizza.getPrice());
		System.out.println("----------------------------------");
		//С������
		pizza = CaliforniaStore.orderPizza("cheese");
		System.out.println(pizza.getName() +  "\n" + pizza.getDough() + "\n" + 
		pizza.getSauce() + "\n" + pizza.getPrice());
		System.out.println("----------------------------------");
		
	}

}
