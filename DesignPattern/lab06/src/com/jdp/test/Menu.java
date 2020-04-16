package com.jdp.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.jdp.abstracttemplate.CaffineBeverageWithHook;
import com.jdp.concretetemplate.Coffee;
import com.jdp.concretetemplate.Tea;

/**
 * 菜单类
 * @author E103-teacher
 *
 */
public class Menu {
	public static void order(){
		String temp = null;
		String query = null;
		CaffineBeverageWithHook beverage = null;
		System.out.println("请选择C(Coffee)还是T(Tea): ");
		//获取用户输入
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
		System.out.println("Object对象已生成...");
		System.out.println("请选择是否添加调料,Y(Yes) or N(No): ");
		//再次获取用户输入
		BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
		try {
			query = reader2.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		beverage.preparerecipe(query);
		
	}
}
