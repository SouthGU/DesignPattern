package L2.com.jdp.adapter;


import L2.com.jdp.adaptee.Bird;
import L2.com.jdp.target.Turkey;

/**
 * 适配器模式
 * 适配器角色
 * 飞鸟对象冒充（适配）火鸡对象
 * @author Administrator
 *
 */
public class BirdAdapter implements Turkey {

	//1实现目标接口
	//2持有被适配者的对象的引用
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
