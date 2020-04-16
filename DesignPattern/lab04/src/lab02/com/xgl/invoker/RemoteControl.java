package lab02.com.xgl.invoker;

import lab02.com.xgl.command.Command;

/**
 * ����ģʽ
 * Invoker��ɫ
 * @author Administrator
 *
 */
public class RemoteControl {
	private Command command;
	
	public RemoteControl(){
		
	}
	
	public void setCommand(Command command){
		this.command = command;
	}
	
	public void go(){
		this.command.execute();
	}
	
	public void back(){
		this.command.undo();
	}
	
}
