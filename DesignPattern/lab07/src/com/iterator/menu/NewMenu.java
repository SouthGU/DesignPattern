package com.iterator.menu;

import java.util.ArrayList;
import java.util.Iterator;

import com.composite.composite.MenuComponent;
import com.composite.leaf.MenuItem;

/**
 * 
 * @ClassName: NewMenu
 * @Description: 合并后的新菜单
 * @author zzw
 * @date 2019年6月12日 上午10:22:26
 */
public class NewMenu extends MenuComponent {
	private ArrayList list = new ArrayList<>();
	
	/**
	 * 无参构造函数
	 */
	public NewMenu() {
		
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
	
	public void operation() {
		System.out.println("#####新菜单#####");
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			MenuComponent object = (MenuComponent) iterator.next();
			object.operation();
		}
	}

}
