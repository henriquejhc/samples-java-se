package thread2;

public class Banco {
	
	private Conta contas[];
	private static final int TRANSACOES_PARA_IMPRESSAO = 10000;
	public int contadorTransacoes = 0;
	
	
	public Banco(int numeroContas, int saldoInicial) {
		this.contas = new Conta[numeroContas];
		for (int i = 0; i < numeroContas; i++) {
			contas[i] = new Conta(saldoInicial);
		}
	}
	
	// Regiao crítica
	public void transferir(int contaSaque, int contaDeposito, int valor) {
		synchronized (this) {
			if (contas[contaSaque].saldo < valor) 
				return;
			
			contas[contaSaque].saldo -= valor;
			contas[contaDeposito].saldo += valor;
			
			contadorTransacoes++;
			if (contadorTransacoes % TRANSACOES_PARA_IMPRESSAO == 0)
				imprimeTotal();
		}

	}
	
	public int getNumeroContas() {
		return contas.length;
	}
	
	private void imprimeTotal() {
		int total = 0;
		for (int i = 0; i < contas.length; i++) 
			total += contas[i].saldo;
		System.out.println("Transacao = " + contadorTransacoes + " total = " + total);
	}

}
