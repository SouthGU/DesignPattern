package L1.com.jdp.target;

public class RedHeadBird implements Bird {

	@Override
	public void quack() {
		System.out.println("quack,quack,quack...");
	}

	@Override
	public void fly() {
		System.out.println("I am flying a long distance!");
	}

}
