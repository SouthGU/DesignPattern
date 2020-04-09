package L3.com.jdp.adapter;

import L3.com.jdp.targetadaptee.Bird;
import L3.com.jdp.targetadaptee.Turkey;
/**
 * 适配器模式
 * 适配器角色
 * 火鸡对象和飞鸟对象相互冒充（适配）
 * @author Administrator
 *
 */
public class TurkeyAndBirdAdapter implements Turkey,Bird {

	//1实现目标接口
	//2持有被适配者的对象的引用
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
