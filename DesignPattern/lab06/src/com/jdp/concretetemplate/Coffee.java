package com.jdp.concretetemplate;

import com.jdp.abstracttemplate.CaffineBeverageWithHook;
/**
 * ģ�巽��ģʽ
 * ����ģ���ɫ
 * @author E103-teacher
 *
 */
public class Coffee extends CaffineBeverageWithHook {

	@Override
	public void brew() {
		System.out.println("�����з��뿧��...");
	}

	@Override
	public void addCondiments() {
		System.out.println("�����Ǻ�ţ��...");
	}

	//��дHook����
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
