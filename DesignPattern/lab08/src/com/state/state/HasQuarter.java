package com.state.state;

import java.util.Random;

import com.state.context.CandyMachine;

/**
 * 
 * @ClassName: NoQuarter
 * @Description: ״̬ģʽ-����״̬��û��20��Ǯ״̬
 * @author zzw
 * @date 2019��6��19�� ����9:32:51
 */
public class HasQuarter implements State {
	private CandyMachine machine = null;
	
	public HasQuarter(CandyMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("�Բ�����֮ǰ�Ѿ�Ͷ�ң������Ѻ󣬿��ٴ�Ͷ�ң�");
	}

	@Override
	public void outQuarter() {
		System.out.println("�˱ҳɹ������Խ����ٴ�Ͷ�Ҳ�������ӭ�ٴι��٣�");
	}

	@Override
	public void rotateRocker() {
		System.out.println("ת��ҡ�˳ɹ������Ե�......");
		Random random = new Random();
		int rate = random.nextInt(10);
		if (rate==0 || rate == 1) {
			System.out.println("��ϲ�����н��ˣ�");
			machine.setState(machine.getWinningstate()); // �л���Ϊ�н�״̬
		}
		else {
			machine.setState(machine.getSoldstate());    // �л���Ϊ�����ǹ�״̬
		}
	}

	@Override
	public void dispenseCandy() {
		System.out.println("�Բ�������ת��ҡ�ˣ��˲������ܷ����ǹ���");
	}

	@Override
	public void reset() {
		System.out.println("�Բ��𣡴˲������ܳɹ�ִ�У�");
	}

}
