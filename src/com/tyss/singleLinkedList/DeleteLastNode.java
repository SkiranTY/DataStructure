package com.tyss.singleLinkedList;

import com.tyss.nodes.NodeClass;

public class DeleteLastNode {

	public static void main(String[] args) {
		
		SLLImplementaion head = new SLLImplementaion(10);
		SLLImplementaion second = new SLLImplementaion(20);
		SLLImplementaion third = new SLLImplementaion(30);
		SLLImplementaion fourth = new SLLImplementaion(40);
		SLLImplementaion fifth = new SLLImplementaion(50);

		head.setNext(second);
		second.setNext(third);
		third.setNext(fourth);
		fourth.setNext(null);
		
		NodeClass current = head;
		System.out.print("[");
		while (current != null) {
			System.out.print(current.getData() + ",");
			current = current.getNext();
		}
		System.out.print("]");
	}
}
