package statics;
/*
 * 1.static:��̬��
 * 2.static�����������Σ����ԡ�����������顢�ڲ���
 * 
 * 3.ʹ��static�������ԣ���̬����(�����)
 * 		���ԣ����Ƿ�ʹ��static���Σ��ַ�Ϊ����̬���� vs �Ǿ�̬����(ʵ������)
 * 			ʵ�����������Ǵ�������Ķ������ÿ�����󶼶�����ӵ��һ�����еķǾ�̬���ԡ����޸�
 * 			����һ������ķǾ�̬����ʱ�����ᵼ������������ͬ��������ֵ���޸ġ�
 * 		��̬����������������Ķ�����󣬶��������ͬһ����̬��������ͨ��һ�������޸ľ�̬����
 * 		ʱ���ᵼ������������ô˾�̬����ʱ�����޸Ĺ��˵ġ�
 * 		static�������Ե�����˵����
 * 			�� ��̬����������ļ��ض����ء�����ͨ��"��.��̬����"�ķ�ʽ���е���
 * 			�� ��̬�����ļ���Ҫ���ڶ���Ĵ���
 * 			�� ������֮�����һ�Σ���̬�������ڴ���ֻ����һ�ݣ����ڷ������ľ�̬���С�
 * 			�� 		�����		ʵ������
 * 			��		yes			no
 * 			����		yes			yes
 * 			��̬���Ծ�����System.out;Math.PI;
 * 
 * 4.ʹ��static���η�������̬����
 * 		1.������ļ��ض����أ�����ͨ��"��.��̬����"�ķ�ʽ����
 * 		�� 		��̬����		�Ǿ�̬����
 * 		��		yes			no
 * 		����		yes			yes
 * 		�� ��̬�����У�ֻ�ܵ��þ�̬�ķ���������
 * 		    �Ǿ�̬�����У��ȿ��Ե��þ�̬�ķ�����Ҳ�ɵ��÷Ǿ�̬������
 * 		
 * 5.staticע��㣺
 * 		�ھ�̬�����ڣ�����ʹ��this�ؼ��֡�super�ؼ���
 * 		���ھ�̬���Ժ;�̬������ʹ�ã�Ӧ�ô��������ڵĽǶ�ȥ��⡣
 * 
 * 6.�����У����ȷ��һ�������Ƿ�����Ϊstatic�ģ�
 * 		> �����ǿ��Ա��������������ģ��������Ŷ���Ĳ�ͬ����ͬ
 * 		> ���еĳ���Ҳ��������Ϊstatic��
 * 		
 * 	�����У����ȷ��һ�������Ƿ�����Ϊstatic�ģ�
 * 		> ������̬���Եķ���ͨ����Ϊstatic��
 * 		> �������еķ�����ϰ��������Ϊstatic�ġ���Math��Arrays��Collection
 * 
 * �ڴ������ջ���ֲ�����		�ѣ�new�����Ľṹ����������
 * 			����������ļ�����Ϣ����̬�򡢳�����
 * 
 */

public class StaticTest {
	
	public static void main(String[] args) {
		
		Chinese.nation = "�й�";
		System.out.println(Chinese.nation);
		
		Chinese c1 = new Chinese();
		c1.name = "Ҧ��";
		c1.age = 40;
		c1.nation = "CHN";
		
		Chinese c2 = new Chinese();
		c2.name = "����";
		c2.age = 30;
		c2.nation = "CHINA";
		c2.info();
		
		
		System.out.println(c1.nation);
		Chinese.show();
		c2.show();
		
		//���벻ͨ��
//		Chinses.name = "�ż̿�";
//		Chinese.info();
	}
	
	
	
}

//�й���
class Chinese{
	
	String name;
	int age;
	static String nation;
	
	public void eat() {
		System.out.println("���в�");
	}
	public static void show() {
		System.out.println("�й��ˣ�");
//		eat();
//		name = "Tom";
		//���Ե��þ�̬�Ľṹ
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