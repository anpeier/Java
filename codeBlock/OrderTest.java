package codeBlock;
/*
 * �����Կ��Ը�ֵ��λ�ã�
 * 		��Ĭ�ϳ�ʼ��
 * 		����ʾ��ʼ�� / ���ڴ�����и�ֵ
 * 		�۹������г�ʼ��
 * 		�����˶����Ժ󣬿���ͨ��"����.����"��"����.����"�ķ�ʽ
 * 		
 * 
 * ִ�е��Ⱥ�˳�򣺢� - �� / �� - �� - ��
 */
public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		System.out.println(order.orderId);
	}
}

class Order{
	
	int orderId = 3;
	
	{
		orderId = 4;
	}
}
