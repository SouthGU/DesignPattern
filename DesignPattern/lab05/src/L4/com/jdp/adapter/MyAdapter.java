package L4.com.jdp.adapter;

import java.util.Enumeration;
import java.util.Iterator;
/**
 * 适配器模式
 * 适配器角色：MyAdapter
 * 目标角色：Enumeration<Integer>
 * 被适配者角色：Iterator<Integer>
 * @author Administrator
 *
 */
public class MyAdapter implements Enumeration<Integer> {
	//1实现目标接口
	//2持有被适配者的引用
	private Iterator<Integer> iterator;
	
	public MyAdapter(Iterator<Integer> it) {
		this.iterator = it;
	}
	
	@Override
	public boolean hasMoreElements() {
		return (this.iterator.hasNext());
	}

	@Override
	public Integer nextElement() {
		return (this.iterator.next());
	}

}
