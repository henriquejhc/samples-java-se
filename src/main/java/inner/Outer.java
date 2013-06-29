package inner;

public class Outer {
	
	private int x;
	private double y;
	private int z;
	
	private Inner inner = new Inner();
	
	public class Inner {
	
		public void method() {
			x++;
		}
		
	}
	
	
	public void method() {
		z++;
	}

}
