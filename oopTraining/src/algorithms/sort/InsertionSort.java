package algorithms.sort;

public class InsertionSort implements Sort {
	public void sort(int[] arr) {
//		{ 5, 7, 4, 8, 9, 2, 1, 45, 89,1, 0 };
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
					arr[j + 1] = arr[j];
					j--;
			}
			arr[j + 1] = temp;
		}

	}
}

