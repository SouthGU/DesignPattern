package com.jdp.pizzastore;

import com.jdp.pizza.Pizza;

/**
 * 工厂方法模式
 * 构造者角色
 * @author E103-teacher
 *
 */
public abstract class PizzaStore {
	public Pizza orderPizza(String type){
		Pizza pizza = null;
		pizza = createPizza(type);  //方法调用
		pizza.prepare();   //准备
		pizza.bake();      //烘烤
		pizza.cut();       //切片
		pizza.box();       //装盒
		
		return pizza;      //返回具体Pizza的产品对象
	}
	
	//工厂方法(抽象方法)
	public abstract Pizza createPizza(String type);
}
