package lab03.com.jdp;

public class Cooker implements Runnable {
	
	private String cookerName;
	
	public Cooker(String cookerName) {
		this.cookerName = cookerName;
	}
	
	public void cook(int tableNumber, String name) {
		System.out.println(this.cookerName + "厨师正在为" + tableNumber + "号桌做" + name);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(tableNumber + "号桌 " + name + "完成");
	}

	@Override
	public void run() {
		while(true) {
			Order order = OrderQueue.getOrder();
			if(order != null) {
				order.setCooker(this);
				order.execute();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
