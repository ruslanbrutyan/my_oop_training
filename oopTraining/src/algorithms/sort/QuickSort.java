package algorithms.sort;

public class QuickSort implements Sort {

	@Override
	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		sort(arr, 0, arr.length - 1);
	}

	private void sort(int[] arr, int lowIndex, int highIndex) {
		if (lowIndex >= highIndex) {
			return;
		}
		int pivot = arr[highIndex];
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		while (leftPointer < rightPointer) {
			while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			swap(arr,leftPointer,rightPointer); 
		}
		swap(arr,leftPointer,highIndex); 
		sort(arr, lowIndex, leftPointer - 1);
		sort(arr, leftPointer + 1, highIndex);

	};

	private void swap(int[] arr,int index1 ,int  index2) {
		int temp = arr[index1];
		arr[index1]=arr[index2];
		arr[index2]= temp;

	}
}
