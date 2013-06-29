

public class Test_InnerClasses {


	public static void main(String ... args) {
		
		// 2 objetos envolvidos (1 classe externa + 1 classe interna)
		OuterClass.Inner i = new OuterClass().new Inner();
		
		// 1 objeto (direto objeto classe interna)
		OuterClass.InnerStatic i2 = new OuterClass.InnerStatic();
		
		
	}
		
}
