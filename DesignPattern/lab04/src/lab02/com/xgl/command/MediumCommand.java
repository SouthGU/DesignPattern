package lab02.com.xgl.command;

import lab02.com.xgl.receiver.CellingFan;

/**
 * ����ģʽ
 * ��������2
 * @author Administrator
 *
 */
public class MediumCommand implements Command {

	private CellingFan fan;    //����Receiver���������
	private int previousState; //��¼Receiver�����ٶ���һ��״̬
	
	
	public MediumCommand(CellingFan fan) {
		this.fan = fan;
	}
	
	//ִ������
	@Override
	public void execute() {
		this.previousState = fan.getState();
		fan.medium();  //ִ������
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
