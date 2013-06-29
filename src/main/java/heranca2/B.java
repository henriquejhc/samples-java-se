package heranca2;


public class B extends A {

	public int soma(int x, int y) {
		return x * y;
	}
	
	public String toString() {
		return "Ola eu sou o B";
	}
	
	public static void main(String[] args) {
		B b = new B();
		System.out.println("B = " + b);
	}

}
