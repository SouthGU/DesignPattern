package com.jdp.concretetemplate;

import com.jdp.abstracttemplate.CaffineBeverageWithHook;
/**
 * 模板方法模式
 * 具体模板角色
 * @author E103-teacher
 *
 */
public class Coffee extends CaffineBeverageWithHook {

	@Override
	public void brew() {
		System.out.println("往杯中放入咖啡...");
	}

	@Override
	public void addCondiments() {
		System.out.println("增加糖和牛奶...");
	}

	//复写Hook方法
	@Override
	public boolean customerWantsCondiments(String temp) {
		if (temp.toLowerCase().startsWith("y")) {
			return true;
		}
		if (temp.toLowerCase().startsWith("n")) {
			return false;
		}
		return false;    
	}
	
}
