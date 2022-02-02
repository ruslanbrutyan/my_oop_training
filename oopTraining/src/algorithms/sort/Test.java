package algorithms.sort;

public class Test {
	public static void main(String args[]) {
		int[] arr = { 10,7,5,15,6};
		Sort sortArray = new BubbleSort();
		sortArray.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
