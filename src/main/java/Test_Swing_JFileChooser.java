import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;


public class Test_Swing_JFileChooser extends JFrame {

	public Test_Swing_JFileChooser() {
		super("Teste JFileChooser");
		
		JButton botaoAbrir = new JButton("Abrir");
		botaoAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirFileChooser();
			}
		});
		this.add(botaoAbrir);
		
		setSize(275, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void abrirFileChooser() {
		JFileChooser fileChooser = new JFileChooser();
		int opcao = fileChooser.showOpenDialog(this);
		if (opcao == JFileChooser.APPROVE_OPTION) {
			System.out.println(fileChooser.getSelectedFile().getName());
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Test_Swing_JFileChooser();
	}

}
