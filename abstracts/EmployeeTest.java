package abstracts;

public class EmployeeTest {
	public static void main(String[] args) {
		
		//��̬
		Employee m = new Manage("���",1001,10000,1000);
		
		m.work();
		
		Employee c = new CommonEmployee();
		c.work();
	}
}
