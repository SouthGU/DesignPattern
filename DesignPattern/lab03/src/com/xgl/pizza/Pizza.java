package com.xgl.pizza;

import com.xgl.ingredientfactory.Dough;
import com.xgl.ingredientfactory.Sauce;

/**
 * 抽象类Pizza
 * @author E103-teacher
 *
 */
public abstract class Pizza {
	private String name;
	private Dough dough;
	private Sauce sauce;
	private double price; //新增属性，pizza的价格
	
	//抽象方法
	public abstract void prepare();
	
	public void bake(){
		System.out.println("It is baking...");
	}
	
	public void cut(){
		System.out.println("It is cutting....");
	}
	
	public void box(){
		System.out.println("It is boxing.....");
	}

	//类的属性的getter()和setter()方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dough getDough() {
		return dough;
	}

	public void setDough(Dough dough) {
		this.dough = dough;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
