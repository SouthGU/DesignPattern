package com.state.state;

import com.state.context.CandyMachine;

/**
 * 
 * @ClassName: NoQuarter
 * @Description: ״̬ģʽ-����״̬��û��20��Ǯ״̬
 * @author zzw
 * @date 2019��6��19�� ����9:32:51
 */
public class NoQuarter implements State {
	private CandyMachine machine = null;
	
	public NoQuarter(CandyMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Ͷ�ҳɹ������������Խ����˱һ���ת��ҡ�˲������п����н�Ŷ��");
		machine.setState(machine.getHasquarter());   // �л�״̬
	}

	@Override
	public void outQuarter() {
		System.out.println("�Բ�����֮ǰ��δͶ�ң��˱Ҳ��ɹ���");
	}

	@Override
	public void rotateRocker() {
		System.out.println("�Բ�����֮ǰ��δͶ�ң�ת��ҡ�˲��ɹ���");
	}

	@Override
	public void dispenseCandy() {
		System.out.println("�Բ�����֮ǰ��δͶ�ң������ǹ����ɹ���");
	}

	@Override
	public void reset() {
		System.out.println("�Բ��𣡴˲������ܳɹ�ִ�У�");
	}

}
