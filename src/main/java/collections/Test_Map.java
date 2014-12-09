package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test_Map {
	
	public static void main(String[] args) {
		
		Map mapa = new HashMap();
		
		mapa.put("1234", "Rodrigo Silva");
		mapa.put("4321", "Maria");
		mapa.put("7654", "Joao");
		mapa.put("1234", "Jose");
		
		
		String nome = (String) mapa.get("4321");
		
		Set keys = mapa.keySet();
		Iterator iteratorChaves = keys.iterator();
		
		while (iteratorChaves.hasNext()) {
			String key = (String) iteratorChaves.next();
			String value = (String) mapa.get(key);
			System.out.println(value);
		}
		
		
		for (Object key : mapa.keySet()) {
			String value = (String) mapa.get(key);
		}
 		
		if (!mapa.containsKey("1234")) {
			mapa.put("1234", "Rafael");
		}
		
		Collection values = mapa.values();
		
	}

}
