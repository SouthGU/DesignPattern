package lab03.com.xgl;

public class Fish extends Order {
	
	private Cooker cooker = null;
	private int tableNumber;
	
	public Fish(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	@Override
	public void execute() {
		cooker.cook(tableNumber, "ˮ����");
	}

	@Override
	public void setCooker(Cooker cooker) {
		this.cooker = cooker;
	}

	@Override
	public int getTableNumber() {
		return tableNumber;
	}

}
