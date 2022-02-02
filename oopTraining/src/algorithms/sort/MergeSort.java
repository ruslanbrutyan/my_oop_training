package algorithms.sort;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardUpLeftHandler;

public class MergeSort implements Sort {

	@Override
	public void sort(int[] arr) {
		if (arr.length < 2) {
			return;
		}
		int arrLength = arr.length;
		int middle = arr.length / 2;
		int[] leftSide = new int[middle];
		int[] rigthSide = new int[arrLength - middle];
		for (int i = 0; i < leftSide.length; i++) {
			leftSide[i] = arr[i];
		}
		for (int i = 0; i < rigthSide.length; i++) {
			rigthSide[i] = arr[i + middle];
		}
		sort(rigthSide);
		sort(leftSide);
		merge(arr, leftSide, rigthSide);

	}

	private void merge(int[] arr, int[] leftSide, int[] rigthSide) {
		int leftArrayLength = leftSide.length;
		int rigthArrayLength = rigthSide.length;
		int leftArrayIterator = 0, rigthArrayIterator = 0, arrIterator = 0;
		while (leftArrayIterator < leftArrayLength && rigthArrayIterator < rigthArrayLength) {
			if (leftSide[leftArrayIterator] <= rigthSide[rigthArrayIterator]) {
				arr[arrIterator] = leftSide[leftArrayIterator];
				leftArrayIterator++;
			} else {
				arr[arrIterator] = rigthSide[rigthArrayIterator];
				rigthArrayIterator++;
			}
			arrIterator++;
		}
		while (leftArrayIterator < leftArrayLength) {
			arr[arrIterator] = leftSide[leftArrayIterator];
			arrIterator++;
			leftArrayIterator++;
		}
		while (rigthArrayIterator < rigthArrayLength) {
			arr[arrIterator] = rigthSide[rigthArrayIterator];
			arrIterator++;
			rigthArrayIterator++;
		}
	}
}

//private static void mergeSort(int[] inputArray) {
//    int inputLength = inputArray.length;
//    
//    if (inputLength < 2) {
//      return;
//    }
//    
//    int midIndex = inputLength / 2;
//    int[] leftHalf = new int[midIndex];
//    int[] rightHalf = new int[inputLength - midIndex];
//    
//    for (int i = 0; i < midIndex; i++) {
//      leftHalf[i] = inputArray[i];
//    }
//    for (int i = midIndex; i < inputLength; i++) {
//      rightHalf[i - midIndex] = inputArray[i];
//    }
//    
//    mergeSort(leftHalf);
//    mergeSort(rightHalf);
//    
//    merge(inputArray, leftHalf, rightHalf);
//  }
//
//  private static void merge (int[] inputArray, int[] leftHalf, int[] rightHalf) {
//    int leftSize = leftHalf.length;
//    int rightSize = rightHalf.length;
//    
//    int i = 0, j = 0, k = 0;
//    
//    while (i < leftSize && j < rightSize) {
//      if (leftHalf[i] <= rightHalf[j]) {
//        inputArray[k] = leftHalf[i];
//        i++;
//      }
//      else {
//        inputArray[k] = rightHalf[j];
//        j++;
//      }
//      k++;
//    }
//    
//    while (i < leftSize) {
//      inputArray[k] = leftHalf[i];
//      i++;
//      k++;
//    }
//    
//    while (j < rightSize) {
//      inputArray[k] = rightHalf[j];
//      j++;
//      k++;
//    }
//    
//  }
//
//  private static void printArray(int[] numbers) {
//    for (int i = 0; i < numbers.length; i++) {
//      System.out.println(numbers[i]);
//    }
//  }
//}
