package singleton;

/*
 * �������ģʽ��
 * 1.��ν�������ģʽ�����ǲ�ȡһ���ķ�����֤�����������ϵͳ�У���ĳ����ֻ�ܴ���
 * 	  һ������ʵ����
 * 
 * 2.���ʵ�֣�
 * 	 1.����ʽ
 *   2.����ʽ
 *   
 * 3.��������ʽ�Ͷ���ʽ
 *     ����ʽ��
 *     		�ô����߳��ǰ�ȫ��
 *     		�������������ʱ�����
 *     ����ʽ��
 *     		�ô����ӳٶ���Ĵ���
 *     		Ŀǰд���������̲߳���ȫ --->���߳�����ʱ�޸�
 * 
 * 	Ӧ�ó�����
 * 		��վ�ļ�����
 *      Ӧ�ó������־Ӧ��
 *      ���ݿ�����ӳ�
 *      ��ȡ�����ļ�����
 *      Application�ǵ����ĵ���Ӧ��
 *      Windows��Task Manage(���������)
 *      Windows��Recycle Bin(����վ)
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

//����ʽ
class Bank{
	
	//1.˽�л���Ĺ�����
	private Bank() {
		
	}
	
	//2.�ڴ洴����Ķ���
	//4.Ҫ��˶���Ҳ��������Ϊ��̬��
	private static Bank instance = new Bank();
	
	//3.�ṩ�����ľ�̬�ķ�����������Ķ���
	public static Bank getInstance(){
		return instance;
	}
}