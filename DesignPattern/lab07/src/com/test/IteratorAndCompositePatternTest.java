package com.test;

import com.composite.leaf.MenuItem;
import com.iterator.menu.BreakfastMenu;
import com.iterator.menu.DessertMenu;
import com.iterator.menu.DinnerMenu;
import com.iterator.menu.LunchMenu;
import com.iterator.menu.NewMenu;

/**
 * 
 * @ClassName: IteratorAndCompositePatternTest
 * @Description: ������ģʽ�����ģʽ-Ӧ�ó���ִ�����
 * @author zzw
 * @date 2019��6��13�� ����10:51:47
 */
public class IteratorAndCompositePatternTest {

	public static void main(String[] args) {
		BreakfastMenu breakfastMenu = new BreakfastMenu(); // ���
		LunchMenu lunchMenu = new LunchMenu();             // ���
		DinnerMenu dinnerMenu = new DinnerMenu();          // ���
		DessertMenu dessertMenu = new DessertMenu();       // ���
		// ������ò�Ʒ
		breakfastMenu.addComponent(new MenuItem("����", "egg", false, 2.0));
		breakfastMenu.addComponent(new MenuItem("����", "Soy milk", true, 2.5));
		breakfastMenu.addComponent(new MenuItem("ţ��", "milk", false, 3.5));
		breakfastMenu.addComponent(new MenuItem("���", "bread", true, 2.0));
		// ������ò�Ʒ
		dinnerMenu.addComponent(new MenuItem("ţ����", "beef noodle", false, 10.0));
		dinnerMenu.addComponent(new MenuItem("����", "vegetarian noodle", true, 6.0));
		dinnerMenu.addComponent(new MenuItem("ˮ��ɳ��", "fruit salad", true, 8.0));
		dinnerMenu.addComponent(new MenuItem("����", "fried rice", true, 12.0));
		// ������ò�Ʒ
		dessertMenu.addComponent(new MenuItem("�۽�", "candy", true, 5.0));
		dessertMenu.addComponent(new MenuItem("���", "dessert", true, 8.0));
		// ������ò�Ʒ
		lunchMenu.addComponent(new MenuItem("ţ����", "beef noodle", false, 10.0));
		lunchMenu.addComponent(dessertMenu);
		lunchMenu.addComponent(new MenuItem("����", "fried rice", true, 12.0));
		
		NewMenu menu = new NewMenu();                      // �ϲ�����²˵�
		menu.addComponent(breakfastMenu);				   // �����硢�С���Ͳ�Ʒ
		menu.addComponent(lunchMenu);
		menu.addComponent(dinnerMenu);
		menu.operation();	
	}
}
