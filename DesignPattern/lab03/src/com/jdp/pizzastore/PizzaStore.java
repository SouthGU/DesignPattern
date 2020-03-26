package com.jdp.pizzastore;

import com.jdp.pizza.Pizza;

/**
 * ��������ģʽ
 * �����߽�ɫ
 * @author E103-teacher
 *
 */
public abstract class PizzaStore {
	public Pizza orderPizza(String type){
		Pizza pizza = null;
		pizza = createPizza(type);  //��������
		pizza.prepare();   //׼��
		pizza.bake();      //�濾
		pizza.cut();       //��Ƭ
		pizza.box();       //װ��
		
		return pizza;      //���ؾ���Pizza�Ĳ�Ʒ����
	}
	
	//��������(���󷽷�)
	public abstract Pizza createPizza(String type);
}
