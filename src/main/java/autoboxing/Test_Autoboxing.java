package autoboxing;

import java.util.LinkedList;
import java.util.List;


public class Test_Autoboxing {

	public static void main(String[] args) {
		Integer a,b,c = 2;
		a = new Integer(3);
		b = new Integer(4);
		c *= a + b;
		int d = 14;
		System.out.println(c == d);
		System.out.println(c.equals(d));
	}
	
}
