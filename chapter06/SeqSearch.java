/*
有一个数列：白眉鹰王、金毛狮王、紫衫龙王、青翼蝠王
键盘输入一个名称，判断数列中是否包含此名称，【顺序查找】
要求：如果找到了，提示找到，并给出下标
*/

import java.util.Scanner;
public class SeqSearch {
	public static void main(String[] args) {
		/*
		思路分析：
		1.定义一个字符串数组
		2.接受用户输入，遍历数组，逐一比较。如果找到，提示并退出
		*/

		// 定义一个字符串数组
		String[] names = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};

		// 接受用户输入，
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入名称");
		String findName = myScanner.next();

		boolean index = false;// 是否找到

		// 遍历数组，逐一比较。
		for ( int i = 0; i < names.length; i++) {
			// 如果找到，提示并输出下标，退出
			if (findName.equals(names[i])) {
				System.out.println("Yes, you found " + findName);
				System.out.println("subscript(下标) is" + i);
				index = true; // 找到了
				break;
			}
		}

		if (index == false) {
			System.out.println("没有找到" + findName);
		}
	}
}
