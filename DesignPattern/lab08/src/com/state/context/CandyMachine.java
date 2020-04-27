package com.state.context;
/**
 * 
 * @ClassName: CandyMachine
 * @Description: 状态模式-Context上下文环境类
 * @author zzw
 * @date 2019年6月19日 上午9:26:57
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
		// 糖果机初始化状态设置
		this.setState(noquarter);
	}
	
	/**
	 * 
	 * @Title: createMachine
	 * @Description: 单例模式
	 * @param @return    
	 * @return CandyMachine   
	 * @throws
	 */
	public static CandyMachine createMachine() {
		return machine;
	}
	
	private State state = null;         // 记录糖果机当前最新的状态对象引用
	private int count = 0;              // 记录糖果机的当前糖果数量

	private State noquarter = null;     // 没有25分钱状态
	private State hasquarter = null;    // 有25分钱状态
	private State soldstate = null;     // 发放糖果状态
	private State soldoutstate = null;  // 糖果售罄状态
	private State winningstate = null;  // 中奖状态
	
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
	
	//委托操作
	public void insertQuarter() {
		this.state.insertQuarter(); // 投币
	}
	
	public void outQuarter() {
		this.state.outQuarter();    // 退币
	}
	
	public void rotateRocker() {
		this.state.rotateRocker();  // 转动摇杆
	}
	
	public void dispenseCandy() {   // 发放糖果
		this.state.dispenseCandy();
	}
	
	public void reset() {
		this.state.reset();         // 重置
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
		return "CandyMachine 糖果机最新有 " + this.count + " 个糖果";
	}
	
	
}
