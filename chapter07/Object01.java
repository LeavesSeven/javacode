// 面向对象编程

/*
两只猫，小白和小红。
输入名字：
正确->返回年龄，颜色
错误->显示，没有这只猫猫
 */

// 定义 猫类 （类：自定义数据类型）
class Cat {
	// 猫的属性
	String name; // 名字
	int age; // 年龄
	String color; // 颜色

	// 猫的行为（以后可增加）
}

public class Object01 {
	public static void main(String[] args) {
		// 使用面向对象（OOP）
		// 1.new Cat() 创建(实例化)一只猫
		// 2.Cat cat1 = new Cat() 把创建的猫赋给cat1
		// 3.cat1 就是一个猫对象
		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 10;
		cat1.color = "白色";
		// 实例化第二只猫
		Cat cat2 = new Cat();
		cat2.name = "小红";
		cat2.age = 12;
		cat2.color = "红色";

		// 访问对象的属性
		System.out.println("第一只猫的信息" +
		                   cat1.name + " " +
		                   cat1.age + " " +
		                   cat1.color);
		System.out.println("第二只猫的信息" +
		                   cat2.name + " " +
		                   cat2.age + " " +
		                   cat2.color);
	}
}

