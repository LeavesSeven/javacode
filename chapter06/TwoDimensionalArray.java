// 二维数组：一维数组里的每个元素是一维数组

/*
请用二维数组输出如下图形：
0 0 0 0 0 0
0 0 1 0 0 0
0 2 0 3 0 0
0 0 0 0 0 0
*/

public class TwoDimentionalArray {
	public static void main(String[] args) {
		int arr[][] = {
			{0,0,0,0,0,0},
			{0,0,1,0,0,0},
			{0,2,0,3,0,0},
			{0,0,0,0,0,0}
		};

		// 输出二维图形
		for(int i = 0; i < arr.length; i++){
			//遍历二维数组里的每个元素。（有几行）
			for(int j = 0; j < arr[i].length; j++){
				// 遍历当前元素（数组）的元素（有几列）
				System.out.print(arr[i][j] + " ");// 打印第i行，第j列的元素。
				/*
				访问第(i+1)个一维数组的第(j+1)个值 arr[i][j]
				*/
			}
			// 换行
			System.out.println();
		}
	}
}