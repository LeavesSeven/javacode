// 二维数组的动态初始化

public class TDArray {
	public static void main(String[] args) {
		// 第一种
		int arr[][] = new int[2][3];
		// 第二种
		/*
		int arr[][];
		arr = new int[2][3];
		*/
		arr[1][1] = 8;

		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");// 打印第i行，第j列的元素。
			}
			System.out.println();// 换行
		}
	}
}