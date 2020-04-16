package L1.com.xgl.third;
/**
 * 单例模式测试场景类
 * @author Administrator
 *
 */
public class SingletonDemo {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.print();

	}

}
