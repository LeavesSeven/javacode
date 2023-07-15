/*
随机生成10个数（1-100）保存到数组
倒序打印，求平均值、最大最小值下标，并查找是否有8
*/

public class Homework05 {
	public static void main(String[] args) {
		int arr[] = new int[10];


		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			// 生成随机数
			int num = (int)(1 + Math.random() * (100 - 1 + 1));
			arr[i] = num;

			// 求和
			sum += arr[i];
		}

		// 平均值
		System.out.println("svg=" + sum / arr.length);

		// 倒序打印
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// 最值
		int nMax = arr[0];
		int nMin = arr[0];
		int maxIndex = 0;
		int minIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > nMax) {
				nMax = arr[i];
				maxIndex = i;
			}
			if (arr[i] < nMin) {
				nMin = arr[i];
				minIndex = i;
			}
		}
		// 下标
		System.out.println("maxIndex=" + maxIndex);
		System.out.println("minIndex=" + minIndex);

		// 查找
		boolean exist = false;
		int findNum = 8;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == findNum) {
				exist = true;
			}
		}
		if (exist) {
			System.out.println(findNum + "在数组里");
		} else {
			System.out.println(findNum + "不在数组里");
		}
	}
}