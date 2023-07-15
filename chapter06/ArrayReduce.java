// 数组缩减

import java.util.Scanner;

public class ArrayReduce {
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3, 4};
		// 输出
		System.out.println("arr1的元素");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}


		for (int length = arr1.length; length > 1; length--) {

			// 创建新数组，开辟新的数据空间
			int arr2[] = new int[length - 1];
			// 遍历arr1，把每个元素拷贝到arr2
			for (int i = 0; i < arr2.length; i++) {
				arr2[i] = arr1[i];
			}
			System.out.println("缩减");

			// 让arr1指向arr2
			arr1 = arr2;

			// 输出
			System.out.println("arr2的元素");
			for (int i = 0; i < arr2.length; i++) {
				System.out.println(arr2[i]);
			}
			System.out.println("arr1的元素");
			for (int i = 0; i < arr1.length; i++) {
				System.out.println(arr1[i]);
			}

			System.out.println("是否继续缩减：(y/n)");
			Scanner input = new Scanner(System.in);
			char key = input.next().charAt(0);
			if (key != 'y') {
				break;
			}
		}
		int length = arr1.length;
		if (length == 1) {
			System.out.println("不能再缩减");
		}

	}
}