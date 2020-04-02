package lab03.com.jdp;

public class CookerManager {
	
	public static void cookerManager() {
		Cooker cooker1 = new Cooker("张三");
		Cooker cooker2 = new Cooker("李四");
		Cooker cooker3 = new Cooker("王五");
		Thread thread1 = new Thread(cooker1);
		thread1.start();
		Thread thread2 = new Thread(cooker2);
		thread2.start();
		Thread thread3 = new Thread(cooker3);
		thread3.start();
	}
	
}
