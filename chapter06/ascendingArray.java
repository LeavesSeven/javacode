/*
���������������Ԫ�أ���������Ȼ������
˼·��
1.ȷ�������λ�ã���λ��
	����arr���飬
	������� insertNum <= arr[i]��˵��i����������Ҫ�����λ��
		��index = i
	���û�з��֣�index = arr.length (����ӵ�������ĩβ)
2.����
*/
public class ascendingArray {
	public static void main(String[] args) {
		int arr[] = {10, 12, 45, 90};
		int insertNum = 23;
		int index = -1;// ����Ҫ�����λ��

		// ��λ��ȷ�������λ�ã�
		for(int i = 0; i < arr.length; i++){
			if(insertNum <= arr[i]){
				index = i;// ��¼i
				break;// �ѳ�ѭ��
			}
		}// ���û�н���if��index��ֵ��-1
		if(index == -1){// ˵��û���ҵ�λ��
			index = arr.length;
		}
		System.out.println("Ҫ�����λ�ã�" + (index + 1));

		// ����
			// �ؼ�������Ҫ�����λ��
		int arrNew[] = new int[arr.length + 1];
		for (int i = 0, j = 0; i < arrNew.length; i++) {
			// if (j != index) { // ������룬i���������������j��Ҫ�����飨�����룩������
			if (i != index) {
				arrNew[i] = arr[j];
				j++;
			} else {
				arrNew[i] = insertNum;
			}
		}
			// ����ԭ��������
		arr = arrNew;

		// ���
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
}


// ��������������