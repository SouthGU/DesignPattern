package L4.com.jdp.adapter;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * 适配器模式
 * 测试场景类
 * @author Administrator
 *
 */
public class AdapterTest {

	public static void main(String[] args) {
		//创建List对象
		List<Integer> list = new ArrayList<>();
		//初始化数据
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
