package lab01.com.jdp.third;
/**
 * 单例模式
 * 同步方法
 * @author Administrator
 *
 */
public class Singleton {
	private static Singleton instance;        //私有静态成员（类成员）
	
	private Singleton(){			   		  //私有构造方法
		
	}
	
	public synchronized static Singleton getInstance(){    //公有静态同步方法，提供全局的访问单例对象的唯一入口
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void print(){
		System.out.println("3-我正在使用单例模式打印东西!...");
	}
	
}
