package thread;

public class Main {

	public static void main(String[] args) throws Exception {
		
		MinhaThread t1 = new MinhaThread(100000, '-');
		MinhaThread t2 = new MinhaThread(100000, '.');
		
		MeuRunnable r1 = new MeuRunnable(100000, '>');
		MeuRunnable r2 = new MeuRunnable(100000, '0');

                t1.setPriority(1);
                t2.setPriority(10);
                
		t1.start();
		t2.start();
		
		new Thread(r1).start();
		new Thread(r2).start();
		
		
	}
	
}
