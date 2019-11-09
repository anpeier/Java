package wrapper;

import org.junit.Test;

public class InterviewTest {
	
	@Test
	public void test1() {
		Object o1 = true ? new Integer(1) : new Double(2.0);//��Ŀ�����Ҫ��������ͬ �Զ���������
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
		System.out.println(num);//��ֵַ
		char []c = {'a','b'};
		System.out.println(c);//ab
		String []str = {"aa","bb"};
		System.out.println(str);//��ַ
		
		Integer i = new Integer(1);
		Integer j = new Integer(1);
		System.out.println(i == j);//false
		
		//Integer�ڲ�������IntegerCache�ṹ��IntegerCache�ж�����Integer[],
		//������-128~127��Χ���������������ʹ���Զ�װ��ķ�ʽ����Integer��
		//ֵ�ķ�Χ��-128~127��Χ�ڣ�����ֱ��ʹ�������е�Ԫ�أ�����ȥnew��
		//Ŀ�������Ч��
		Integer m = 1;
		Integer n = 1;
		System.out.println(m == n);//true
		
		Integer x = 128;
		Integer y = 128;
		System.out.println(x == y);//false
		
	}
	
}
