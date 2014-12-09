package generics;

import java.util.ArrayList;
import java.util.Collection;


public class Generics {

	public static void main(String[] args) {
		Collection<String> arr = new ArrayList<String>();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr.add("ABC");
		arr.add("XYZ");
		arr1.add(2);
		arr1.add(3);
		//System.out.println(arr instanceof Collection<String>);
		System.out.println(arr.getClass()==arr1.getClass());
	}
	
}
