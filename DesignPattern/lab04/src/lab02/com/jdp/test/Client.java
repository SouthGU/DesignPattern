package lab02.com.jdp.test;


import lab02.com.jdp.command.*;
import lab02.com.jdp.invoker.RemoteControl;
import lab02.com.jdp.receiver.CellingFan;

/**
 * ���Գ�����
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		CellingFan fan = new CellingFan();   	          //�½�Receiver����
		Command highCommand = new HighCommand(fan);       //�½������������
		Command mediumCommand = new MediumCommand(fan);   //�½������������
		Command lowCommand = new LowCommand(fan);         //�½������������
		Command offCommand = new OffCommand(fan);         //�½������������
		
		RemoteControl control = new RemoteControl();  //�½�RemoteControl����
		
		//��������Ϊ����
		control.setCommand(highCommand);
		control.go();
		//��������Ϊ����
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
