package L4.com.jdp.adapter;

import java.util.Enumeration;
import java.util.Iterator;
/**
 * ������ģʽ
 * ��������ɫ��MyAdapter
 * Ŀ���ɫ��Enumeration<Integer>
 * �������߽�ɫ��Iterator<Integer>
 * @author Administrator
 *
 */
public class MyAdapter implements Enumeration<Integer> {
	//1ʵ��Ŀ��ӿ�
	//2���б������ߵ�����
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
