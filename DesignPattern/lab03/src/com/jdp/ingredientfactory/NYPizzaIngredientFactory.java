package com.jdp.ingredientfactory;
/**
 * 抽象工厂模式
 * 具体工厂1
 * @author E103-teacher
 *
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

}
