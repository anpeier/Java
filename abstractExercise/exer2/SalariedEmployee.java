package abstractExercise.exer2;
/*
 * ����SalariedEmployee��̳�Employee�࣬
 * ʵ�ְ��¼��㹤�ʵ�Ա���������������private��Ա����monthlySalary��
ʵ�ָ���ĳ��󷽷�earnings(),�÷�������monthlySalaryֵ��
toString()�������Ա��������Ϣ��Ա����name��number,birthday��
 */
public class SalariedEmployee extends Employee{
	private double monthlySalary;//�¹���

	public SalariedEmployee(String name, int number, MyDate birthday) {
		super(name, number, birthday);
	}
	public SalariedEmployee(String name, int number, MyDate birthday,double monthlySalary) {
		super(name, number, birthday);
		this.monthlySalary = monthlySalary;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double earnings() {
		return monthlySalary;
	}
	
	public String toString(){
		return "SalariedEmployee[" + super.toString() + "]"; 
	}
}
