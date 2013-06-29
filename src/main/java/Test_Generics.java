import java.io.Serializable;

public class Test_Generics {
	
	public interface Interface<X extends Number> {
		
		public X getValue();
		
		public void setValue(X value);
		
	}
	
	public static class Super<X, Y, Z extends Serializable> {
		
		public void print(X param1, Y param2, Z param3) {
			System.out.println(param1 + " - " + param2 + " - " + param3);
		}
		
	}
	
	public static class Sub<X extends Number, Y, W extends Serializable> extends Super<X, Y, W> implements Interface<X> {
		
		private X value;
		
		public X getValue() {
			return value;
		}
		
		public void setValue(X value) {
			this.value = value;
		}
		
	}
	
	public static void main(String ... args) {
		
		Super s = new Super();
		Sub<String, Integer, Double> s2 = new Sub<String, Integer, Double>();
		//s2.print(new Integer(1), "teste", new Double(2.5));
		//s.prin
		
//		ArrayList<String> strings = new ArrayList<String>();
//		strings.add("João");
//		strings.add("Maria");
//		strings.add("José");
//		for (String x : strings) {
//			System.out.println(x);
//		}
//		
//		ArrayList<Integer> inteiros = new ArrayList<Integer>();
//		inteiros.add(1);
//		inteiros.add(2);
//		inteiros.add(3);
//		ArrayList<? extends Number> numeros = inteiros;
//		System.out.println(numeros);
//		
//		Sub subClass = new Sub();
//		subClass.setValue(12);
//		System.out.println(subClass.getValue());
//		subClass.print(13, "teste", 2.52);
		
	}
	
}
