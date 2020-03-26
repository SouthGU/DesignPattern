package com.jdp.ingredientfactory;
/**
 * ���󹤳�ģʽ
 * ���幤��1
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
