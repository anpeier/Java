package toString;

import java.util.Date;

/*
 * Object���е�toString()��ʹ�ã�
 * 
 * 1.�����һ�����������ʱ��ʵ���Ͼ��ǵ��õ�ǰ�����toString()������
 * 
 * 2.Object���е�toString()�Ķ���:
 *   public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
     }
 * 
 * 3.��String��Date��File����װ��ȶ���д��toString()������
 * 	 ʹ���ڵ��ö����toString()ʱ������"ʵ������"��Ϣ��
 * 
 * 
 */

public class ToStringTest {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer("Tom",22);
		System.out.println(cust1.toString());//toString.Customer@7852e922
		System.out.println(cust1);//toString.Customer@7852e922
		
		String str = new String("lap");
		System.out.println(str);//lap
		
		Date date = new Date(4525654843654L);
		System.out.println(date);
	}
	
}
