package com.jdp.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.jdp.abstracttemplate.CaffineBeverageWithHook;
import com.jdp.concretetemplate.Coffee;
import com.jdp.concretetemplate.Tea;

/**
 * �˵���
 * @author E103-teacher
 *
 */
public class Menu {
	public static void order(){
		String temp = null;
		String query = null;
		CaffineBeverageWithHook beverage = null;
		System.out.println("��ѡ��C(Coffee)����T(Tea): ");
		//��ȡ�û�����
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			temp = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (temp.toLowerCase().startsWith("c")) {
			beverage = new Coffee();
		}
		else if (temp.toLowerCase().startsWith("t")) {
			beverage = new Tea();
		}
		System.out.println("Object����������...");
		System.out.println("��ѡ���Ƿ���ӵ���,Y(Yes) or N(No): ");
		//�ٴλ�ȡ�û�����
		BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
		try {
			query = reader2.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		beverage.preparerecipe(query);
		
	}
}
