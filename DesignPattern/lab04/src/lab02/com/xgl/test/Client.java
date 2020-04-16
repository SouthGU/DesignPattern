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
		//风扇设置为低速
		control.setCommand(lowCommand);
		control.go();
		//风扇设置为关闭
		control.setCommand(offCommand);
		control.go();
		//撤销命令，返回上一个状态
		control.back();
		
	}

}
