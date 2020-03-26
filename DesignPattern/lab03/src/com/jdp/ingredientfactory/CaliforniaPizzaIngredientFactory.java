package com.jdp.ingredientfactory;
/**
 * 抽象工厂模式
 * 新增具体工厂1
 * @author E103-teacher
 *
 */
public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new VeryThinCrustDough();  //新增面粉类型
	}

	@Override
	public Sauce createSauce() {
		return new BruschettaSauce();     //新增酱料类型
	}

}
