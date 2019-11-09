package statics;
/*
 * ��дһ����ʵ�������˻��ĸ�������������С��ʺš��������롱����������������ʡ�������С����
 * �����װ��Щ���Եķ������˺�Ҫ�Զ����ɡ�
	��д���࣬ʹ�������˻��࣬���롢���3��������������Ϣ��
	���ǣ���Щ���Կ�����Ƴ�static���ԡ�

 * 
 */
public class Account {
	
	private int id;
	private String pwd = "000000";
	private double balance;
	
	private static double interestRate;//����
	private static double minMoney;
	private static int init = 1001;//�Զ�����id
	
	public Account() {
		id = init++;
	}
	
	public Account(String pwd,double balance) {
		id = init++;
		this.pwd = pwd;
		this.balance = balance;
	}
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public static double getInterestRate() {
		return interestRate;
	}
	public static void setInterestRate(double interestRate) {
		Account.interestRate = interestRate;
	}
	public static double getMinMoney() {
		return minMoney;
	}
	public static void setMinMoney(double minMoney) {
		Account.minMoney = minMoney;
	}
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", pwd=" + pwd + ", balance=" + balance + "]";
	}
	
	
}
