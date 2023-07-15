// 静态初始化数组

// 六只鸡，总体重，平均体重
// 利用数组
public class chickenArray {
	public static void main(String[] args) {

		double[] hens = {3, 5, 1, 3.4, 2, 50};
		// 遍历数组得到数组所有元素的和
		// for循环
		double totalWeight = 0;
		for ( int i = 0; i < hens.length; i++) {
			System.out.println("第" + (i + 1) + "个元素的值" + hens[i]);
			// 将每一次遍历的结果累加
			totalWeight += hens[i];
		}
		// System.out.println(hens.length);

		double avgWeight = totalWeight / hens.length;
		System.out.println("总体重=" + totalWeight + "平均体重=" + avgWeight);

	}
}