/*
ʹ�ö�ά�����ӡһ��10���������
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
...
����ʾ��
1.��1����1��Ԫ�أ���n����n��Ԫ��
2.ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض���1
3.�ӵ����п�ʼ�����ڷǵ�һ��Ԫ�غ����һ��Ԫ�ص�ֵarr[i][j]���У�
arr[i][j] = arr[i-1][j] + arr[i-1][j-1]
*/
public class yangHui {
	public static void main(String[] args) {

		int arr[][] = new int[10][];
		for (int i = 0; i < arr.length; i++) {

			// ����©�ĵط������¿�ָ�����
			// ��ÿ��һά����(��)���ռ�
			arr[i] = new int [i + 1];
			
			// ��ÿ��һά����(��)��ֵ
			for (int j = 0; j < arr[i].length; j++) {
				// ÿһ�еĵ�һ��Ԫ�غ����һ��Ԫ�ض���1
				if (j == 0 || j == arr[i].length - 1) {
					arr[i][j] = 1;
				} else { // �м��
					arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");// ��ӡ��i�У���j�е�Ԫ�ء�
			}
			System.out.println();// ����
		}
	}
}

// ��һ�δ����д���ҷ��Ĵ���
/*
1.��ά���鿪�ռ�
2.�������������
3.ѭ������
*/