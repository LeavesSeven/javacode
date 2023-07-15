// cahr数组存放26个字母，for循环打印
public class A_ZArray {
	public static void main(String[] args) {
		char chars[] = new char[26];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = (char)('A' + i); // 'A' + i 是 int，所以需要强制转换为char类型
		}

		System.out.println("== chars数组 ==");
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i] + " ");
		}
	}
}