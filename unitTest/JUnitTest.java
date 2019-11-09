package unitTest;

import org.junit.Test;

/*
 * 
 * Java中的JUnit单元测试
 * 步骤：
 * 1.选中当前工程 - 右键选择：build path - add library -JUnit - 下一步
 * 2.创建Java类，进行单元测试。
 *   此时的Java类要求：① 此类是public的 ② 此类提供公共的无参构造器
 * 3.此类中声明单元测试方法。
 *   此时单元测试方法：此方法的权限是public，没有返回值，没有形参
 * 
 * 4.此单元测试方法上需要声明注解：@Test，并在单元测试类中添加import org.junit.Test;
 * 5.写完代码双击方法名：run as - JUnit Test
 * 
 * 说明：
 * 执行结果无异常，绿条
 * 执行结果异常：红条
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
