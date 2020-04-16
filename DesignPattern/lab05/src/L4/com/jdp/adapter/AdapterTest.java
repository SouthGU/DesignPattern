package L4.com.jdp.adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * ������ģʽ
 * ���Գ�����
 * @author Administrator
 *
 */
public class AdapterTest {

	public static void main(String[] args) {
		//����List����
		List<Integer> list = new ArrayList<>();
		//��ʼ������
		for (int i = 0; i < 5; i++) {
			list.add(i+1);
		}
		
		//1
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
			
		}
		System.out.println("******************************");
		//2
		Iterator<Integer> iterator2 = list.iterator();
		Enumeration<Integer> enumeration = new MyAdapter(iterator2);
		while (enumeration.hasMoreElements()) {
			Integer i = (Integer) enumeration.nextElement();
			System.out.println(i);
		}
		
		
	}

}
