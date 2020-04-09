package L3.com.jdp.adapter;

import L3.com.jdp.targetadaptee.Bird;
import L3.com.jdp.targetadaptee.Turkey;
/**
 * ������ģʽ
 * ��������ɫ
 * �𼦶���ͷ�������໥ð�䣨���䣩
 * @author Administrator
 *
 */
public class TurkeyAndBirdAdapter implements Turkey,Bird {

	//1ʵ��Ŀ��ӿ�
	//2���б������ߵĶ��������
	private Turkey turkey;
	private Bird bird;
	
	public TurkeyAndBirdAdapter(Turkey turkey, Bird bird){
		this.turkey = turkey;
		this.bird = bird;
	}

	@Override
	public void quack() {
		this.turkey.gobble();
	}

	@Override
	public void gobble() {
		this.bird.quack();
	}

	@Override
	public void fly() {
		//this.fly();   //Exception in thread "main" java.lang.StackOverflowError
		if (this instanceof Turkey) {
			this.bird.fly();
		}
		if (this instanceof Bird) {
			this.turkey.fly();
		}
	}
	
	
	

}
