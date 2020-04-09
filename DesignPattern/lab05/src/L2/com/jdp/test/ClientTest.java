package L2.com.jdp.test;


import L2.com.jdp.adaptee.Bird;
import L2.com.jdp.adaptee.RedHeadBird;
import L2.com.jdp.adapter.BirdAdapter;
import L2.com.jdp.target.Turkey;
import L2.com.jdp.target.WildTurkey;

/**
 * ≤‚ ‘≥°æ∞¿‡
 * @author Administrator
 *
 */
public class ClientTest {

	public static void main(String[] args) {
		Turkey turkey = new WildTurkey();
		Bird bird = new RedHeadBird();
		Turkey turkey2 = new BirdAdapter(bird);
		
		turkey.gobble();
		turkey.fly();
		
		turkey2.gobble();
		turkey2.fly();
		
	}

}
