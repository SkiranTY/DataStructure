package com.tyss.nodes;

public class NodeClass {

	private NodeClass head;
	private int data;
	private NodeClass next;

	public NodeClass getHead() {
		return head;
	}

	public void setHead(NodeClass head) {
		this.head = head;
		this.next = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public NodeClass getNext() {
		return next;
	}

	public Object setNext(Object object) {
		return this.next = (NodeClass) object;
	}

	public NodeClass(int data1) {
		this.data = data1;
	}

	public NodeClass() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NodeClass [head=" + head + ", data=" + data + ", next=" + next + ", getHead()=" + getHead()
				+ ", getData()=" + getData() + ", getNext()=" + getNext() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}
