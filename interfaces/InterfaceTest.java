package interfaces;
/*
 * 
 * �ӿڵ�ʹ��
 * 1.�ӿ�ʹ��interface������
 * 2.Java�У��ӿں����ǲ��е������ṹ
 * 3.��ζ���ӿڣ�����ӿ��еĳ�Ա
 * 
 * 		3.1 JDK7��ǰ��ֻ�ܶ���ȫ�ֳ����ͳ��󷽷�
 * 				> ȫ�ֳ�����public static final�ģ�������дʱ����ʡ��
 * 				> ���󷽷���public abstract��
 * 				
 * 		3.2 JDK8�����˶���ȫ�ֳ����ͳ��󷽷�֮�⣬�����Զ��徲̬������Ĭ�Ϸ���
 * 
 * 4.�ӿ��в��ܶ��幹��������ζ�Žӿڲ���ʵ����
 * 
 * 5.JAVA�����У��ӿڶ�ͨ������ȥʵ��(implements)�ķ�ʽ��ʹ�ã�
 *   ���ʵ���า���˽ӿ��е����г��󷽷������ʵ�������ʵ������
 *   �����ʵ����Ϊ������
 *   
 * 6.Java�����ʵ�ֶ���ӿ� ---> �ֲ���Java���̳еľ�����
 *   ��ʽ��class AA extends BB implements CC,DD,EE
 *   
 * 7.�ӿ�֮����Զ�̳�     
 * 
 * 8.�ӿڵľ���ʹ�ã����ֶ�̬��
 * 
 * 9.�ӿڣ�ʵ���Ͽ��Կ���һ�ֹ淶
 */
public class InterfaceTest {

	public static void main(String[] args) {
		System.out.println(Flyable.MAX_SPEED);
		System.out.println(Flyable.MIN_SPEED);
		
		Plane p1 = new Plane();
		p1.fly();
	}
}

interface Attackable{
	
	void attack();
	
}

interface Flyable{
	
	//ȫ�ֳ���
	public static final int MAX_SPEED = 7900; //��һ�����ٶ�
	int MIN_SPEED = 1;//ʡ����public static final
	//���󷽷�
	public abstract void fly();
	//ʡ����public abstract
	void stop();
}

class Plane implements Flyable{

	@Override
	public void fly() {
		System.out.println("���");
	}

	@Override
	public void stop() {
		System.out.println("ͣ��");
	}
	
}

abstract class Kite implements Flyable{

}

class Bullet extends Object implements Flyable,Attackable,CC{

	@Override
	public void attack() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void fly() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void stop() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void method1() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void method2() {
		// TODO �Զ����ɵķ������
		
	}
	
}

//************************
interface AA{
	void method1();
}
interface BB{
	void method2();
}
interface CC extends AA,BB{
	
}