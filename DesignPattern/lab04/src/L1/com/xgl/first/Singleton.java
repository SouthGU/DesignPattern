package L1.com.xgl.first;
/**
 * ����ģʽ
 * ����ʽ
 * @author Administrator
 *
 */
public class Singleton {
	private static Singleton instance;        //˽�о�̬��Ա�����Ա��
	
	private Singleton(){			   		  //˽�й��췽��
		
	}
	
	public static Singleton getInstance(){    //���о�̬�������ṩȫ�ֵķ��ʵ��������Ψһ���
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void print(){
		System.out.println("������ʹ�õ���ģʽ��ӡ����!...");
	}
	
}

