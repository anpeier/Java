package statics;
/*
 * 1.static:静态的
 * 2.static可以用来修饰：属性、方法、代码块、内部类
 * 
 * 3.使用static修饰属性：静态变量(类变量)
 * 		属性：按是否使用static修饰，又分为：静态属性 vs 非静态属性(实例变量)
 * 			实例变量：我们创建了类的多个对象，每个对象都独立的拥有一套类中的非静态属性。当修改
 * 			其中一个对象的非静态属性时，不会导致其他对象中同样的属性值的修改。
 * 		静态变量：当创建了类的多个对象，多个对象共享同一个静态变量，当通过一个对象修改静态变量
 * 		时，会导致其他对象调用此静态变量时，是修改过了的。
 * 		static修饰属性的其他说明：
 * 			① 静态变量随着类的加载而加载。可以通过"类.静态变量"的方式进行调用
 * 			② 静态变量的加载要早于对象的创建
 * 			③ 由于类之会加载一次，则静态变量在内存中只存在一份：存在方法区的静态域中。
 * 			④ 		类变量		实例变量
 * 			类		yes			no
 * 			对象		yes			yes
 * 			静态属性举例：System.out;Math.PI;
 * 
 * 4.使用static修饰方法：静态方法
 * 		1.随着类的加载而加载，可以通过"类.静态方法"的方式调用
 * 		② 		静态方法		非静态方法
 * 		类		yes			no
 * 		对象		yes			yes
 * 		③ 静态方法中，只能调用静态的方法或属性
 * 		    非静态方法中，既可以调用静态的方法，也可掉用非静态方法。
 * 		
 * 5.static注意点：
 * 		在静态方法内，不能使用this关键字、super关键字
 * 		关于静态属性和静态方法的使用，应该从生命周期的角度去理解。
 * 
 * 6.开发中，如何确定一个属性是否声明为static的？
 * 		> 属性是可以被多个对象所共享的，不会随着对象的不同而不同
 * 		> 类中的常量也常常声明为static的
 * 		
 * 	开发中，如何确定一个属性是否声明为static的？
 * 		> 操作静态属性的方法通常设为static的
 * 		> 工具类中的方法，习惯上声明为static的。如Math、Arrays、Collection
 * 
 * 内存解析：栈：局部变量		堆：new出来的结构：对象、数组
 * 			方法区：类的加载信息、静态域、常量池
 * 
 */

public class StaticTest {
	
	public static void main(String[] args) {
		
		Chinese.nation = "中国";
		System.out.println(Chinese.nation);
		
		Chinese c1 = new Chinese();
		c1.name = "姚明";
		c1.age = 40;
		c1.nation = "CHN";
		
		Chinese c2 = new Chinese();
		c2.name = "马龙";
		c2.age = 30;
		c2.nation = "CHINA";
		c2.info();
		
		
		System.out.println(c1.nation);
		Chinese.show();
		c2.show();
		
		//编译不通过
//		Chinses.name = "张继科";
//		Chinese.info();
	}
	
	
	
}

//中国人
class Chinese{
	
	String name;
	int age;
	static String nation;
	
	public void eat() {
		System.out.println("吃中餐");
	}
	public static void show() {
		System.out.println("中国人！");
//		eat();
//		name = "Tom";
		//可以调用静态的结构
		System.out.println(nation);
		walk();
	}
	public void info() {
		System.out.println("name: " + name + ",age: " + age);
		show();
	}
	public static void walk() {
		
	}
}