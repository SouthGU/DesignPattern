package com.jdp.ingredientfactory;
/**
 * 抽象工厂模式
 * 具体工厂2
 * @author E103-teacher
 *
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

}
