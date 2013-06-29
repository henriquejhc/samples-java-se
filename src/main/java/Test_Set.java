import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class Test_Set {

	public static void main(String ...  args) {
		Set set = new HashSet();
		set.add("Joao");
		set.add("Amanda");
		set.add("Maria");
		set.add("Rodrigo");
		Iterator it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		set = new LinkedHashSet();
		set.add("Joao");
		set.add("Amanda");
		set.add("Maria");
		set.add("Rodrigo");
		it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}	
}
