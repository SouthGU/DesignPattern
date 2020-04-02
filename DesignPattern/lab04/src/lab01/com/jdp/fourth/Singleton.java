package lab01.com.jdp.fourth;
/**
 * ����ģʽ
 * ˫�ؼ�����
 * @author Administrator
 *
 */
public class Singleton {
	private volatile static Singleton instance;        //˽�о�̬��Ա�����Ա��
	
	private Singleton(){			   		  //˽�й��췽��
		
	}
	
	public static Singleton getInstance(){    //���о�̬�������ṩȫ�ֵķ��ʵ��������Ψһ���
		if (instance == null) {
			synchronized (Singleton.class) {  //ͬ�����鷽��
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	public void print(){
		System.out.println("������ʹ�õ���ģʽ��ӡ����!...");
	}
	
}
