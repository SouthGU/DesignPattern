package lab03.com.xgl;

public class Chicken extends Order {
	
	private Cooker cooker = null;
	private int tableNumber;
	
	public Chicken(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	@Override
	public void execute() {
		cooker.cook(tableNumber, "��ǰ���");
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
