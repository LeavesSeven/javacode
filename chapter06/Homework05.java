/*
�������10������1-100�����浽����
�����ӡ����ƽ��ֵ�������Сֵ�±꣬�������Ƿ���8
*/

public class Homework05 {
	public static void main(String[] args) {
		int arr[] = new int[10];


		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			// ���������
			int num = (int)(1 + Math.random() * (100 - 1 + 1));
			arr[i] = num;

			// ���
			sum += arr[i];
		}

		// ƽ��ֵ
		System.out.println("svg=" + sum / arr.length);

		// �����ӡ
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// ��ֵ
		int nMax = arr[0];
		int nMin = arr[0];
		int maxIndex = 0;
		int minIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > nMax) {
				nMax = arr[i];
				maxIndex = i;
			}
			if (arr[i] < nMin) {
				nMin = arr[i];
				minIndex = i;
			}
		}
		// �±�
		System.out.println("maxIndex=" + maxIndex);
		System.out.println("minIndex=" + minIndex);

		// ����
		boolean exist = false;
		int findNum = 8;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == findNum) {
				exist = true;
			}
		}
		if (exist) {
			System.out.println(findNum + "��������");
		} else {
			System.out.println(findNum + "����������");
		}
	}
}