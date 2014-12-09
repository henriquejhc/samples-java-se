package heranca.sample01;

public class C extends B {

	{
		System.out.println("Bloco inicializacao C");
	}
	
	public C() {
		super(1);
		System.out.println("Construtor C1");
	}
	
	public C(int x) {
		this();
		System.out.println("Construtor C2");
	}
	
	public static void main(String[] args) {
		new C(2);
	}
	
	
	
}
