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
 * @Description: 迭代器模式和组合模式-应用程序执行入口
 * @author zzw
 * @date 2019年6月13日 上午10:51:47
 */
public class IteratorAndCompositePatternTest {

	public static void main(String[] args) {
		BreakfastMenu breakfastMenu = new BreakfastMenu(); // 早餐
		LunchMenu lunchMenu = new LunchMenu();             // 午餐
		DinnerMenu dinnerMenu = new DinnerMenu();          // 晚餐
		DessertMenu dessertMenu = new DessertMenu();       // 甜点
		// 早餐设置菜品
		breakfastMenu.addComponent(new MenuItem("鸡蛋", "egg", false, 2.0));
		breakfastMenu.addComponent(new MenuItem("豆浆", "Soy milk", true, 2.5));
		breakfastMenu.addComponent(new MenuItem("牛奶", "milk", false, 3.5));
		breakfastMenu.addComponent(new MenuItem("面包", "bread", true, 2.0));
		// 晚餐设置菜品
		dinnerMenu.addComponent(new MenuItem("牛肉面", "beef noodle", false, 10.0));
		dinnerMenu.addComponent(new MenuItem("素面", "vegetarian noodle", true, 6.0));
		dinnerMenu.addComponent(new MenuItem("水果沙拉", "fruit salad", true, 8.0));
		dinnerMenu.addComponent(new MenuItem("炒饭", "fried rice", true, 12.0));
		// 甜点设置菜品
		dessertMenu.addComponent(new MenuItem("蜜饯", "candy", true, 5.0));
		dessertMenu.addComponent(new MenuItem("甜点", "dessert", true, 8.0));
		// 午餐设置菜品
		lunchMenu.addComponent(new MenuItem("牛肉面", "beef noodle", false, 10.0));
		lunchMenu.addComponent(dessertMenu);
		lunchMenu.addComponent(new MenuItem("炒饭", "fried rice", true, 12.0));
		
		NewMenu menu = new NewMenu();                      // 合并后的新菜单
		menu.addComponent(breakfastMenu);				   // 加入早、中、晚餐菜品
		menu.addComponent(lunchMenu);
		menu.addComponent(dinnerMenu);
		menu.operation();	
	}
}
