package lab01.com.jdp.second;
/**
 * ����ģʽ
 * ����ʽ
 * @author Administrator
 *
 */
public class Singleton {
	private static Singleton instance = new Singleton();        //˽�о�̬��Ա�����Ա��
	
	private Singleton(){			   		  //˽�й��췽��
		
	}
	
	public static Singleton getInstance(){    //���о�̬�������ṩȫ�ֵķ��ʵ��������Ψһ���
		return instance;
	}
	
	public void print(){
		System.out.println("2-������ʹ�õ���ģʽ��ӡ����!...");
	}
	
}
