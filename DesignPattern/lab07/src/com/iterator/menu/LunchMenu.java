package com.iterator.menu;

import java.util.Iterator;

import com.composite.composite.MenuComponent;

/**
 * 
 * @ClassName: LunchMenu
 * @Description: 午餐菜单
 * @author zzw
 * @date 2019年6月12日 上午10:21:48
 */
public class LunchMenu extends MenuComponent implements Menu{
	private MenuComponent[] array = new MenuComponent[6];  //数组对象，默认最多存储6个对象
	private int index = 0;
	/**
	 * 无参构造函数
	 */
	public LunchMenu() {
		
	}

	public MenuComponent[] getArray() {
		return array;
	}

	public int getIndex() {
		return index;
	}

	@Override
	public Iterator createIterator() {
		// 返回自定义的迭代器对象
		return new LunchIterator(array);
	}
	
	@Override
	public void addComponent(MenuComponent component) {
		array[index++] = component;
	}
	
	@Override
	public void removeComponent(MenuComponent component) {
		int cursor = 0;
		for (int i = 0; i < array.length; i++) {
			if (component == array[i]) {
				cursor = i;
			}
		}
		for (int i = cursor; i < array.length - 1; i++) {
			array[i] = array[i+1];
		}
		array[array.length - 1] = null;
	}
	
	@Override
	public MenuComponent getChild(int i) {
		return array[i];
	}
	
	@Override
	public void operation() {
		System.out.println("#####午餐#####");
		Iterator iterator = createIterator();
		while (iterator.hasNext()) {
			MenuComponent object = (MenuComponent) iterator.next();
			object.operation();
		}
	}

}
