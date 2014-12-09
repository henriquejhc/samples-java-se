package heranca.sample01;

public class B extends A {

	{
		System.out.println("Bloco inicializacao B");
	}

	
	public B(int x) {
		super(x);
		System.out.println("Construtor B");
	}
	
}
