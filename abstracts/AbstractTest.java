package abstracts;
/*
 * abstract�ؼ��ֵ�ʹ��
 * 1.abstract:�����
 * 2.abstract�����������εĽṹ���ࡢ����
 * 
 * 3. abstract�����ࣺ������
 * 		> ���಻��ʵ����
 *      > ��������һ���й���������������ʵ����ʱ���ã��漰���������ʵ������ȫ���̣�
 *      > �����У������ṩ����������࣬���������ʵ�����������صĲ���
 * 
 * 
 * 4. abstract���η��������󷽷�
 * 		> ���󷽷�ֻ�з�����������û�з�����
 * 		> �������󷽷����࣬һ����һ�������ࡣ��֮���������п���û�г��󷽷��ġ�
 *      > ��������д�˸����е����еĳ��󷽷��󣬴����෽��ʵ����
 *        ������û����д�����е����еĳ��󷽷����������Ҳ��һ�������࣬��Ҫʹ��abstract����
 */
public class AbstractTest {
	public static void main(String[] args) {
		
		//һ��Person������ˣ��Ͳ���ʵ����
//		Person p1 = new Person();
//		p1.eat();
		
	}
}

abstract class Creature{
	public abstract void breath();
}

abstract class Person extends Creature{
	String name;
	int age;
	
	public Person(){
		
	}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	//���ǳ��󷽷���
//	public void eat(){
//		
//	}
	//���󷽷�
	public abstract void eat();
	
	public void walk(){
		System.out.println("����·");
	}
	
	
}


class Student extends Person{
	
	public Student(String name,int age){
		super(name,age);
	}
	public Student(){
	}
	
	public void eat(){
		System.out.println("ѧ�������Ӫ����ʳ��");
	}

	@Override
	public void breath() {
		System.out.println("ѧ��Ӧ�ú������ʵ�û�������Ŀ���");
	}
}
