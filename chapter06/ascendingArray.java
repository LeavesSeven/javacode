/*
在升序数组里插入元素，该数组仍然是升序
思路：
1.确定插入的位置（定位）
	遍历arr数组，
	如果发现 insertNum <= arr[i]，说明i就是新数组要插入的位置
		令index = i
	如果没有发现，index = arr.length (即添加到新数组末尾)
2.扩容
*/
public class ascendingArray {
	public static void main(String[] args) {
		int arr[] = {10, 12, 45, 90};
		int insertNum = 23;
		int index = -1;// 保存要插入的位置

		// 定位（确定插入的位置）
		for(int i = 0; i < arr.length; i++){
			if(insertNum <= arr[i]){
				index = i;// 记录i
				break;// 脱出循环
			}
		}// 如果没有进入if，index的值是-1
		if(index == -1){// 说明没有找到位置
			index = arr.length;
		}
		System.out.println("要插入的位置：" + (index + 1));

		// 扩容
			// 关键：跳过要插入的位置
		int arrNew[] = new int[arr.length + 1];
		for (int i = 0, j = 0; i < arrNew.length; i++) {
			// if (j != index) { // 错误代码，i是新数组的索引，j是要旧数组（被插入）的索引
			if (i != index) {
				arrNew[i] = arr[j];
				j++;
			} else {
				arrNew[i] = insertNum;
			}
		}
			// 销毁原来的数组
		arr = arrNew;

		// 输出
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}


// 本题我做不出来