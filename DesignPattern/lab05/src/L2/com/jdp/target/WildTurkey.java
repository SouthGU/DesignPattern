package L2.com.jdp.target;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("gobble,gobble,gobble...");
	}

	@Override
	public void fly() {
		System.out.println("I am flying a short distance!");
	}

}
