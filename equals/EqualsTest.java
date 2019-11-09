package equals;

import java.sql.Date;

/*
 * 
 * == 和 equals() 的区别:
 * ==：运算符
 * 1.可以使用在基本数据类型中和引用数据类型中
 * 2.如果比较的是基本数据类型变量：比较两个变量保存的数据是否相等。（不一定要类型相同）
 *   如果比较的是引用数据类型变量，比较两个对象地址值是否相同，即两个引用是否指向同一个对象实体。
 *   
 *  equals()方法的使用： 
 *  1.是一个方法，而非运算符
 *  2.只能适用于引用数据类型
 *  3.Object类中equals()的定义：
 *    public boolean equals(Object obj) {
        return (this == obj);
      }
 *    说明：Object类中定义的equals()和 == 的作用相同，	比较两个引用是否指向同一个对象实体。
 *  4.像String、Date、File、包装类等都重写了Object中的equals()方法。重写以后，比较的不是
 *    两个引用的地址是否相同，而是比较两个对象的"实体内容"是否相同。
 *    
 *  5.通常情况下，我们自定义的类如果使用equals()的话，也通常是比较两个对象的"实体内容"是否
 *  相等,因此需要重写Object的equals()方法。
 *  重写原则：比较"实体内容"是否相等。
 */
public class EqualsTest {

	public static void main(String[] args) {
		
		//基本数据类型
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
		
		//引用数据类型
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
