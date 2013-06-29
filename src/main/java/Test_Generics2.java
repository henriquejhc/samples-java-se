import java.util.ArrayList;

public class Test_Generics2 {

	public static void main(String[] args) {

		ArrayList<? extends Number> listaInteiros = new ArrayList<Integer>();
//		listaInteiros.add(1);
//		listaInteiros.add(2);
//		listaInteiros.add(3);
//		listaInteiros.add(4);
		imprimirLista(listaInteiros);
		
		ArrayList<? extends Double> listaDouble = new ArrayList<Double>();
		//listaDouble.add(1.0);
//		listaDouble.add(2.0);
//		listaDouble.add(3.0);
//		listaDouble.add(4.0);
		imprimirLista(listaDouble);
		
	}
	
	public static void imprimirLista(ArrayList<? extends Number> lista) {
		for (Number n : lista) {
			System.out.println(n.byteValue());
		}
	}
	
}
