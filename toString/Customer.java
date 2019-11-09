package toString;

public class Customer {

	 private String name;
	 private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Customer() {
		super();
	}
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//自动生成
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	 
//	//比较两个对象的"实体内容"是否相同
//	//手动实现
//	public boolean equals(Object obj) {
//		if (this == obj) {//如果地址相同，直接返回true
//            return true;
//        }
//		
//		if(obj instanceof Customer) {
//			Customer cust = (Customer)obj;
//			//比较两个对象的每个属性是否相同
////			if(this.age == cust.age && this.name.equals(cust.name) ){
////				return true;
////			}else {
////				return false;
////			}
//			return this.age == cust.age && this.name.equals(cust.name);
//		}
//		
//		return false;
//	}
	
	//自动生成
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}
	
}
