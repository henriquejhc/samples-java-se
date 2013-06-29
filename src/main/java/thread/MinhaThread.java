package thread;

public class MinhaThread extends Thread {

	private int count;
	private char caracter;
	
	public MinhaThread(int count, char caracter) {
		this.count = count;
		this.caracter = caracter;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < count; i++) {
			System.out.print(caracter);
		}
	}	

}