package Priority_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		//Priority Queue = A FIFO data structure that serves elements
    	//                             with the highest priorities first 
    	//				  before elements with lower priority
    	
    	//Strings in default order
		
		Queue<Double> queueDouble = new PriorityQueue();
		
		queueDouble.offer(3.0);
		queueDouble.offer(1.5);
		queueDouble.offer(2.5);
		queueDouble.offer(1.0);
		queueDouble.offer(2.0);
		
		while(!queueDouble.isEmpty()) {
			System.out.println(queueDouble.poll());
		}
		
		Queue<String> queue = new PriorityQueue();
			
		queue.offer("Almond");
		queue.offer("Cat");
		queue.offer("Zebra");
		queue.offer("Tiger");
		queue.offer("Pig");
		
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
			
		}
	}

}
