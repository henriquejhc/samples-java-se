package collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Test_Queue {

	public static void main(String[] args) {
		
		Queue fila = new LinkedList();
		
		Queue fila2 = new PriorityQueue(2);
		fila2.add(new Object());
		fila2.add(new Object());
		fila2.add(new Object());
	
		Queue fila3 = new PriorityBlockingQueue(2);
		fila3.add(new Object());
		fila3.add(new Object());
		fila3.offer(new Object()); //fila3.add(new Object()); 
		
	}
	
}
