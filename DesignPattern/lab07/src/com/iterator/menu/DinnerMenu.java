package com.iterator.menu;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import com.composite.composite.MenuComponent;
import com.composite.leaf.MenuItem;

/**
 * 
 * @ClassName: DinnerMenu
 * @Description: 晚餐菜单
 * @author zzw
 * @date 2019年6月12日 上午10:21:48
 */
public class DinnerMenu extends MenuComponent implements Menu{
	private Hashtable table = new Hashtable<>();
	private int index = 0;
	/**
	 * 无参构造函数
	 */
	public DinnerMenu() {
	}

	public Hashtable getTable() {
		return table;
	}

	@Override
	public Iterator createIterator() {
		// 使用Hashtable对象自带的values().iterator()方法返回迭代器对象
		return this.table.values().iterator();
	}
	
	public void addComponent(MenuComponent component) {
		table.put(index, component);
		index++;
	}
	
	public void removeComponent(MenuComponent component) {
		table.remove(null);
	}
	
	public MenuComponent getChild(int i) {
		return null;
	}
	
	public void operation() {
		System.out.println("=====晚餐=====");
		Iterator iterator = createIterator();
		while (iterator.hasNext()) {
			MenuComponent object = (MenuComponent) iterator.next();
			object.operation();
		}
	}

}
