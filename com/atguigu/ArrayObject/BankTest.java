package com.atguigu.ArrayObject;

public class BankTest {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		bank.addCustomer("Jane", "Smith");
		
		bank.getCustomer(0).setAccount(new Account(2000));
		bank.getCustomer(0).getAccount().withdraw(500);
		bank.getCustomer(0).getAccount().deposit(1000);
		double balance = bank.getCustomer(0).getAccount().getBalance();
		System.out.println("�ͻ���" + bank.getCustomer(0).getFirstName()
				+ "���˻����Ϊ��" + balance);
		
		bank.addCustomer("����", "��");
		
		System.out.println("�ͻ�����Ϊ��" + bank.getNumOfCustomers());
	}
}
