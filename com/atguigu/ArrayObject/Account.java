package com.atguigu.ArrayObject;

public class Account {
	
	private double balance ;
	
	public Account(double init_balance) {
		this.balance = init_balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//��Ǯ����
	public void deposit(double amt) {
		if(amt > 0) {
			balance += amt ;
			System.out.println("��Ǯ�ɹ�");
		}
	}
	
	//ȡǮ����
	public void withdraw(double amt) {
		if(balance >= amt) {
			balance -= amt ;
			System.out.println("ȡǮ�ɹ�");
		}else {
			System.out.println("����");
		}
	}
	
}
