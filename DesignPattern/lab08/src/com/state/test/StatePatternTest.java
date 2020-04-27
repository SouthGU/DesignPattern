package com.state.test;

import com.state.context.CandyMachine;

/**
 * 
 * @ClassName: StatePatternTest
 * @Description: ״̬ģʽ-����ִ�������
 * @author zzw
 * @date 2019��6��19�� ����9:58:58
 */
public class StatePatternTest {

	public static void main(String[] args) {
		CandyMachine machine = CandyMachine.createMachine(); // ����ģʽ����
		machine.setCount(3);  //��ʼ���ǹ����ǹ�����
		System.out.println(machine.toString()); //��ӡ�ǹ��������ǹ���������
		
		machine.insertQuarter(); // Ͷ��
		machine.rotateRocker();  // ת��ҡ��
		machine.dispenseCandy(); // �����ǹ�
		System.out.println(machine.toString());
		
		machine.insertQuarter(); // Ͷ��
		machine.rotateRocker();  // ת��ҡ��
		machine.dispenseCandy(); // �����ǹ�
		System.out.println(machine.toString());
		
		machine.insertQuarter(); // Ͷ��
		machine.rotateRocker();  // ת��ҡ��
		machine.dispenseCandy(); // �����ǹ�
		System.out.println(machine.toString());
	
		machine.insertQuarter(); // Ͷ��
		machine.rotateRocker();  // ת��ҡ��
		machine.dispenseCandy(); // �����ǹ�
		System.out.println(machine.toString());
		
		

	}

}
