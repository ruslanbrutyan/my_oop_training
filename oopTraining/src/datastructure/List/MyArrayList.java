package datastructure.List;

public class MyArrayList implements MyList {
	private final int capacity;
	private String[] array;
	private int currentElementId;
	public int size;

//costructors
	public MyArrayList() {
		int capacityMinValue = 10;
		capacity = capacityMinValue;
		array = new String[capacity];
		currentElementId = -1;
		size = 0;
	}

	public MyArrayList(int capacity) {
		this.capacity = capacity;
		array = new String[capacity];
		currentElementId = -1;
		size = 0;
	}

//private methods
	private void increaseArray() {
		String[] biggerArray = new String[array.length + capacity];
		for (int i = 0; i < array.length; i++) {
			biggerArray[i] = array[i];
		}
		array = biggerArray;
	}

	private void checkIndex(int index) {
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
	};

//public methods
	public void add(String el) {
		if (size == array.length) {
			increaseArray();
		}
		currentElementId++;
		array[currentElementId] = el;
		size++;

	}

	public void add(int index, String el) {

		checkIndex(index);
		if (size == array.length) {
			increaseArray();
		}
		if (index == size) {
			array[index] = el;
		} else {
			for (int right = currentElementId; right >= index; right--) {
				array[right + 1] = array[right];
			}
			array[index] = el;
		}
	}

	@Override
	public void addAll(MyList list) {
		for (int i = 0; i < list.size(); i++) {
			add(list.get(i));
		}
	}

	@Override
	public boolean remove(String el) {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++) {
			if (array[i] == el) {
				for (int j = i; j < size; j++) {
					array[j] = array[j + 1];
				}
				size--;
				return true;
			}
		}
		return false;
	}

	@Override
	public String remove(int index) {
		checkIndex(index);
		for (int i = 0; i < size; i++) {
			if (array[i] == array[index]) {
				for (int j = i; j < size; j++) {
					array[j] = array[j + 1];
				}
				size--;
				return array[i];
			}
		}
		return null;
	}

	@Override
	public void printElems() {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}

	}

	@Override
	public String get(int index) {
		checkIndex(index);
		return array[index];

	}

	@Override
	public int indexOf(String el) {
		for (int i = 0; i < size; i++) {
			if (array[i] == el) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean contains(String el) {
		for (int i = 0; i < size; i++) {
			if (array[i].equals(el)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean equals(MyList list) {
		for (int i = 0; i < size; i++) {
			if (array[i].equals(list.get(i))) {
				return false;
			}
		}
		return true;
	}
}
