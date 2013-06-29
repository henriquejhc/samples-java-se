package enumeration;

public class TestEnum {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Rodrigo");
		cliente.setRg("123123");
		cliente.setSexo(Sexo.MASCULINO);
	
		
		Veiculo veiculo = Veiculo.GOL;
	}

}
