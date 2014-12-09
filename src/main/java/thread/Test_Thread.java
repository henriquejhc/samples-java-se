package thread;

class Calculo {
	
	static Integer token = 1;
	
	synchronized void executa(char caracter) {
		// synchronized (this) {
		for (int x = 0; x < 10000; x++) {
			System.out.print(caracter);
			if (x % 1000 == 0) {
				System.out.print('\n');
			}
		}
		// }
						
	}
}


class MinhaThread1 implements Runnable {
	
	Calculo calculo;
	
	public MinhaThread1(Calculo calculo) {
		this.calculo = calculo;
	}
	
	public void run() {
		// Igual a ideia do main(..)
		// Inicio
		// Meio
		// Fim
		
		calculo.executa('x');

	}
}

class MinhaThread2 extends Thread {
	
	Calculo calculo;
	
	public MinhaThread2(Calculo calculo) {
		this.calculo = calculo;
	}
	
	
	@Override
	public void run() {
		// Inicio
		// Meio
		// Fim
		
		calculo.executa('y');
	}
}

public class Test_Thread {

	public static void main(String[] args) throws Exception {
		
		// THIS
		Calculo calculo = new Calculo();
		
		// T1 = estado NEW
		MinhaThread1 runnable = new MinhaThread1(calculo);
		Thread t1 = new Thread(runnable);
		// T2 = estado NEW
		MinhaThread2 t2 = new MinhaThread2(calculo);
		
		
		// T1 = estado RUNNABLE (running - ready)
		t1.start();
		// T2 = estado RUNNABLE (running - ready)
		t2.start();
				
		calculo.executa('m');
	}

}
