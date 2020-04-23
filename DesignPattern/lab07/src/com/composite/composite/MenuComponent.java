package com.composite.composite;
/**
 * 
 * @ClassName: MenuComponent
 * @Description: 组合模式-抽象组件
 * @author zzw
 * @date 2019年6月12日 上午9:55:21
 */
public abstract class MenuComponent {
	public void addComponent(MenuComponent component) {
		System.out.println("对不起, 不支持该方法!");
	}
	
	public void removeComponent(MenuComponent component) {
		System.out.println("对不起, 不支持该方法!");
	}
	
	public MenuComponent getChild(int i) {
		System.out.println("对不起, 不支持该方法!");
		return null;
	}
	
	public abstract void operation();
}
