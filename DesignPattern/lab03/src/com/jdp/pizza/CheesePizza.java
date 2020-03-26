package com.jdp.pizza;

import com.jdp.ingredientfactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

	private PizzaIngredientFactory factory;
	
	public CheesePizza(PizzaIngredientFactory factory){
		this.factory = factory;
	}
	
	@Override
	public void prepare() {
		this.setDough(factory.createDough());   //为制作该口味类型的Pizza设置Dough原料
		this.setSauce(factory.createSauce());	//为制作该口味类型的Pizza设置Sauce原料
		System.out.println("It is ready!..");
	}

}
