package com.atguigu.polymorphic;

public class FinalizeTest {
	public static void main(String[] args) {
		Person p = new Person("Peter", 12);
		System.out.println(p);
		p = null;//此时对象实体就是垃圾对象，等待被回收。但时间不确定。
		System.gc();//强制性释放空间
	}
}

class Person{
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//子类重写此方法，可在释放对象前进行某些操作
	@Override
	protected void finalize() throws Throwable {
		System.out.println("对象被释放--->" + this);
	}
	
	/*
	 * 一切类都是Object的子类，Object有toString方法，因此所有对象都有toString方法。
		打印一个对象时，打印的就是这个对象的toString方法返回值，值为:
			类名@hashCode
		因此很多时候需要程序员重写此方法，推荐写法为：
		@override
		public String toString()
		{
			return "类名[field1="  + field1 + ",field2=" + field2 + "]";
		}
	*/
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

