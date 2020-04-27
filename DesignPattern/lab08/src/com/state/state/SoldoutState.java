package com.state.state;

import com.state.context.CandyMachine;

/**
 * 
 * @ClassName: NoQuarter
 * @Description: ״̬ģʽ-����״̬��û��20��Ǯ״̬
 * @author zzw
 * @date 2019��6��19�� ����9:32:51
 */
public class SoldoutState implements State {
	private CandyMachine machine = null;
	
	public SoldoutState(CandyMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("�Բ����ǹ��Ѿ��������˲������ܳɹ�ִ�У�");
	}

	@Override
	public void outQuarter() {
		System.out.println("�Բ����ǹ��Ѿ��������˲������ܳɹ�ִ�У�");
	}

	@Override
	public void rotateRocker() {
		System.out.println("�Բ����ǹ��Ѿ��������˲������ܳɹ�ִ�У�");
	}

	@Override
	public void dispenseCandy() {
		System.out.println("�Բ����ǹ��Ѿ��������˲������ܳɹ�ִ�У�");
	}

	@Override
	public void reset() {
		this.machine.setCount(5);  // ���û���Ϊ5���ǹ�
		this.machine.setState(machine.getNoquarter());
	}

}
