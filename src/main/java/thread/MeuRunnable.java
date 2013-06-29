package thread;

public class MeuRunnable implements Runnable {

	private int count;
	private char caracter;
	
	public MeuRunnable(int count, char caracter) {
		this.count = count;
		this.caracter = caracter;
	}
	
	public void run() {
		for (int i = 0; i < count; i++) {
			System.out.print(caracter);
		}
	}		
}
