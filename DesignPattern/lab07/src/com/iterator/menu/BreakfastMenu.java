package com.iterator.menu;

import java.util.ArrayList;
import java.util.Iterator;

import com.composite.composite.MenuComponent;
/**
 * 
 * @ClassName: BreakfastMenu
 * @Description: 早餐菜单
 * @author zzw
 * @date 2019年6月12日 上午10:18:54
 */
public class BreakfastMenu extends MenuComponent {
	private ArrayList list = new ArrayList<>();
	
	/**
	 * 无参构造函数
	 */
	public BreakfastMenu() {
		
	}

	public ArrayList getList() {
		return list;
	}
	
	public void addComponent(MenuComponent component) {
		list.add(component);
	}
	
	public void removeComponent(MenuComponent component) {
		list.remove(component);
	}
	
	public MenuComponent getChild(int i) {
		return (MenuComponent) list.get(i);
	}
	
	@Override
	public void operation() {
		System.out.println("=====早餐=====");
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			MenuComponent object = (MenuComponent) iterator.next();
			object.operation();
		}
	}

}
