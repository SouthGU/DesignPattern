package com.state.test;

import com.state.context.CandyMachine;

/**
 * 
 * @ClassName: StatePatternTest
 * @Description: 状态模式-程序执行入口类
 * @author zzw
 * @date 2019年6月19日 上午9:58:58
 */
public class StatePatternTest {

	public static void main(String[] args) {
		CandyMachine machine = CandyMachine.createMachine(); // 单例模式运用
		machine.setCount(3);  //初始化糖果机糖果数量
		System.out.println(machine.toString()); //打印糖果机机器糖果基本数量
		
		machine.insertQuarter(); // 投币
		machine.rotateRocker();  // 转动摇杆
		machine.dispenseCandy(); // 发放糖果
		System.out.println(machine.toString());
		
		machine.insertQuarter(); // 投币
		machine.rotateRocker();  // 转动摇杆
		machine.dispenseCandy(); // 发放糖果
		System.out.println(machine.toString());
		
		machine.insertQuarter(); // 投币
		machine.rotateRocker();  // 转动摇杆
		machine.dispenseCandy(); // 发放糖果
		System.out.println(machine.toString());
	
		machine.insertQuarter(); // 投币
		machine.rotateRocker();  // 转动摇杆
		machine.dispenseCandy(); // 发放糖果
		System.out.println(machine.toString());
		
		

	}

}
