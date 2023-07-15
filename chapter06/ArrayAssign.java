// 数组的赋值（默认情况下是引用传递，赋的值是地址）
public class ArrayAssign {
	public static void main(String[] args) {
		// 1.基本数据类型赋值方式,值拷贝
		int n1 = 10;
		int n2 = n1;

		n2 = 30;
		System.out.println("n2 = " + n2);
		System.out.println("n1 = " + n1);
		// n2的值改变并没有影响n1

		// 2.数组数据类型赋值方式,
		int arr1[] = {1, 2, 3, 4, 5};
		int arr2[] = arr1;

		arr2[0] = 10;
		System.out.println("arr2的元素");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println( arr2[i]);
		}
		System.out.println("arr1的元素");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}

// https://www.bilibili.com/video/BV1fh411y7R8?p=165&spm_id_from=pageDriver&vd_source=4ee45a48b64e5be4a3772eaf59c39693