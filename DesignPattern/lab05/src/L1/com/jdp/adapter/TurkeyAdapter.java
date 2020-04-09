package L1.com.jdp.adapter;

import L1.com.jdp.adaptee.Turkey;
import L1.com.jdp.target.Bird;

/**
 * 适配器模式
 * 适配器角色
 * 火鸡对象冒充（适配）飞鸟对象
 * @author Administrator
 *
 */
public class TurkeyAdapter implements Bird {

	//1实现目标接口
	//2持有被适配者的对象的引用
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
