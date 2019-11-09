package com.atguigu.java;

public class Account {
	
	private int id;//�˺�
	private double balance;//���
	private double annualInteresRate;//������
	
	public Account (int id , double balance ,double annualInteresRate) {
		this.id = id ;
		this.balance = balance ;
		this.annualInteresRate = annualInteresRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInteresRate() {
		return annualInteresRate;
	}

	public void setAnnualInteresRate(double annualInteresRate) {
		this.annualInteresRate = annualInteresRate;
	}
	
	//ȡ���
	public void withdraw(double amount) {
		if(balance <amount) {
			System.out.println("���㣬ȡ��ʧ�ܣ�");
			return ;
		}
		balance -=amount ;
		System.out.println("�ɹ�ȡ����" + amount);
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount ;
			System.out.println("�ɹ����룺" + amount);
		}
	}
}
