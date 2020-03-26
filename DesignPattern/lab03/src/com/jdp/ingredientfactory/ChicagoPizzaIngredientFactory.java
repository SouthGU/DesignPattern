package com.jdp.ingredientfactory;
/**
 * ���󹤳�ģʽ
 * ���幤��2
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
