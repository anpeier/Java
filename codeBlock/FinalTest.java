package codeBlock;

/*
 * 
 * final:最终的
 * 
 * 1.final可以用来修饰的结构：类、方法、变量
 * 
 * 2.final 用来修饰一个类:不能被其他类继承
 * 			比如：String类、System类、StringBuffer类
 * 
 * 3.final 用来修饰方法：表明此方法不可以被重写
 * 			比如：Object的getClass();
 * 
 * 4.final 用来修饰变量：此时的"变量"就称为常量
 * 			final 修饰属性：可以考虑赋值的位置有：显示初始化、代码块中初始化、构造器中初始化
 * 			final 修饰局部变量：
 * 					尤其是使用final修饰形参时，表明此形参是一个常量。当我们调用此方法时，给常量形参赋值一个实参，
 * 					一旦赋值以后，就只能在方法体内使用此形参，不能进行重新赋值。
 * 
 * static final : 用来修饰属性：全局常量
 */
public class FinalTest {
	
	final int WIDTH = 0;
	final int LEFT;
	final int RIGHT;
//	final int DOWN;
	
	{
		LEFT = 1;
	}
	
	public FinalTest() {
		RIGHT =2;
	}
	public FinalTest(int n) {
		RIGHT =2;
	}
	
//	public void setDown(int down){
//		this.DOWN = down;
//	}
	
	public void doWidth() {
//		width = 20;//不能对常量赋值
	}
	
	public void show() {
		final int NUM = 10;//常量
//		NUM += 20;
	}
	
	public void show(final int num) {
//		num = 20;
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		
		int num =10;
		num += 5;
		
		FinalTest test = new FinalTest();
		test.show(10);
		
	}
}

final class FinalA{
	
}

//class B extends FinalA{
//	
//}
class AA{
	public final void show() {}
}
class BB extends AA{
//	public void show() {}//不能重写父类的final方法
}