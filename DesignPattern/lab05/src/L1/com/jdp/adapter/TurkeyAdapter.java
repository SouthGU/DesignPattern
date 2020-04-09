package L1.com.jdp.adapter;

import L1.com.jdp.adaptee.Turkey;
import L1.com.jdp.target.Bird;

/**
 * ������ģʽ
 * ��������ɫ
 * �𼦶���ð�䣨���䣩�������
 * @author Administrator
 *
 */
public class TurkeyAdapter implements Bird {

	//1ʵ��Ŀ��ӿ�
	//2���б������ߵĶ��������
	private Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	
	@Override
	public void quack() {
		this.turkey.gobble();
	}

	@Override
	public void fly() {
		this.turkey.fly();
	}

}
