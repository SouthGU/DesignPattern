package L3.com.jdp.test;

import L3.com.jdp.adapter.TurkeyAndBirdAdapter;
import L3.com.jdp.targetadaptee.Bird;
import L3.com.jdp.targetadaptee.RedHeadBird;
import L3.com.jdp.targetadaptee.Turkey;
import L3.com.jdp.targetadaptee.WildTurkey;



/**
 * ≤‚ ‘≥°æ∞¿‡
 * @author Administrator
 *
 */
public class ClientTest {

	public static void main(String[] args) {
		Turkey turkey = new WildTurkey();
		Bird bird = new RedHeadBird();
		
		TurkeyAndBirdAdapter adapter = new TurkeyAndBirdAdapter(turkey, bird);
		
		Bird bird2 = adapter;
		bird.quack();
		bird.fly();
		bird2.quack();
		bird2.fly();
		
		System.out.println("####################");
		
		Turkey turkey2 = adapter;
		turkey.gobble();
		turkey.fly();
		turkey2.gobble();
		turkey2.fly();
		
		
	}

}
