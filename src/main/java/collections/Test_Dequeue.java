package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;


public class Test_Dequeue {

	public static void main(String[] args) {
		
		Deque pilha = new ArrayDeque(); // LinkedList();
		
		//Queue fila = pilha;
		
		pilha.add("1");
		pilha.add("2");
		pilha.add("3");
		pilha.add("4");
		
		System.out.println(pilha.remove());
		System.out.println(pilha.remove());
		System.out.println(pilha.remove());
		System.out.println(pilha.remove());
		
	}
	
	
}
