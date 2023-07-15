// 数组拷贝（要求数据空间是独立的）
public class ArrayCopy {
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3};
		// 创建新数组，开辟新的数据空间
		int arr2[] = new int[arr1.length];

		// 错误示范
		// arr2 = arr1;

		// 遍历arr1，把每个元素拷贝到arr2
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		// 输出
		System.out.println("arr1的元素");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("arr2的元素");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println( arr2[i]);
		}
		System.out.println("修改arr2第一个元素的值");

		arr2[0] = 0;
		System.out.println("arr1的元素");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("arr2的元素");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println( arr2[i]);
		}
	}
}