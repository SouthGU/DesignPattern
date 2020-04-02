package lab02.com.jdp.invoker;

import lab02.com.jdp.command.Command;

/**
 * ÃüÁîÄ£Ê½
 * Invoker½ÇÉ«
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
