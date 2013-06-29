package interfaces;

public class Teste {
	
	public static void main(String[] args) {
		
		Movimentavel[] movimentavels = {new Pessoa(), new Veiculo(), new Pessoa()};
		
	}
	
	static void movimentar(Movimentavel movimentavel) {
		movimentavel.movimentar();
	}

}
