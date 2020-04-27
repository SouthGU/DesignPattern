package com.state.state;

import com.state.context.CandyMachine;

/**
 * 
 * @ClassName: NoQuarter
 * @Description: 状态模式-具体状态，没有20分钱状态
 * @author zzw
 * @date 2019年6月19日 上午9:32:51
 */
public class NoQuarter implements State {
	private CandyMachine machine = null;
	
	public NoQuarter(CandyMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("投币成功！接下来可以进行退币或者转动摇杆操作，有可能中奖哦！");
		machine.setState(machine.getHasquarter());   // 切换状态
	}

	@Override
	public void outQuarter() {
		System.out.println("对不起！您之前还未投币，退币不成功！");
	}

	@Override
	public void rotateRocker() {
		System.out.println("对不起！您之前还未投币，转动摇杆不成功！");
	}

	@Override
	public void dispenseCandy() {
		System.out.println("对不起！您之前还未投币，发放糖果不成功！");
	}

	@Override
	public void reset() {
		System.out.println("对不起！此操作不能成功执行！");
	}

}
