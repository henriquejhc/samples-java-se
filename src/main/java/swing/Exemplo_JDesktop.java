package swing;

import java.awt.BorderLayout;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Exemplo_JDesktop extends JFrame {
	
	public Exemplo_JDesktop() {
		
		setSize(400, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JMenuBar barra = new JMenuBar();
		JMenu arquivo = new JMenu("Arquivo");
		arquivo.add(new JMenuItem("Novo"));
		arquivo.add(new JMenuItem("Salvar"));
		arquivo.add(new JMenuItem("Imprimir"));
		barra.add(arquivo);
		setJMenuBar(barra);
		
		
		
		JDesktopPane desktop = new JDesktopPane();
		this.add(desktop, BorderLayout.CENTER);
		
		JInternalFrame internal = new JInternalFrame();
		internal.setSize(100, 200);
		internal.setVisible(true);
		internal.setResizable(true);
		internal.setClosable(true);
		internal.setMaximizable(true);
		internal.setJMenuBar(barra);
		desktop.add(internal);
		
	}
	
	public static void main(String[] args) {
		new Exemplo_JDesktop();
	}

}
