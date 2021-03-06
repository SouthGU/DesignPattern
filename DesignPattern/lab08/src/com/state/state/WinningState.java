package com.state.state;

import com.state.context.CandyMachine;

/**
 * 
 * @ClassName: NoQuarter
 * @Description: 状态模式-具体状态，没有20分钱状态
 * @author zzw
 * @date 2019年6月19日 上午9:32:51
 */
public class WinningState implements State {
	private CandyMachine machine = null;
	
	public WinningState(CandyMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("对不起！您已经投币成功并且已经转动摇杆，此操作不能成功执行！");
	}

	@Override
	public void outQuarter() {
		System.out.println("对不起！您已经投币成功并且已经转动摇杆，此操作不能成功执行！");
	}

	@Override
	public void rotateRocker() {
		System.out.println("对不起！您已经转动过摇杆，此操作不能成功执行！");
	}

	@Override
	public void dispenseCandy() {
		int c = this.machine.getCount();    // 获得最新的糖果机的糖果数量

		if (c >= 2) {
			machine.setCount((c - 2));
			System.out.println("售出两个糖果成功！");
			if (c-2 > 0) {
				machine.setState(machine.getNoquarter());
			}
			else if (c-2 == 0) {
				
				machine.setState(machine.getSoldoutstate());
				machine.reset();  // 重置
			}
		}
		else if (c == 1) {
			System.out.println("糖果数量不够，请联系后台工作人员，电话：020-88888888");
			machine.setState(machine.getNoquarter());
		}
		else if (c == 0) {
			System.out.println("糖果数量不够，请联系后台工作人员，电话：020-88888888");
			machine.setState(machine.getSoldoutstate());
			machine.reset();  // 重置
		}
	}

	@Override
	public void reset() {
		System.out.println("对不起！您已经转动过摇杆，此操作不能成功执行！");
	}

}
