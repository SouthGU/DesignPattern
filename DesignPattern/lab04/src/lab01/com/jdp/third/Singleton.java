package lab01.com.jdp.third;
/**
 * ����ģʽ
 * ͬ������
 * @author Administrator
 *
 */
public class Singleton {
	private static Singleton instance;        //˽�о�̬��Ա�����Ա��
	
	private Singleton(){			   		  //˽�й��췽��
		
	}
	
	public synchronized static Singleton getInstance(){    //���о�̬ͬ���������ṩȫ�ֵķ��ʵ��������Ψһ���
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void print(){
		System.out.println("3-������ʹ�õ���ģʽ��ӡ����!...");
	}
	
}
