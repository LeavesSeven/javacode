// 数组扩容

import java.util.Scanner;

public class ArrayAdd {
	public static void main(String[] args) {
		int arr1[] = {1, 2, 3};
		// 输出
		System.out.println("arr1的元素");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		do {
			// 创建新数组，开辟新的数据空间
			int arr2[] = new int[arr1.length + 1];
			// 遍历arr1，把每个元素拷贝到arr2
			for (int i = 0; i < arr1.length; i++) {
				arr2[i] = arr1[i];
			}
			System.out.println("请输入一个数字");
			Scanner input = new Scanner(System.in);
			// 把用户输入存在数组最后一项
			arr2[arr2.length - 1] = input.nextInt();

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

			System.out.println("是否继续输入：(y/n)");
			char key = input.next().charAt(0);
			if (key != 'y') {
				break;
			}
		} while (true);
	}
}