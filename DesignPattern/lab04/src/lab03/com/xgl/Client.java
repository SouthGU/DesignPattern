package lab03.com.xgl;

public class Client {
	
	public static void main(String[] args) {
		CookerManager.cookerManager();
		Waiter waiter = new Waiter();
		
		Order roastDuck = new RoastDuck(1);
		Order chicken = new Chicken(1);
		waiter.orderDish(chicken);
		waiter.orderDish(roastDuck);
		waiter.call();
		waiter.newOrderDish();
		
		Order mungBean = new MungBean(2);
		waiter.orderDish(mungBean);
		waiter.call();
		waiter.newOrderDish();

		Order mungBean1 = new MungBean(3);
		Order roastDuck1 = new RoastDuck(3);
		waiter.orderDish(mungBean1);
		waiter.orderDish(roastDuck1);
		waiter.call();
		waiter.newOrderDish();
		
		Order fish = new Fish(4);
		waiter.orderDish(fish);
		waiter.call();
		waiter.newOrderDish();
	}
	
}
