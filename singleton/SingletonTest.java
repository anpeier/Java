package singleton;

/*
 * 单例设计模式：
 * 1.所谓单例设计模式，就是采取一定的方法保证在整个的软件系统中，对某个类只能存在
 * 	  一个对象实例。
 * 
 * 2.如何实现？
 * 	 1.饿汉式
 *   2.懒汉式
 *   
 * 3.区分懒汉式和饿汉式
 *     懒汉式：
 *     		好处：线程是安全的
 *     		坏处：对象加载时间过长
 *     饿汉式：
 *     		好处：延迟对象的创建
 *     		目前写法坏处：线程不安全 --->多线程内容时修改
 * 
 * 	应用场景：
 * 		网站的计数器
 *      应用程序的日志应用
 *      数据库的连接池
 *      读取配置文件的类
 *      Application是单例的典型应用
 *      Windows的Task Manage(任务管理器)
 *      Windows的Recycle Bin(回收站)
 */

public class SingletonTest {
	
	public static void main(String[] args) {
		
//		Bank bank1 = new Bank();
//		Bank bank2 = new Bank();
		
		Bank bank1 = Bank.getInstance();
		Bank bank2 = Bank.getInstance();
		
		System.out.println(bank1 == bank2);//true
	}
}

//饿汉式
class Bank{
	
	//1.私有化类的构造器
	private Bank() {
		
	}
	
	//2.内存创建类的对象
	//4.要求此对象也必须声明为静态的
	private static Bank instance = new Bank();
	
	//3.提供公共的静态的方法，返回类的对象
	public static Bank getInstance(){
		return instance;
	}
}