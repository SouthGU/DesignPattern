package lab02.com.jdp.receiver;
/**
 * ����ģʽ
 * Receiver��ɫ
 * @author Administrator
 *
 */
public class CellingFan {
	public static final int high = 3;
	public static final int medium = 2;
	public static final int low = 1;
	public static final int off = 0;
	
	private int state;  //��¼��ǰ�����״ֵ̬
	
	public CellingFan(){
		this.state = CellingFan.off;  //��ʼ��Ĭ��״̬Ϊ�ر�
	}

	//����state״ֵ̬��getter��setter����
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	public void high(){
		this.state = CellingFan.high;
		System.out.println("�����ٶȴ�ʱΪ����");
	}
	
	public void medium(){
		this.state = CellingFan.medium;
		System.out.println("�����ٶȴ�ʱΪ����");
	}
	
	public void low(){
		this.state = CellingFan.low;
		System.out.println("�����ٶȴ�ʱΪ����");
	}
	
	public void off(){
		this.state = CellingFan.off;
		System.out.println("�����ٶȴ�ʱΪ�ر�");
	}
	
}
