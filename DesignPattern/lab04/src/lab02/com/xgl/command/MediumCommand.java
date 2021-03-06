package lab02.com.xgl.command;

import lab02.com.xgl.receiver.CellingFan;

/**
 * 命令模式
 * 具体命令2
 * @author Administrator
 *
 */
public class MediumCommand implements Command {

	private CellingFan fan;    //持有Receiver对象的引用
	private int previousState; //记录Receiver对象速度上一个状态
	
	
	public MediumCommand(CellingFan fan) {
		this.fan = fan;
	}
	
	//执行命令
	@Override
	public void execute() {
		this.previousState = fan.getState();
		fan.medium();  //执行命令
	}

	//撤销命令
	@Override
	public void undo() {
		if (this.previousState == CellingFan.high) {
			fan.high();
		}
		else if (this.previousState == CellingFan.medium) {
			fan.medium();
		}
		else if (this.previousState == CellingFan.low) {
			fan.low();
		}
		else if (this.previousState == CellingFan.off) {
			fan.off();
		}
	}

}
