package lab03.com.jdp;

public class Waiter {
	
	private Menu menu = new Menu();
	
	public void orderDish(Order order) {
		menu.addOrder(order);
	}
	
	public void newOrderDish() {
		menu.newOrder();
	}
	
	public void call() {
		this.menu.execute();
	}
	
}
