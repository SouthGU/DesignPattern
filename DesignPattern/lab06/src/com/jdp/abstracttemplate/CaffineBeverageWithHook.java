package com.jdp.abstracttemplate;
/**
 * ģ�巽��ģʽ
 * ����ģ���ɫ
 * @author E103-teacher
 *
 */
public abstract class CaffineBeverageWithHook {
	//ģ�巽��,һ����final�ؼ������Σ���ֹ����̳б�����
	public final void preparerecipe(String temp){
		boilWater();
		brew();
		pourIntoCup();
		if(customerWantsCondiments(temp)){
			addCondiments();
		}
	}

	private void boilWater() {
		System.out.println("������ˮ...");
	}

	private void pourIntoCup() {
		System.out.println("����ˮ���뱭��...");
	}

	public abstract void brew();  			//���󷽷�
	public abstract void addCondiments();   //���󷽷�
	
	//Hook������Ĭ��
	public boolean customerWantsCondiments(String temp) {
		return false;    
	}
}
