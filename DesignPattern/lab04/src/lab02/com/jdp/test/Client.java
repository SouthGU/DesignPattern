package lab02.com.jdp.test;


import lab02.com.jdp.command.*;
import lab02.com.jdp.invoker.RemoteControl;
import lab02.com.jdp.receiver.CellingFan;

/**
 * 测试场景类
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		CellingFan fan = new CellingFan();   	          //新建Receiver对象
		Command highCommand = new HighCommand(fan);       //新建具体命令对象
		Command mediumCommand = new MediumCommand(fan);   //新建具体命令对象
		Command lowCommand = new LowCommand(fan);         //新建具体命令对象
		Command offCommand = new OffCommand(fan);         //新建具体命令对象
		
		RemoteControl control = new RemoteControl();  //新建RemoteControl对象
		
		//风扇设置为高速
		control.setCommand(highCommand);
		control.go();
		//风扇设置为中速
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
