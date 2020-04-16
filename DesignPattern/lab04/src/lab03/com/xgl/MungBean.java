package lab03.com.xgl;

public class MungBean extends Order {
	
	private Cooker cooker = null;
	private int tableNumber;
	
	public MungBean(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	@Override
	public void execute() {
		cooker.cook(tableNumber, "ÂÌ¶¹ÅÅ¹ÇìÒ");
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
