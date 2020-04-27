package com.state.state;
/**
 * 
 * @ClassName: State
 * @Description: 状态模式-状态接口
 * @author zzw
 * @date 2019年6月19日 上午9:19:35
 */
public interface State {
	public void insertQuarter();  // 投币
	public void outQuarter();     // 退币
	public void rotateRocker();   // 转动摇杆
	public void dispenseCandy();  // 发放糖果
	public void reset();          // 重置

}
