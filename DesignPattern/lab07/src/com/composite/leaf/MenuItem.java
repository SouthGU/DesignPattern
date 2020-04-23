package com.composite.leaf;

import com.composite.composite.MenuComponent;

/**
 * 
 * @ClassName: MenuItem
 * @Description: 组合模式-叶子节点
 * @author zzw
 * @date 2019年6月12日 上午9:46:30
 */
public class MenuItem extends MenuComponent{
	private String itemName;         // 菜品名称
	private String itemDescription;  // 菜品描述
	private boolean isVegetarian;    // 是否素食
	private double price;            // 菜品价格
	
	/**
	 * 构造函数
	 * @param itemName 菜品名称
	 * @param itemDescription 菜品描述
	 * @param isVegetarian 是否素食
	 * @param price 菜品价格
	 */
	public MenuItem(String itemName, String itemDescription, boolean isVegetarian, double price) {
		super();
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.isVegetarian = isVegetarian;
		this.price = price;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public boolean isVegetarian() {
		return isVegetarian;
	}
	public void setVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * 
	 * @Title: operation
	 * @Description: 打印叶子节点信息
	 * @param     
	 * @return void   
	 * @throws
	 */
	@Override
	public void operation() {
		System.out.println(this.getItemName() + "\n" +
						   this.getItemDescription());
		if (isVegetarian) { // 判断是否是素食
			System.out.println("v");
		}
		System.out.println(this.getPrice());
	}
	
}
