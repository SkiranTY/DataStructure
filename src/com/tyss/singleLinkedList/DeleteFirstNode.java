package com.tyss.singleLinkedList;

import com.tyss.nodes.NodeClass;

public class DeleteFirstNode {
	

	public static void main(String[] args) {

		SLLImplementaion head = new SLLImplementaion(10);
		SLLImplementaion second = new SLLImplementaion(20);
		SLLImplementaion third = new SLLImplementaion(30);
		SLLImplementaion fourth = new SLLImplementaion(40);
		SLLImplementaion fifth = new SLLImplementaion(50);

		head.setNext(null);
		second.setNext(third);
		third.setNext(fourth);
		fourth.setNext(fifth);
		
		NodeClass current = second;
		System.out.print("[");
		while (current != null) {
			System.out.print(current.getData() + ",");
			current = current.getNext();
		}
		System.out.print("]");

	}
}
