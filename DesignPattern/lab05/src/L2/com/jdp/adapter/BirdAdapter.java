package L2.com.jdp.adapter;


import L2.com.jdp.adaptee.Bird;
import L2.com.jdp.target.Turkey;

/**
 * ������ģʽ
 * ��������ɫ
 * �������ð�䣨���䣩�𼦶���
 * @author Administrator
 *
 */
public class BirdAdapter implements Turkey {

	//1ʵ��Ŀ��ӿ�
	//2���б������ߵĶ��������
	private Bird bird;
	
	public BirdAdapter(Bird bird) {
		this.bird = bird;
	}
	
	@Override
	public void gobble() {
		this.bird.quack();
	}

	@Override
	public void fly() {
		this.bird.fly();
	}

}
