package com.jdp.ingredientfactory;
/**
 * ���󹤳�ģʽ
 * �������幤��1
 * @author E103-teacher
 *
 */
public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new VeryThinCrustDough();  //�����������
	}

	@Override
	public Sauce createSauce() {
		return new BruschettaSauce();     //������������
	}

}
