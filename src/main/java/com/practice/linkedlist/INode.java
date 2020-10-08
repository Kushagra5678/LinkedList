package com.practice.linkedlist;

public interface INode<K extends Comparable>  {
	K getKey();

	void setKey(K key);

	INode getNext();

	void setNext(INode next);

}
