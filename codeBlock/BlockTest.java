package codeBlock;

/*
 * 类的成员之四：代码块(初始化块)
 * 1.作用：用来初始化类、对象
 * 2.代码块如果有修饰，只能使用static。
 * 3.分类：静态代码块 vs 非静态代码块
 * 
 * 4.静态代码块：
 * 		>内部可以有输出语句
 * 		>随着类的加载而执行，只会执行一次
 * 		>作用：可以初始化类的信息
 * 		>如果一个类中定义了多个静态代码块，则按照声明的先后顺序执行
 * 		>静态代码块的执行优先于非静态代码块
 * 		>只能调用静态的结构，不能调用非静态结构
 * 
 * 5.非静态代码块：
 * 		>内部可以有输出语句
 * 		>随着对象的创建而执行
 * 		>每创建一个对象就执行一次非静态代码快
 * 		>作用：可以在创建对象时，对对象的属性等进行初始化
 * 		>如果一个类中定义了多个代码块，则按照声明的先后顺序执行
 * 		>能调用静态的结构，也能调用非静态结构
 * 
 */
public class BlockTest {

	public static void main(String[] args) {
		
		String desc = Person.desc;
		System.out.println(desc);
		
		Person p1 = new Person();
		Person p2 = new Person();
		System.out.println(p1.age);
		
		Person.info();
	}
	
}

class Person{
	//属性
	String name;
	int age;
	static String desc = "我是一个人";
	
	//构造器
	public Person() {
		
	}	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//static代码块
	static{
		System.out.println("hello,static block-1");
		desc = "我是一个老实人";
		info();
	}
	static{
		System.out.println("hello,static block-2");
	}
	
	//非static代码块
	{
		System.out.println("hello,block-1");
		age = 1;
		eat();
		desc = "我是好人";
		info();
	}
	{
		System.out.println("hello,block-2");
	}
	
	//方法
	public void eat() {
		System.out.println("吃饭");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public static void info() {
		System.out.println("快乐的人");
	}
	
}