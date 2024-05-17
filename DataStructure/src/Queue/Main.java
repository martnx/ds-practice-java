package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.DelayQueue;

public class Main {

	public static void main(String[] args) {
		
		// *****************************************************
		
		// Queue = FIFO data structure. First-In First-Out
		//		   A collection designed for holding elements prior to processing
		//		   Linear data structure
				
		//         enqueue = offer()
		//         dequeue = poll()
				
		// Where are queues useful?
				
		// 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
		// 2. Printer Queue (Print jobs should be completed in order)
		// 3. Used in LinkedLists, PriorityQueues, Breadth-first search
				
		// *****************************************************
		
		Queue<String> line = new LinkedList<String>();
		
		System.out.println("check the queue if empty: "+line.isEmpty());
		
		line.offer("karen");
		line.offer("chad");
		line.offer("steve");
		line.offer("harold");
		
		//System.out.println(line.size());
		//System.out.println(line.peek()); //check name of first line
		System.out.println(line.contains("steve")); //check if the steve in on the line
		
		line.poll(); //karen is gone here
		line.poll();
		
		System.out.println(line);

	}

}
