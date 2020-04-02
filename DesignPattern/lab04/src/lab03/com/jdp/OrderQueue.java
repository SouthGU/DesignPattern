package lab03.com.jdp;

import java.util.ArrayList;
import java.util.List;

public class OrderQueue {
	
	private static List<Order> orders = new ArrayList<Order>();
	
	public synchronized static void addMenu(Menu menu) {
		for(Order order : menu.getOrders()) {
			orders.add(order);
		}
	}
	
	public synchronized static Order getOrder() {
		Order order = null;
		if(orders.size() > 0) {
			order = orders.get(0);
			orders.remove(0);
		}
		return order;
	}
	
}
