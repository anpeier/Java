package codeBlock;

/*
 * 
 * final:���յ�
 * 
 * 1.final�����������εĽṹ���ࡢ����������
 * 
 * 2.final ��������һ����:���ܱ�������̳�
 * 			���磺String�ࡢSystem�ࡢStringBuffer��
 * 
 * 3.final �������η����������˷��������Ա���д
 * 			���磺Object��getClass();
 * 
 * 4.final �������α�������ʱ��"����"�ͳ�Ϊ����
 * 			final �������ԣ����Կ��Ǹ�ֵ��λ���У���ʾ��ʼ����������г�ʼ�����������г�ʼ��
 * 			final ���ξֲ�������
 * 					������ʹ��final�����β�ʱ���������β���һ�������������ǵ��ô˷���ʱ���������βθ�ֵһ��ʵ�Σ�
 * 					һ����ֵ�Ժ󣬾�ֻ���ڷ�������ʹ�ô��βΣ����ܽ������¸�ֵ��
 * 
 * static final : �����������ԣ�ȫ�ֳ���
 */
public class FinalTest {
	
	final int WIDTH = 0;
	final int LEFT;
	final int RIGHT;
//	final int DOWN;
	
	{
		LEFT = 1;
	}
	
	public FinalTest() {
		RIGHT =2;
	}
	public FinalTest(int n) {
		RIGHT =2;
	}
	
//	public void setDown(int down){
//		this.DOWN = down;
//	}
	
	public void doWidth() {
//		width = 20;//���ܶԳ�����ֵ
	}
	
	public void show() {
		final int NUM = 10;//����
//		NUM += 20;
	}
	
	public void show(final int num) {
//		num = 20;
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		
		int num =10;
		num += 5;
		
		FinalTest test = new FinalTest();
		test.show(10);
		
	}
}

final class FinalA{
	
}

//class B extends FinalA{
//	
//}
class AA{
	public final void show() {}
}
class BB extends AA{
//	public void show() {}//������д�����final����
}