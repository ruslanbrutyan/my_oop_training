package datastructure.stack;

public class StackIntStatic implements Stack {
	private int array[];
	private int currentIndex;

	StackIntStatic(int size) {
		array = new int[size];
		currentIndex = -1;
		System.out.println("Static stack was created");

	}

	public void push(int value) {
		if (currentIndex == array.length - 1) {
			System.out.println("Stack Overflow");
		} else {
			array[++currentIndex] = value;
		}
	}

	public int pop() {
		if (currentIndex == -1) {
			System.out.println("Stack Is Empty");
			return 0;
		} else {
			System.out.println(array[currentIndex]);
			return array[currentIndex--];
		}
	}
}
