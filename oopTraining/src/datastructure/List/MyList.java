package datastructure.List;

public interface MyList {
	 void add(String el);
	 void add(int index, String el);
	 void addAll(MyList list);
	 boolean remove(String el);
	 String remove(int index);
	 void printElems();
	 String get(int index);
	 int indexOf(String el);
	 int size();
	 boolean contains(String el);
	 boolean equals(MyList list);
}
