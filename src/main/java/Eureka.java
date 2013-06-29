
public class Eureka {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("asdfg");
		builder.insert(3, "qwert");
		builder.reverse();
		builder.append(123); // gftrewqdsa123
		builder.delete(6, 9); 
		
		System.out.println(builder); // gftrewa123
		
	}
	
	
}
