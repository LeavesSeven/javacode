// 动态初始化数组-列数不确定

/*
	动态创建下列的数组，并输出
	1
	2 2
	3 3 3

	一共有三个一维数组，每个一维数组里的元素个数不一样。
*/

public class IrregularTDArray{
	public static void main(String[] args){
		int arr[][] = new int[3][];
		for(int i = 0; i < arr.length; i++){// 遍历每一个一维数组
			//给每一个一维数组开空间 new ，否则arr[i]为null
			arr[i] = new int[i + 1];

			// 遍历一维数组，并给每一个一维数组的元素赋值
			for( int j = 0; j < arr[i].length; j++){
				arr[i][j] = i + 1;
			}
		}

		// 遍历输出arr
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();// 换行
		}
	}
}