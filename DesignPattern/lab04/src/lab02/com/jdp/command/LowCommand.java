package lab02.com.jdp.command;

import lab02.com.jdp.receiver.CellingFan;

/**
 * ����ģʽ
 * ��������1
 * @author Administrator
 *
 */
public class LowCommand implements Command {

	private CellingFan fan;    //����Receiver���������
	private int previousState; //��¼Receiver�����ٶ���һ��״̬
	
	
	public LowCommand(CellingFan fan) {
		this.fan = fan;
	}
	
	//ִ������
	@Override
	public void execute() {
		this.previousState = fan.getState();
		fan.low();  //ִ������
	}

	//��������
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
