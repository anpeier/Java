package wrapper;

import org.junit.Test;

/*
 * ��װ���ʹ�ã�
 * 1.Java�ṩ��8���������Ͷ�Ӧ�İ�װ�࣬ʹ�û����������͵ı��������������
 * 
 * 2.���յģ������������͡���װ�ࡢString����֮����໥ת��
 */
public class WrapperTest {

	//String���� --->�����������͡���װ��:Xxx.parseXxx();
	@Test
	public void test5(){
		String str1 = "123";
		//����
//		int num1 = (int)str1;
//		Integer in1 = (Integer)str1;
		
		int num2 = Integer.parseInt(str1);
		System.out.println(num2 + 1);
		
		String str2 = "true";
		boolean b1 = Boolean.parseBoolean(str2);
		System.out.println(b1);
		
		String str3 = "true1";
		boolean b2 = Boolean.parseBoolean(str3);
		System.out.println(b2);//false
	}
	
	//�����������͡���װ��--->String����:�������ص�valueOf(Xxx xxx)
	@Test
	public void test4() {
		int num1 = 10;
		//��ʽһ:��������
		String str1 = num1 + "";
		
		//��ʽ����
		float f1 = 12.3f;
		String str2 = String.valueOf(f1);
		
		Double d1 = new Double(12.4);
		String str3 = String.valueOf(d1);
		System.out.println(str2);
		System.out.println(str3);
		
	}
	
	@Test
	public void test3() {
//		int num1 = 10;
//		//��������--->��װ�����
//		method(num1);
		
		//�Զ�װ��:
		int num2 = 10;
		Integer in1 = num2;
		
		boolean b1 = true;
		Boolean b2 = b1;
		
		//�Զ�����:
		System.out.println(in1.toString());
		
		int num3 = in1;//�Զ�����
	}
	
	public void method(Object obj) {
		System.out.println(obj);
	}
	
	//��װ��--->������������:���ð�װ���xxxValue
	@Test
	public void test2(){
		Integer in1 = new Integer(12);
		int i1 = in1.intValue();
		System.out.println(i1);
		
		Float f1 = new Float(12.3);
		float f2 = f1.floatValue();
		System.out.println(f2+1);
	}
	
	//������������--->��װ�ࣺ���ð�װ��Ĺ�����
	@Test
	public void test1() {
		int num1 = 10;
		//System.out.println(num1.toString);������
		
		Integer in1 = new Integer(num1);
		System.out.println(in1.toString());
		
		Integer in2 = new Integer("123");
		System.out.println(in2.toString());
		
		//���쳣
//		Integer in3 = new Integer("123abc");
//		System.out.println(in3.toString());
		
		Float f1 = new Float(12.3);
		Float f2 = new Float("12.3");
		System.out.println(f1);
		System.out.println(f2);
		
		Boolean b1 = new Boolean(true);
		System.out.println(b1);
		Boolean b2 = new Boolean("trUe");
		System.out.println(b2);
		Boolean b3 = new Boolean("true123");
		System.out.println(b3);//false
		
		Order order = new Order();
		System.out.println(order.isMale);//false
		System.out.println(order.isFemale);//null
	}
}

class Order{
	boolean isMale;
	Boolean isFemale;
}
