import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;


public class Test_Queue {
	
	
	public static void main(String[] args) {
		
		Queue fila = new PriorityQueue();
		
		fila.add("1");
		fila.add("2");
		fila.add("3");
		//fila.add("4");
		
		System.out.println(fila.remove());
		System.out.println(fila.remove());
		System.out.println(fila.remove());
		System.out.println(fila.peek());
		
	}

}
