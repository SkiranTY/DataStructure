package com.tyss.singleLinkedList;

import com.tyss.nodes.NodeClass;

public class InsertAtbeginning {

	private int data;

	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public InsertAtbeginning(int data) {
		this.data = data;
	}

	public static void main(String[] args) {

		SLLImplementaion newnode = new SLLImplementaion(5);

		SLLImplementaion head = new SLLImplementaion(10);
		SLLImplementaion second = new SLLImplementaion(20);
		SLLImplementaion third = new SLLImplementaion(30);
		SLLImplementaion fourth = new SLLImplementaion(40);
		SLLImplementaion fifth = new SLLImplementaion(50);

		newnode.setNext(head);
		head.setNext(second);
		second.setNext(third);
		third.setNext(fourth);
		fourth.setNext(fifth);

		NodeClass current = newnode;
		System.out.print("[");
		while (current != null) {
			System.out.print(current.getData() + ",");
			current = current.getNext();
		}
		System.out.print("]");

	}

}
