package com.atguigu.ArrayObject;

public class Bank {
	
	private Customer[] customers ; //��Ŷ���ͻ�������
	private int numberOfCustomers ;//��¼�ͻ��ĸ���
	
	public Bank() {
		customers = new Customer[10];
	}
	
	//��ӿͻ�
	
	public void addCustomer(String f, String l) {
		Customer cust = new Customer(f , l);
//		customers[numberOfCustomers] = cust ;
//		numberOfCustomers++;
		customers[numberOfCustomers++] = cust ;
	}
	
	//��ȡ�ͻ�����
	public int getNumOfCustomers() {
		return numberOfCustomers;
	}
	
	//��ȡָ���ͻ�
	public Customer getCustomer(int index) {
		if(index >=0 && index <numberOfCustomers) {
			return customers[index];
		}
		return null;
	}
	
}
