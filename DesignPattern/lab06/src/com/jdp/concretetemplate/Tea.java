package com.jdp.concretetemplate;

import com.jdp.abstracttemplate.CaffineBeverageWithHook;
/**
 * ģ�巽��ģʽ
 * ����ģ���ɫ
 * @author E103-teacher
 *
 */
public class Tea extends CaffineBeverageWithHook {

	@Override
	public void brew() {
		System.out.println("�����з����Ҷ...");
	}

	@Override
	public void addCondiments() {
		System.out.println("��������Ƭ...");
	}
	
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
