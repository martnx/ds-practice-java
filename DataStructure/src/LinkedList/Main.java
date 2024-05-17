package LinkedList;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// *****************************************************
		  
		// LinkedList =  Nodes are in 2 parts (data + address)
		//                        Nodes are in non-consecutive memory locations
		//                        Elements are linked using pointers
		
		LinkedList<String> string = new LinkedList<String>();
		/*
		string.push("A");
		string.push("B");
		string.push("C");
		string.push("D");
		string.push("F");
		string.pop();
		*/
		
		//LinkedList as a Queue
		string.offer("A");
		string.offer("B");
		string.offer("C");
		string.offer("D");
		string.offer("F");
		//string.poll();
	
		string.add(4,"E");
		string.remove("E");
		//System.out.println(string.indexOf("F"));
		
		System.out.println(string.peekFirst());
		System.out.println(string.peekLast());
		string.addFirst("0");
		string.addLast("G");
		String first = string.removeFirst();
		String last = string.removeLast();
		
		//System.out.println(first);
		
		System.out.println(string);
		
		

	}

}
