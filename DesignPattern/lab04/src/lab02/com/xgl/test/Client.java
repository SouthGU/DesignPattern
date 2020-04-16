package lab02.com.xgl.test;


import lab02.com.xgl.command.*;
import lab02.com.xgl.invoker.RemoteControl;
import lab02.com.xgl.receiver.CellingFan;


public class Client {

	public static void main(String[] args) {
		CellingFan fan = new CellingFan();
		Command highCommand = new HighCommand(fan);
		Command mediumCommand = new MediumCommand(fan);
		Command lowCommand = new LowCommand(fan);
		Command offCommand = new OffCommand(fan);
		
		RemoteControl control = new RemoteControl();

		control.setCommand(highCommand);
		control.go();

		control.setCommand(mediumCommand);
		control.go();
		//��������Ϊ����
		control.setCommand(lowCommand);
		control.go();
		//��������Ϊ�ر�
		control.setCommand(offCommand);
		control.go();
		//�������������һ��״̬
		control.back();
		
	}

}
