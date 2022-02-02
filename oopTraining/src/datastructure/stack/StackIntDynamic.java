package datastructure.stack;

import java.util.Iterator;

public class StackIntDynamic implements Stack {
	private static final int DEFAULT_SIZE = 10;
	private int array[];
	private int currentIndex;

	StackIntDynamic() {
		array = new int[DEFAULT_SIZE];
		currentIndex = -1;
		System.out.println("Dynamic stack was created");
	}

	public void push(int value) {
		if (++currentIndex == array.length) {
			int tempArray[] = new int[array.length + DEFAULT_SIZE];
			for (int i = 0; array.length > i; i++) {
				tempArray[i] = array[i];
			}
			array = tempArray;
			array[currentIndex] = value;
		} else {
			array[currentIndex] = value;
		}
	}

	public int pop() {
		if (currentIndex == array.length - DEFAULT_SIZE) {
			int tempArray[] = new int[array.length - DEFAULT_SIZE];
			for (int i = 0; i < tempArray.length; i++) {
				tempArray[i] = array[i];
			}
			int temp = array[currentIndex--];
			array = tempArray;
			System.out.println(temp);
			return temp;
		} else if (currentIndex == -1) {
			System.out.println("stack Is Empty");
			return 0;
		} else {
			System.out.println(array[currentIndex]);
			return array[currentIndex--];
		}

	}
}
