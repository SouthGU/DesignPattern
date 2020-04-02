package lab01.com.jdp.second;
/**
 * 单例模式
 * 饿汉式
 * @author Administrator
 *
 */
public class Singleton {
	private static Singleton instance = new Singleton();        //私有静态成员（类成员）
	
	private Singleton(){			   		  //私有构造方法
		
	}
	
	public static Singleton getInstance(){    //公有静态方法，提供全局的访问单例对象的唯一入口
		return instance;
	}
	
	public void print(){
		System.out.println("2-我正在使用单例模式打印东西!...");
	}
	
}
