import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;


public class Test_Generics_Collections {

	public static void main(String ... args) {
		
		
		ArrayList listNormal = new ArrayList();
		
		ArrayList<Integer> listInteiros = new ArrayList<Integer>();
		listInteiros.add(new Integer(1));
		listInteiros.add(2);
		
		HashSet<Integer> setInteiros = new HashSet<Integer>();
		
		HashMap<Integer, String> mapInteirosStrings = new HashMap<Integer, String>();
		mapInteirosStrings.put(1, "teste");
		
	}
	
}
