package com.jdp.abstracttemplate;
/**
 * 模板方法模式
 * 抽象模板角色
 * @author E103-teacher
 *
 */
public abstract class CaffineBeverageWithHook {
	//模板方法,一般用final关键词修饰，防止子类继承被覆盖
	public final void preparerecipe(String temp){
		boilWater();
		brew();
		pourIntoCup();
		if(customerWantsCondiments(temp)){
			addCondiments();
		}
	}

	private void boilWater() {
		System.out.println("正在煮开水...");
	}

	private void pourIntoCup() {
		System.out.println("把热水倒入杯中...");
	}

	public abstract void brew();  			//抽象方法
	public abstract void addCondiments();   //抽象方法
	
	//Hook方法，默认
	public boolean customerWantsCondiments(String temp) {
		return false;    
	}
}
