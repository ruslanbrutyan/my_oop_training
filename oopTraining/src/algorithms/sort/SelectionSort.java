package algorithms.sort;

public class SelectionSort implements Sort {

	@Override
	public void sort(int[] arr) {
//		int[] arr = { 47, 11, 50, 39, 61, 66, 25, 12, 72,5 };
		for (int i = 0; i < arr.length; i++) {
			int minimalValueIndex = i;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[minimalValueIndex]>arr[j]) {
					minimalValueIndex=j;
				}
			}
//			System.out.println("i="+i);
//			System.out.println("j="+j);
			int temp =arr[minimalValueIndex];
			arr[minimalValueIndex]=arr[i];
			arr[i]= temp;
		}
	}
}