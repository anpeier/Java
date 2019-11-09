package abstracts;

public class EmployeeTest {
	public static void main(String[] args) {
		
		//¶àÌ¬
		Employee m = new Manage("¿â¿Ë",1001,10000,1000);
		
		m.work();
		
		Employee c = new CommonEmployee();
		c.work();
	}
}
