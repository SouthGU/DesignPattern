package L1.com.jdp.adaptee;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("gobble,gobble,gobble...");
	}

	@Override
	public void fly() {
		System.out.println("I am flying a short distance!");
		System.out.println("-----------------------------!");
		System.out.println("----------µÚÒ»Ìâ----------!");
	}

}
