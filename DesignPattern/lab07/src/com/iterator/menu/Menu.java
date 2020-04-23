package com.iterator.menu;
/**
 * 
 * @ClassName: Menu
 * @Description: 工厂方法模式
 * @author zzw
 * @date 2019年6月12日 上午10:09:49
 */

import java.util.Iterator;
/**
 * 
 * @ClassName: Menu
 * @Description: 返回迭代器对象
 * @author zzw
 * @date 2019年6月13日 上午11:02:32
 */
public interface Menu {
	public Iterator createIterator();
}
