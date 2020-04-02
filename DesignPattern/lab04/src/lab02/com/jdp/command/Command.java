package lab02.com.jdp.command;
/**
 * 命令模式
 * Command角色（接口）
 * @author Administrator
 *
 */
public interface Command {
	public void execute(); //命令的执行
	public void undo();    //命令的撤销
}
