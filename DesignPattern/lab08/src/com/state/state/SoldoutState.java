package com.state.state;

import com.state.context.CandyMachine;

/**
 * 
 * @ClassName: NoQuarter
 * @Description: 状态模式-具体状态，没有20分钱状态
 * @author zzw
 * @date 2019年6月19日 上午9:32:51
 */
public class SoldoutState implements State {
	private CandyMachine machine = null;
	
	public SoldoutState(CandyMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("对不起！糖果已经售罄，此操作不能成功执行！");
	}

	@Override
	public void outQuarter() {
		System.out.println("对不起！糖果已经售罄，此操作不能成功执行！");
	}

	@Override
	public void rotateRocker() {
		System.out.println("对不起！糖果已经售罄，此操作不能成功执行！");
	}

	@Override
	public void dispenseCandy() {
		System.out.println("对不起！糖果已经售罄，此操作不能成功执行！");
	}

	@Override
	public void reset() {
		this.machine.setCount(5);  // 重置机器为5个糖果
		this.machine.setState(machine.getNoquarter());
	}

}
