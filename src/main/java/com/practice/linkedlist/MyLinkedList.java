package com.practice.linkedlist;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;

	public MyLinkedList() {
		head = null;
		tail = null;
	}

	public void add(INode myNode) {
		if (this.tail == null)
			this.tail = myNode;
		if (this.head == null)
			this.head = myNode;
		else {
			INode tempNode = this.head;
			this.head = myNode;
			this.head.setNext(tempNode);
		}
	}
}
