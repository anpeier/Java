package unitTest;

import org.junit.Test;

/*
 * 
 * Java�е�JUnit��Ԫ����
 * ���裺
 * 1.ѡ�е�ǰ���� - �Ҽ�ѡ��build path - add library -JUnit - ��һ��
 * 2.����Java�࣬���е�Ԫ���ԡ�
 *   ��ʱ��Java��Ҫ�󣺢� ������public�� �� �����ṩ�������޲ι�����
 * 3.������������Ԫ���Է�����
 *   ��ʱ��Ԫ���Է������˷�����Ȩ����public��û�з���ֵ��û���β�
 * 
 * 4.�˵�Ԫ���Է�������Ҫ����ע�⣺@Test�����ڵ�Ԫ�����������import org.junit.Test;
 * 5.д�����˫����������run as - JUnit Test
 * 
 * ˵����
 * ִ�н�����쳣������
 * ִ�н���쳣������
 */
public class JUnitTest {
	
	int num = 10;
	
	@Test
	public void testEquals() {
		
		String s1 = "MM";
		String s2 = "MM";
		System.out.println(s1.equals(s2));
		
		System.out.println(num);
	}

}
