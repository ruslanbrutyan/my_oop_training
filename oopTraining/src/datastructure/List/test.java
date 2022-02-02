package datastructure.List;

public class test {
	public static void main(String[] args) {
//		MyList arrlist = new MyArrayList();
//		arrlist.add("1");
//		arrlist.add("2");
//		arrlist.add("3");
//		System.out.println(arrlist.get(1));
//		System.out.println(arrlist.contains("Ruslan"));
//		System.out.println(arrlist.indexOf("Ruslan"));
//		arrlist.remove(0);
//		arrlist.printElems();
//		MyList arrlist2 = new MyArrayList();
//		arrlist2.add("4");
//		arrlist2.add("5 ");
//		arrlist.addAll(arrlist2);
//		arrlist.printElems();
		MyList linkedList = new MyLinkedList();
		linkedList.add("10");
		linkedList.add("7");
		linkedList.add("5");
		linkedList.add("15");
		linkedList.add("6");
		
//		linkedList.printElems();
//		swap(linkedList, 0, 1);
//		linkedList.printElems();
//		linkedList.remove(1);
//		System.out.println(linkedList.size());
		sort(linkedList);
		linkedList.printElems();
//		System.out.println(linkedList.size());

//		linkedList.get(152);
//		linkedList.remove(5);
//		linkedList.printElems();
//		System.out.println(linkedList.get(5));
//		MyList linkedList2= new MyLinkedList();
//		linkedList2.add("a");
//		linkedList2.add("b");
//		linkedList2.add("c");
//		linkedList2.add("d");
//		System.out.println(linkedList.equals(linkedList2));
//		linkedList.remove(1);
//		linkedList.remove("d");
//		linkedList.printElems();
//		System.out.println(linkedList.get(1));
//		printMiddle(linkedList);

	}
	//// coding tasksks

	// 1)Print the Middle of a given linked list
	public static void printMiddle(MyList list) {

		System.out.println(list.get(list.size() / 2));
	}

	// 2)Flattening a linked list
	// 3)Delete the elements in an linked list whose sum is equal to zero
//	int i = Integer.parseInt (myString);
	public static void sort(MyList list) {

		boolean isNotSorted = true;
		int right = list.size() - 1;

		while (isNotSorted) {
			isNotSorted = false;
			for (int i = 0; i < right; i++) {
				if (Integer.parseInt(list.get(i)) > Integer.parseInt(list.get(i + 1))) {
					swap(list,i,i+1);
					isNotSorted = true;
//					System.out.println("x");
				}
			}
			right--;
		}
	}

	public static void swap(MyList list, int index1, int index2) {
		String temp = list.get(index1);
//		System.out.println(temp);
//		System.out.println(list.get(index1));
//		System.out.println(list.get(index2));
		list.remove(index1);
//		list.printElems();
//		System.out.println("///////////////////////////");
		list.add(index1, list.get(index1));
//		list.printElems();
//		System.out.println("///////////////////////////");
		list.remove(index2);
//		list.printElems();
//		System.out.println("///////////////////////////");
		list.add(index2, temp);
//		list.printElems();
//		System.out.println("///////////////////////////");
	}
}
