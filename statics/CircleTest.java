package statics;
//static�ؼ���Ӧ��
public class CircleTest {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle(2.2);
		System.out.println("c1��id��" + c1.getId());
		System.out.println("c2��id��" + c2.getId());
		System.out.println("c3��id��" + c3.getId());
		
		System.out.println("������Բ����Ϊ��" + Circle.getTotal());
	}
	
}

class Circle {

	private double radius;
	private int id;
	
	public Circle() {
		id = init++;
		total++;
	}
	
	public Circle(double radius) {
		this();
//		id = init++;
//		total++;
		this.radius = radius;
	}
	
	private static int total;//��¼����Բ�ĸ���
	private static int init = 1001;//���������
	
	public double findArea() {
		return 3.14 * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public int getId() {
		return id;
	}

	public static int getTotal() {
		return total;
	}

}
