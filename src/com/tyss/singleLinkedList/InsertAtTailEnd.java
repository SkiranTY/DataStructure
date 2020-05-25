package com.tyss.singleLinkedList;

import com.tyss.nodes.NodeClass;

public class InsertAtTailEnd {
	
	private int data;
	

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public InsertAtTailEnd(int data) {
		this.data = data;
	}

	public static void main(String[] args) {

		SLLImplementaion newnode = new SLLImplementaion(5);

		SLLImplementaion head = new SLLImplementaion(10);
		SLLImplementaion second = new SLLImplementaion(20);
		SLLImplementaion third = new SLLImplementaion(30);
		SLLImplementaion fourth = new SLLImplementaion(40);
		SLLImplementaion fifth = new SLLImplementaion(50);

		head.setNext(second);
		second.setNext(third);
		third.setNext(fourth);
		fourth.setNext(fifth);
		fifth.setNext(newnode);
		
		NodeClass current = head;
		System.out.print("[");
		while (current != null) {
			System.out.print(current.getData() + ",");
			current = current.getNext();
		}
		System.out.print("]");

	}



}
