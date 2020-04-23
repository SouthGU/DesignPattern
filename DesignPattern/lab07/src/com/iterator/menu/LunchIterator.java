package com.iterator.menu;

import java.util.Iterator;

import com.composite.composite.MenuComponent;
/**
 * 
 * @ClassName: LunchIterator
 * @Description: 迭代器模式-具体迭代器对象
 * @author zzw
 * @date 2019年6月13日 上午11:08:01
 */
public class LunchIterator implements Iterator {
	private MenuComponent[] array = null;
	private int cursor = 0;
	
	public LunchIterator(MenuComponent[] array) {
		super();
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		if (cursor >= array.length || array[cursor] == null) {
			return false;
		}
		return true;
	}

	@Override
	public MenuComponent next() {
		return array[cursor++];
	}

}
