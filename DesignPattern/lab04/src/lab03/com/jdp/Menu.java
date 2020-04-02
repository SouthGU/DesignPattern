package lab03.com.jdp;

import java.util.ArrayList;
import java.util.List;

public class Menu extends Order {
	
	private List<Order> orders = new ArrayList<Order>();
	
	public void addOrder(Order order) {
		orders.add(order);
	}
	
	public void newOrder() {
		orders.clear();
	}

	@Override
	public void execute() {
		OrderQueue.addMenu(this);
	}

	@Override
	public void setCooker(Cooker cooker) {}

	@Override
	public int getTableNumber() {
		return 0;
	}
	
	public List<Order> getOrders(){
		return this.orders;
	}

}
