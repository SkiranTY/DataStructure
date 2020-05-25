package com.tyss.singleLinkedList;

import com.tyss.nodes.NodeClass;

public class InsertAtPartcularNode {

	private int data;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public static void main(String[] args) {

		SLLImplementaion head = new SLLImplementaion(10);
		SLLImplementaion second = new SLLImplementaion(20);
		SLLImplementaion third = new SLLImplementaion(30);
		SLLImplementaion fourth = new SLLImplementaion(40);
		SLLImplementaion fifth = new SLLImplementaion(50);

		head.setNext(second);
		second.setNext(third);
		third.setNext(fourth);
		fourth.setNext(fifth);

		SLLImplementaion newele = new SLLImplementaion(5);

		// Insert At particular Node
		// Given number Insert after 20
		NodeClass current = head;

		while (current != null) {
			if (current.getData() == 20) {
				NodeClass attach = current.getNext();
				current.setNext(newele);
				newele.setNext(attach);
			}
			current = current.getNext();
		}

		NodeClass newly = head;
		System.out.print("[");
		while (newly != null) {
			System.out.print(newly.getData() + ",");
			newly = newly.getNext();
		}
		System.out.print("]");

	}
}
