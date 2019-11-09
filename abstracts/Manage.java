package abstracts;
/*
 * 对于Manager类来说，他既是员工，还具有奖金(bonus)的属性。
 */
public class Manage extends Employee{
	
	private double bouns;//奖金

	@Override
	public void work() {
		System.out.println("管理员工，提高效率");
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
