
public class Test_StringBuffer {

	
	public static void main(String... strings) {
		
		String str = "teste";
		
		StringBuffer buffer = new StringBuffer("teste");
		
		for (int i = 0; i < 100000; i++) {
			//str = str.concat(str + i);
			buffer.append(i);
		}
		
		String stringFinal = buffer.toString();
		
		
	}
	
}
