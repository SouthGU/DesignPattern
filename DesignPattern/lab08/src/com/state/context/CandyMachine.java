package com.state.context;
/**
 * 
 * @ClassName: CandyMachine
 * @Description: ״̬ģʽ-Context�����Ļ�����
 * @author zzw
 * @date 2019��6��19�� ����9:26:57
 */

import com.state.state.HasQuarter;
import com.state.state.NoQuarter;
import com.state.state.SoldState;
import com.state.state.SoldoutState;
import com.state.state.State;
import com.state.state.WinningState;

public class CandyMachine {
	private static final CandyMachine machine = new CandyMachine();
	
	private CandyMachine() {
		this.noquarter = new NoQuarter(this);
		this.hasquarter = new HasQuarter(this);
		this.soldstate = new SoldState(this);
		this.soldoutstate = new SoldoutState(this);
		this.winningstate = new WinningState(this);
		// �ǹ�����ʼ��״̬����
		this.setState(noquarter);
	}
	
	/**
	 * 
	 * @Title: createMachine
	 * @Description: ����ģʽ
	 * @param @return    
	 * @return CandyMachine   
	 * @throws
	 */
	public static CandyMachine createMachine() {
		return machine;
	}
	
	private State state = null;         // ��¼�ǹ�����ǰ���µ�״̬��������
	private int count = 0;              // ��¼�ǹ����ĵ�ǰ�ǹ�����

	private State noquarter = null;     // û��25��Ǯ״̬
	private State hasquarter = null;    // ��25��Ǯ״̬
	private State soldstate = null;     // �����ǹ�״̬
	private State soldoutstate = null;  // �ǹ�����״̬
	private State winningstate = null;  // �н�״̬
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	//ί�в���
	public void insertQuarter() {
		this.state.insertQuarter(); // Ͷ��
	}
	
	public void outQuarter() {
		this.state.outQuarter();    // �˱�
	}
	
	public void rotateRocker() {
		this.state.rotateRocker();  // ת��ҡ��
	}
	
	public void dispenseCandy() {   // �����ǹ�
		this.state.dispenseCandy();
	}
	
	public void reset() {
		this.state.reset();         // ����
	}

	public State getNoquarter() {
		return noquarter;
	}

	public State getHasquarter() {
		return hasquarter;
	}

	public State getSoldstate() {
		return soldstate;
	}

	public State getSoldoutstate() {
		return soldoutstate;
	}

	public State getWinningstate() {
		return winningstate;
	}

	@Override
	public String toString() {
		return "CandyMachine �ǹ��������� " + this.count + " ���ǹ�";
	}
	
	
}
