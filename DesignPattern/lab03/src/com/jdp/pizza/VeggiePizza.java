package com.jdp.pizza;

import com.jdp.ingredientfactory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {

	private PizzaIngredientFactory factory;
	
	public VeggiePizza(PizzaIngredientFactory factory){
		this.factory = factory;
	}
	
	@Override
	public void prepare() {
		this.setDough(factory.createDough());   //Ϊ�����ÿ�ζ���͵�Pizza����Doughԭ��
		this.setSauce(factory.createSauce());	//Ϊ�����ÿ�ζ���͵�Pizza����Sauceԭ��
		System.out.println("It is ready!..");
	}

}
