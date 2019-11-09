package equals;

import java.sql.Date;

/*
 * 
 * == �� equals() ������:
 * ==�������
 * 1.����ʹ���ڻ������������к���������������
 * 2.����Ƚϵ��ǻ����������ͱ������Ƚ�������������������Ƿ���ȡ�����һ��Ҫ������ͬ��
 *   ����Ƚϵ��������������ͱ������Ƚ����������ֵַ�Ƿ���ͬ�������������Ƿ�ָ��ͬһ������ʵ�塣
 *   
 *  equals()������ʹ�ã� 
 *  1.��һ�����������������
 *  2.ֻ��������������������
 *  3.Object����equals()�Ķ��壺
 *    public boolean equals(Object obj) {
        return (this == obj);
      }
 *    ˵����Object���ж����equals()�� == ��������ͬ��	�Ƚ����������Ƿ�ָ��ͬһ������ʵ�塣
 *  4.��String��Date��File����װ��ȶ���д��Object�е�equals()��������д�Ժ󣬱ȽϵĲ���
 *    �������õĵ�ַ�Ƿ���ͬ�����ǱȽ����������"ʵ������"�Ƿ���ͬ��
 *    
 *  5.ͨ������£������Զ���������ʹ��equals()�Ļ���Ҳͨ���ǱȽ����������"ʵ������"�Ƿ�
 *  ���,�����Ҫ��дObject��equals()������
 *  ��дԭ�򣺱Ƚ�"ʵ������"�Ƿ���ȡ�
 */
public class EqualsTest {

	public static void main(String[] args) {
		
		//������������
		int i = 10;
		int j = 10;
		double d = 10.0;
		System.out.println(i == j);
		System.out.println(i == d);
		
		boolean b = true;
		char c = 10;
		System.out.println(i == c);
		
		char c1 = 'A';
		char c2 = 65;
		System.out.println(c1 == c2);
		
		//������������
		Customer cust1 = new Customer("Tom",21);
		Customer cust2 = new Customer("Tom",21);
		System.out.println(cust1 == cust2);//false
		
		String str1 = new String("lap");
		String str2 = new String("lap");
		System.out.println(str1 == str2);//false
		
		System.out.println("***********");
		System.out.println(cust1.equals(cust2));//false->true
		System.out.println(str1.equals(str2));//true
		
		Date date1 = new Date(32432525324L);
		Date date2 = new Date(32432525324L);
		System.out.println(date1.equals(date2));//true
	}
	
}
