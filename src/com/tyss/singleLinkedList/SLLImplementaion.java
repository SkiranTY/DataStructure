package com.tyss.singleLinkedList;

import com.tyss.nodes.NodeClass;

public class SLLImplementaion extends NodeClass{
	 
	private int data;

	public SLLImplementaion(int data1) {
		super(data1);
		
	}

	public SLLImplementaion() {
		super();
	}

	
		
	@Override
	public String toString() {
		return "SLLImplementaion [data=" + data +  ", getHead()=" + getHead()
				+ ", getData()=" + getData() + ", getNext()=" + getNext()
				+  "]";
	}


	static SLLImplementaion sll = new SLLImplementaion();
	
	
	public static void main(String[] args) {
		sll.create();
	}
	
	
	public void create() {
		
		SLLImplementaion head =new SLLImplementaion(10);
		SLLImplementaion second = new SLLImplementaion(20);
		SLLImplementaion third = new SLLImplementaion(30);
		SLLImplementaion fourth = new SLLImplementaion(40);
		SLLImplementaion fifth = new SLLImplementaion(50);
		
		 head.setNext(second);
		 second.setNext(third);
		 third.setNext(fourth);
		 fourth.setNext(fifth);
		 
		 NodeClass current = head;
		 System.out.print("[");
		 while(current!=null) {
			 System.out.print(current.getData()+",");
			 current = current.getNext();
		 }
		 System.out.print("]");
	}

}
