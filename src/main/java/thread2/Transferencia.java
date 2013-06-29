package thread2;

public class Transferencia implements Runnable {
	
	private Banco banco;
	private int contaSaque;
	private int limiteTransferencia = 0;
	
	public Transferencia(Banco b, int contaSaque, int valor) {
		this.banco = b;
		this.contaSaque = contaSaque;
		this.limiteTransferencia = valor;
	}
	
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {
			int contaDeposito = (int) (banco.getNumeroContas() * Math.random());
			int valor = (int) (this.limiteTransferencia * Math.random());
			this.banco.transferir(this.contaSaque, contaDeposito, valor);
		}
	}

}
