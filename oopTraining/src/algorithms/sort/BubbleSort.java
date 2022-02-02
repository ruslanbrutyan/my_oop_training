package algorithms.sort;

public class BubbleSort implements Sort {

	@Override
	public void sort(int[] arr) {
		boolean isNotSorted = true;
		int right = arr.length - 1;
		
		while (isNotSorted) {
			isNotSorted = false;
			for (int i = 0; i < right; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					isNotSorted = true;
				}
			}
			right--;
		}
	}
}
