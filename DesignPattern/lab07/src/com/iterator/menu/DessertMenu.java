package com.iterator.menu;

import java.util.ArrayList;
import java.util.Iterator;

import com.composite.composite.MenuComponent;
/**
 * 
 * @ClassName: DessertMenu
 * @Description: 甜点菜单
 * @author zzw
 * @date 2019年6月12日 上午10:18:54
 */
public class DessertMenu extends MenuComponent {
	private ArrayList list = new ArrayList<>();
	
	/**
	 * 无参构造函数
	 */
	public DessertMenu() {
		
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
		// TODO Auto-generated method stub
		System.out.println("#####甜点#####");
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			MenuComponent object = (MenuComponent) iterator.next();
			object.operation();
		}
	}

}
