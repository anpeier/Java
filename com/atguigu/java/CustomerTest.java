package com.atguigu.java;

public class CustomerTest {
	
	public static void main(String[] args) {
		Customer cust = new Customer("Jane","Smith");
		
		Account acct = new Account(1000, 2000, 0.0123);
		
		cust.setAccount(acct);
		cust.getAccount().deposit(100);
		cust.getAccount().withdraw(960);
		cust.getAccount().withdraw(200);
		
		System.out.println("Customer[" + cust.getLastName() + "," + cust.getFirstName() + 
		"] has a account :id is " + cust.getAccount().getId() + ",annualTnterestRate is "+
		cust.getAccount().getAnnualInteresRate() * 100 +"%,balance is " + cust.getAccount().getBalance());
	}
	
}
