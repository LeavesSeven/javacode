// 冒泡排序

// 无序数据 --> 从小到大排列
public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {4, 6, 3, 5, 2};
		// 输出
		System.out.println("arr的元素");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		for ( int i = 0; i < arr.length - 1; i++) {// 外层循环的次数 4

			// 错误示范
			// for (int j = 0; j < arr.length - 1; j++) {// 比较次数：4 4 4 4

			//因为每一轮都确定一个大数
			for (int j = 0; j < arr.length - i - 1; j++) {// 比较次数：4 3 2 1
				if (arr[j] > arr[j + 1]) {
					// 交换
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
					// 输出
		System.out.println("\n第"+ (i+1) +"轮");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + "\t");
		}
		}

	}
}