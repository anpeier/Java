package singleton;

/*
 * ����ʽ��ʵ��
 */
public class SingletonTest2 {
	
	public static void main(String[] args) {
		Order o1 = Order.getInstance();
		Order o2 = Order.getInstance();
		
		System.out.println(o1 == o2);
	}
}

class Order{
	
	//1.˽�л���Ĺ�����
	private Order() {
		
	}
	
	//2.������ǰ�����
	//4.�˶���Ҳ��������Ϊstatic
	private static Order instance = null;
	
	//3.����public��static�ķ��ص�ǰ�����ķ���
	public static Order getInstance(){
		if (instance == null) {
			instance = new Order();
		}
		return instance;
	}
}