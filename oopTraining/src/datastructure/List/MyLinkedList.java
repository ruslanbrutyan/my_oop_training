package datastructure.List;

import java.util.List;

public class MyLinkedList implements MyList {

	private int size;
	private Node firstNode;

//inner class Node
	private class Node {
		String el;
		Node prevNode;
		Node nextNode;

		Node(String el, Node prevNode, Node nextNode) {
			this.el = el;
			this.prevNode = prevNode;
			this.nextNode = nextNode;
		};

	}

//constructor
	public MyLinkedList() {
		// TODO Auto-generated constructor stub
		size = 0;
	}

//private methods 
	private void deleteNode( int index) {
		if (index == 0) {
			Node prevNode = firstNode.prevNode;
			firstNode = firstNode.nextNode;
			firstNode.prevNode = prevNode;
		} else if (index == size - 1) {
			Node prevNode = getNode(index).prevNode;
			prevNode.nextNode = null;
			firstNode.prevNode = prevNode;
		} else {
			Node prev = getNode(index).prevNode;
			Node next = getNode(index).nextNode;
			prev.nextNode = next;
			next.prevNode = prev;
		}
		size--;
	}

	private Node getNode(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		if (index <= size / 2) {
			Node nextNode = firstNode;
			for (int i = 0; i < index; i++) {
				nextNode = nextNode.nextNode;
			}
			return nextNode;
		} else {
			Node lastNode = firstNode.prevNode;
			for (int i = size - 1; i > index; i--) {
				lastNode = lastNode.prevNode;
			}
			return lastNode;
		}

	}

//methods
	@Override
	public void add(String el) {
		// TODO Auto-generated method stub
		if (firstNode == null) {
			firstNode = new Node(el, null, null);
		} else {

			Node node = getNode(size - 1);
			Node lastNode = new Node(el, node, null);
			node.nextNode = lastNode;
			firstNode.prevNode = lastNode;
		}
		size++;

	}

	@Override
	public void add(int index, String el) {
		// TODO Auto-generated method stub
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		if (index == 0) {
			Node node = new Node(el, firstNode.prevNode, firstNode);
			firstNode = node;
			Node nextNode = node.nextNode;
			nextNode.prevNode=firstNode;
		} else if (index == size) {
			Node node = getNode(size - 1);
			node.nextNode = new Node(el, node, null);
			firstNode.prevNode = node.nextNode;
		} else {
			Node nextNode = getNode(index);
			Node prevNode = nextNode.prevNode;
			Node cureNode = new Node(el, prevNode, nextNode);
			prevNode.nextNode = cureNode;
			nextNode.prevNode = cureNode;

		}
		size++;
	}

	@Override
	public void addAll(MyList list) {
		// TODO Auto-generated method stub
		Node lastNode = getNode(size - 1);
		for (int i = 0; i < list.size(); i++) {
			lastNode.nextNode = new Node(list.get(i), lastNode, null);
			lastNode = lastNode.nextNode;
			size++;
		}
		firstNode.prevNode = lastNode;

	}

	@Override
	public boolean remove(String el) {
		// TODO Auto-generated method stub
		Node removedNode = firstNode;
		for (int i = 0; i < size; i++) {
			if (removedNode.el.equals(el)) {
				deleteNode(i);
				return true;
			}
			removedNode = removedNode.nextNode;
		}
		return false;
	}

	@Override
	public String remove(int index) {
		// TODO Auto-generated method stub
		Node removedNode = getNode(index);
		deleteNode(index);
		return removedNode.el;

	}

	@Override
	public void printElems() {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++) {
			System.out.println(getNode(i).el);
		}

	}

	@Override
	public String get(int index) {
		// TODO Auto-generated method stub
		Node node = getNode(index);
		return node.el;
	}

	@Override
	public int indexOf(String el) {
		Node node = firstNode;
		for (int i = 0; i < size; i++) {
			if (node.el == el) {
				return i;
			}
			node = node.nextNode;
		}
		return -1;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean contains(String el) {
		// TODO Auto-generated method stub
		Node node = firstNode;
		for (int i = 0; i < size; i++) {

			if (node.el.equals(el)) {

				return true;
			}
		}
		return false;
	}

	@Override
	public boolean equals(MyList list) {
		// TODO Auto-generated method stub
		if (size != list.size() || size == 0) {
			return false;
		}
		Node node = firstNode;
		for (int i = 0; i < size; i++) {
			if (!node.el.equals(list.get(i))) {

				return false;
			}

			node = node.nextNode;
		}
		return true;
	}
}
