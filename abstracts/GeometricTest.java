package abstracts;

/*
 * 多态是运行时行为而不是编译时行为
 */
public class GeometricTest {

	public static void main(String[] args) {
		GeometricTest test = new GeometricTest();
		
		Circle c1 = new Circle("red",2,3);
		test.displayGeometricObject(c1);
		Circle c2 = new Circle("green",2,3);
		test.displayGeometricObject(c2);
		
		boolean isEquals = test.equalsArea(c1, c2);
		System.out.println("c1和c2是否相等：" + isEquals);
		
	}
	
	public void displayGeometricObject(GeometricObject o) {//GeometricObject o = new Circle(...)
		System.out.println("面积为：" + o.findArea() );
	}
	
//	测试两个对象的面积是否相等
	public boolean equalsArea(GeometricObject o1 , GeometricObject o2) {
		return o1.findArea() == o2.findArea();
	}
	
}
