
public class MethodParameter02 {
    public static void main(String[] args) {
        // 测试1
        B b = new B();
        int[] arr = { 1, 2, 3 };
        b.test100(arr);// 调用方法
        System.out.println(" main的 arr数组 ");
        // 遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        // 测试2
        Person00 p = new Person00();
        p.name = "jack";
        p.age = 10;
        b.test200(p);
        // 测试题, 如果 test200 执行的是 p = null ,下面的结果是 10
        // 测试题, 如果 test200 执行的是 p = new Person();..., 下面输出的是10
        System.out.println("main 的p.age=" + p.age);// 10000

    }
}

class B {
    /*
     * 可以接收一个数组，在方法中修改该数组，看看原来的数组是否变化
     */
    public void test100(int[] arr) {
        arr[0] = 200;// 修改元素
        // 遍历数组
        System.out.println(" test100的 arr数组 ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public void test200(Person00 p) {
        // 1.修改传入方法的对象p
        p.age = 10000; 
        // 2.新创建一个同名对象
        // p = new Person00();
        // p.name = "tom";
        // p.age = 99;
        // 3.形参置空
        // p = null;
    }
}

class Person00 {
	String name;
	int age; 
}