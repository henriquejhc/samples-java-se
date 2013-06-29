import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Test_Swing_JMenu extends JFrame {

	public Test_Swing_JMenu() {
		super("Teste JMenu");
		
		JMenuBar barraMenu = new JMenuBar();
		
		JMenu menuConta = new JMenu("Conta");
		JMenuItem item1menuConta = new JMenuItem("Abrir Conta");
		JMenuItem item2menuConta = new JMenuItem("Editar Conta");
		JMenuItem item3menuConta = new JMenuItem("Listar Contas");
		menuConta.add(item1menuConta);
		menuConta.add(item2menuConta);
		menuConta.add(item3menuConta);
		barraMenu.add(menuConta);
		
		JMenu menuAgencia = new JMenu("Agencia");
		JMenuItem item1menuAgencia = new JMenuItem("Abrir Agencia");
		JMenuItem item2menuAgencia = new JMenuItem("Editar Agencia");
		JMenuItem item3menuAgencia = new JMenuItem("Listar Agencias");
		menuAgencia.add(item1menuAgencia);
		menuAgencia.add(item2menuAgencia);
		menuAgencia.add(item3menuAgencia);
		barraMenu.add(menuAgencia);
		
		
		this.setJMenuBar(barraMenu);
		
		setSize(275, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Test_Swing_JMenu();
	}

}
