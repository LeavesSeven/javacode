public class Homework07 {
	public static void main(String[] args) {
		int arr[] = { -1, 23, 44, 12, 90};
		int temp = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
	}
}