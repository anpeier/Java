package abstracts;

/*
 * ��̬������ʱ��Ϊ�����Ǳ���ʱ��Ϊ
 */
public class GeometricTest {

	public static void main(String[] args) {
		GeometricTest test = new GeometricTest();
		
		Circle c1 = new Circle("red",2,3);
		test.displayGeometricObject(c1);
		Circle c2 = new Circle("green",2,3);
		test.displayGeometricObject(c2);
		
		boolean isEquals = test.equalsArea(c1, c2);
		System.out.println("c1��c2�Ƿ���ȣ�" + isEquals);
		
	}
	
	public void displayGeometricObject(GeometricObject o) {//GeometricObject o = new Circle(...)
		System.out.println("���Ϊ��" + o.findArea() );
	}
	
//	�����������������Ƿ����
	public boolean equalsArea(GeometricObject o1 , GeometricObject o2) {
		return o1.findArea() == o2.findArea();
	}
	
}
