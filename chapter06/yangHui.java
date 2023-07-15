/*
使用二维数组打印一个10行杨辉三角
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
...
【提示】
1.第1行有1个元素，第n行有n个元素
2.每一行的第一个元素和最后一个元素都是1
3.从第三行开始，对于非第一个元素和最后一个元素的值arr[i][j]，有：
arr[i][j] = arr[i-1][j] + arr[i-1][j-1]
*/
public class yangHui {
	public static void main(String[] args) {

		int arr[][] = new int[10][];
		for (int i = 0; i < arr.length; i++) {

			// 我遗漏的地方，导致空指针错误
			// 给每个一维数组(行)开空间
			arr[i] = new int [i + 1];
			
			// 给每个一维数组(行)赋值
			for (int j = 0; j < arr[i].length; j++) {
				// 每一行的第一个元素和最后一个元素都是1
				if (j == 0 || j == arr[i].length - 1) {
					arr[i][j] = 1;
				} else { // 中间的
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");// 打印第i行，第j列的元素。
			}
			System.out.println();// 换行
		}
	}
}

// 这一次代码编写，我犯的错误
/*
1.二维数组开空间
2.对杨晖三角理解
3.循环条件
*/