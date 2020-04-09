package L1.com.jdp.test;


import L1.com.jdp.adaptee.Turkey;
import L1.com.jdp.adaptee.WildTurkey;
import L1.com.jdp.adapter.TurkeyAdapter;
import L1.com.jdp.target.Bird;
import L1.com.jdp.target.RedHeadBird;

/**
 * ≤‚ ‘≥°æ∞¿‡
 * @author Administrator
 *
 */
public class ClientTest {

	public static void main(String[] args) {
		Turkey turkey = new WildTurkey();
		Bird bird = new RedHeadBird();
		Bird bird2 = new TurkeyAdapter(turkey);
		
		bird.quack();
		bird.fly();
		
		bird2.quack();
		bird2.fly();
		
	}

}
