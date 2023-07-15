// 动态初始化数组
// 输入成绩，存入数组，输出

import java.util.Scanner;
public class scoreArray {
	public static void main(String[] args) {
		// 1.创建数组

		// 第一种动态分配内存
		// double[] scores =  new double[5];
		// 第二种动态分配内存
		double[] scores;//声明数组（此时未分配内存空间） scores-->null
		scores = new double[5];

		// 2.循环输入
		Scanner myScanner = new Scanner(System.in);
		for ( int i = 0; i < scores.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个元素的值");
			// 存储输入
			scores[i] = myScanner.nextDouble();
		}
		
		// 3.遍历输出
		System.out.println("==当前数组的情况==");
		for ( int i = 0; i < scores.length; i++) {
			System.out.println("第" + (i + 1) + "个元素的值=" + scores[i]);
		}
	}
}