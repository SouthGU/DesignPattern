package com.jdp.ingredientfactory;
/**
 * 抽象工厂模式
 * 抽象工厂
 * @author E103-teacher
 *
 */
public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
}
