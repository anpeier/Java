package abstracts;
/*
 * ����Manager����˵��������Ա���������н���(bonus)�����ԡ�
 */
public class Manage extends Employee{
	
	private double bouns;//����

	@Override
	public void work() {
		System.out.println("����Ա�������Ч��");
	}

	public Manage(double bouns) {
		super();
		this.bouns = bouns;
	}

	public Manage(String name,int id,double salary,double bouns) {
		super(name,id,salary);
		this.bouns = bouns;
	}
	
}
