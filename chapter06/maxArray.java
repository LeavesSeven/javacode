// 求数组最大元素，和下标
public class maxArray {
	public static void main(String[] args) {
		int arr[] ={1,5,-7,23,4};
		int max = arr[0];//假定第一个元素就是最大值
		int maxIndex = 0;

		for(int i = 1; i < arr.length; i++){
			if (max < arr[i]){
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("max=" + max + "maxIndex=" + maxIndex);
	}
}