package codeBlock;

/*
 * ��ĳ�Ա֮�ģ������(��ʼ����)
 * 1.���ã�������ʼ���ࡢ����
 * 2.�������������Σ�ֻ��ʹ��static��
 * 3.���ࣺ��̬����� vs �Ǿ�̬�����
 * 
 * 4.��̬����飺
 * 		>�ڲ�������������
 * 		>������ļ��ض�ִ�У�ֻ��ִ��һ��
 * 		>���ã����Գ�ʼ�������Ϣ
 * 		>���һ�����ж����˶����̬����飬�����������Ⱥ�˳��ִ��
 * 		>��̬������ִ�������ڷǾ�̬�����
 * 		>ֻ�ܵ��þ�̬�Ľṹ�����ܵ��÷Ǿ�̬�ṹ
 * 
 * 5.�Ǿ�̬����飺
 * 		>�ڲ�������������
 * 		>���Ŷ���Ĵ�����ִ��
 * 		>ÿ����һ�������ִ��һ�ηǾ�̬�����
 * 		>���ã������ڴ�������ʱ���Զ�������ԵȽ��г�ʼ��
 * 		>���һ�����ж����˶������飬�����������Ⱥ�˳��ִ��
 * 		>�ܵ��þ�̬�Ľṹ��Ҳ�ܵ��÷Ǿ�̬�ṹ
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
	//����
	String name;
	int age;
	static String desc = "����һ����";
	
	//������
	public Person() {
		
	}	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//static�����
	static{
		System.out.println("hello,static block-1");
		desc = "����һ����ʵ��";
		info();
	}
	static{
		System.out.println("hello,static block-2");
	}
	
	//��static�����
	{
		System.out.println("hello,block-1");
		age = 1;
		eat();
		desc = "���Ǻ���";
		info();
	}
	{
		System.out.println("hello,block-2");
	}
	
	//����
	public void eat() {
		System.out.println("�Է�");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public static void info() {
		System.out.println("���ֵ���");
	}
	
}