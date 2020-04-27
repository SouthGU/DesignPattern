package com.state.state;

import java.util.Random;

import com.state.context.CandyMachine;

/**
 * 
 * @ClassName: NoQuarter
 * @Description: 状态模式-具体状态，没有20分钱状态
 * @author zzw
 * @date 2019年6月19日 上午9:32:51
 */
public class HasQuarter implements State {
	private CandyMachine machine = null;
	
	public HasQuarter(CandyMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("对不起！您之前已经投币，待消费后，可再次投币！");
	}

	@Override
	public void outQuarter() {
		System.out.println("退币成功！可以进行再次投币操作，欢迎再次光临！");
	}

	@Override
	public void rotateRocker() {
		System.out.println("转动摇杆成功！请稍等......");
		Random random = new Random();
		int rate = random.nextInt(10);
		if (rate==0 || rate == 1) {
			System.out.println("恭喜您，中奖了！");
			machine.setState(machine.getWinningstate()); // 切换成为中奖状态
		}
		else {
			machine.setState(machine.getSoldstate());    // 切换成为发放糖果状态
		}
	}

	@Override
	public void dispenseCandy() {
		System.out.println("对不起！请先转动摇杆，此操作不能发放糖果！");
	}

	@Override
	public void reset() {
		System.out.println("对不起！此操作不能成功执行！");
	}

}
