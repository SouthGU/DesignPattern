package lab03.com.jdp;

public class CookerManager {
	
	public static void cookerManager() {
		Cooker cooker1 = new Cooker("����");
		Cooker cooker2 = new Cooker("����");
		Cooker cooker3 = new Cooker("����");
		Thread thread1 = new Thread(cooker1);
		thread1.start();
		Thread thread2 = new Thread(cooker2);
		thread2.start();
		Thread thread3 = new Thread(cooker3);
		thread3.start();
	}
	
}
