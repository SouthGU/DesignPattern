package lab02.com.jdp.receiver;
/**
 * 命令模式
 * Receiver角色
 * @author Administrator
 *
 */
public class CellingFan {
	public static final int high = 3;
	public static final int medium = 2;
	public static final int low = 1;
	public static final int off = 0;
	
	private int state;  //记录当前对象的状态值
	
	public CellingFan(){
		this.state = CellingFan.off;  //初始化默认状态为关闭
	}

	//关于state状态值得getter和setter方法
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	public void high(){
		this.state = CellingFan.high;
		System.out.println("风扇速度此时为高速");
	}
	
	public void medium(){
		this.state = CellingFan.medium;
		System.out.println("风扇速度此时为中速");
	}
	
	public void low(){
		this.state = CellingFan.low;
		System.out.println("风扇速度此时为低速");
	}
	
	public void off(){
		this.state = CellingFan.off;
		System.out.println("风扇速度此时为关闭");
	}
	
}
