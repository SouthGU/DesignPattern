package lab02.com.jdp.command;
/**
 * ����ģʽ
 * Command��ɫ���ӿڣ�
 * @author Administrator
 *
 */
public interface Command {
	public void execute(); //�����ִ��
	public void undo();    //����ĳ���
}
