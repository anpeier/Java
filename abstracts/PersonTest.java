package abstracts;
/*
 * 
 * ���������������
 * 
 */
public class PersonTest {

	public static void main(String[] args) {
		method(new Student());//��������
		
		Worker w = new Worker();
		method1(w);//����������������Ķ���
		
		method1(new Worker());//���������������Ķ���
		System.out.println("***********");
		
		//������һ����������Ķ���p
		Person p = new Person() {

			@Override
			public void eat() {
				System.out.println("�Զ���");
			}

			@Override
			public void breath() {
				System.out.println("����");
			}
			
		};
		method1(p);
		System.out.println("***********");
		//���������������������
		method1(new Person() {

			@Override
			public void eat() {
				System.out.println("��");
			}

			@Override
			public void breath() {
				System.out.println("����");
			}
			
		});
	}
	public static void method(Student s) {
		
	}
	public static void method1(Person p) {
		p.eat();
		p.breath();
	}
}

class Worker extends Person{

	@Override
	public void eat() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void breath() {
		// TODO �Զ����ɵķ������
		
	}
	
}