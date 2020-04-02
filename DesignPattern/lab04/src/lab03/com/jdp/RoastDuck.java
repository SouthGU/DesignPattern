package lab03.com.jdp;

public class RoastDuck extends Order {
	
	private Cooker cooker = null;
	private int tableNumber;
	
	public RoastDuck(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	@Override
	public void execute() {
		cooker.cook(tableNumber, "±±¾©¿¾Ñ¼");
	}

	@Override
	public void setCooker(Cooker cooker) {
		this.cooker = cooker;
	}

	@Override
	public int getTableNumber() {
		return this.tableNumber;
	}
	
}
