package wrapper;

import org.junit.Test;

public class InterviewTest {
	
	@Test
	public void test1() {
		Object o1 = true ? new Integer(1) : new Double(2.0);//三目运算符要求类型相同 自动类型提升
		System.out.println(o1);//1.0
	}
	
	@Test
	public void test2() {
		Object o2;
		if(true)
			o2 = new Integer(1);
		else
			o2 = new Double(2.0);
		System.out.println(o2);//1
	}
	
	@Test
	public void test3() {
		
		int []num = {1,2};
		System.out.println(num);//地址值
		char []c = {'a','b'};
		System.out.println(c);//ab
		String []str = {"aa","bb"};
		System.out.println(str);//地址
		
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j);//false
		
		//Integer内部定义了IntegerCache结构，IntegerCache中定义了Integer[],
		//保存了-128~127范围的整数。如果我们使用自动装箱的方式，给Integer赋
		//值的范围在-128~127范围内，可以直接使用数组中的元素，不用去new。
		//目的是提高效率
		Integer m = 1;
		Integer n = 1;
		System.out.println(m == n);//true
		
		Integer x = 128;
		Integer y = 128;
		System.out.println(x == y);//false
		
	}
	
}
