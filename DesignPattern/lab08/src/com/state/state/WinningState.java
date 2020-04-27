package com.state.state;

import com.state.context.CandyMachine;

/**
 * 
 * @ClassName: NoQuarter
 * @Description: ״̬ģʽ-����״̬��û��20��Ǯ״̬
 * @author zzw
 * @date 2019��6��19�� ����9:32:51
 */
public class WinningState implements State {
	private CandyMachine machine = null;
	
	public WinningState(CandyMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("�Բ������Ѿ�Ͷ�ҳɹ������Ѿ�ת��ҡ�ˣ��˲������ܳɹ�ִ�У�");
	}

	@Override
	public void outQuarter() {
		System.out.println("�Բ������Ѿ�Ͷ�ҳɹ������Ѿ�ת��ҡ�ˣ��˲������ܳɹ�ִ�У�");
	}

	@Override
	public void rotateRocker() {
		System.out.println("�Բ������Ѿ�ת����ҡ�ˣ��˲������ܳɹ�ִ�У�");
	}

	@Override
	public void dispenseCandy() {
		int c = this.machine.getCount();    // ������µ��ǹ������ǹ�����

		if (c >= 2) {
			machine.setCount((c - 2));
			System.out.println("�۳������ǹ��ɹ���");
			if (c-2 > 0) {
				machine.setState(machine.getNoquarter());
			}
			else if (c-2 == 0) {
				
				machine.setState(machine.getSoldoutstate());
				machine.reset();  // ����
			}
		}
		else if (c == 1) {
			System.out.println("�ǹ���������������ϵ��̨������Ա���绰��020-88888888");
			machine.setState(machine.getNoquarter());
		}
		else if (c == 0) {
			System.out.println("�ǹ���������������ϵ��̨������Ա���绰��020-88888888");
			machine.setState(machine.getSoldoutstate());
			machine.reset();  // ����
		}
	}

	@Override
	public void reset() {
		System.out.println("�Բ������Ѿ�ת����ҡ�ˣ��˲������ܳɹ�ִ�У�");
	}

}
