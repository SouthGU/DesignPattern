package lab01.com.jdp.fourth;
/**
 * 单例模式
 * 双重检查加锁
 * @author Administrator
 *
 */
public class Singleton {
	private volatile static Singleton instance;        //私有静态成员（类成员）
	
	private Singleton(){			   		  //私有构造方法
		
	}
	
	public static Singleton getInstance(){    //公有静态方法，提供全局的访问单例对象的唯一入口
		if (instance == null) {
			synchronized (Singleton.class) {  //同步语句块方法
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	public void print(){
		System.out.println("我正在使用单例模式打印东西!...");
	}
	
}
