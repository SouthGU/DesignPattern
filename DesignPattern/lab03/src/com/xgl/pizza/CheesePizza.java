package com.xgl.pizza;

import com.xgl.ingredientfactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

	private PizzaIngredientFactory factory;
	
	public CheesePizza(PizzaIngredientFactory factory){
		this.factory = factory;
	}
	
	@Override
	public void prepare() {
		this.setDough(factory.createDough());   //Ϊ�����ÿ�ζ���͵�Pizza����Doughԭ��
		this.setSauce(factory.createSauce());	//Ϊ�����ÿ�ζ���͵�Pizza����Sauceԭ��
		System.out.println("��ʼ");
	}

}