public class PropertiesDetail {
	public static void main(String[] args) {
		// 创建Person对象
		new Person();

		// 把Person对象赋给p1
		// p1是对象名（对象引用）
		// new Person() 创建的对象空间（以及空间里的数据）才是真正的对象。
		Person p1 = new Person();

		// 属性没有赋值，会有默认值
		System.out.println("这个人的信息" + " " +
		                   p1.name + " " +
		                   p1.age + " " +
		                   p1.sal + " " +
		                   p1.isPass);
	}
}

class Person {
	// 四个属性
	int age;
	String name;
	double sal;
	boolean isPass;
}