package toString;

import java.util.Date;

/*
 * Object类中的toString()的使用：
 * 
 * 1.当输出一个对象的引用时，实际上就是调用当前对象的toString()方法。
 * 
 * 2.Object类中的toString()的定义:
 *   public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
     }
 * 
 * 3.像String、Date、File、包装类等都重写了toString()方法。
 * 	 使得在调用对象的toString()时，返回"实体内容"信息。
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
