import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Exemplo_JButton extends JFrame {
	
	public Exemplo_JButton() {
		setSize(100, 100);
		setVisible(true);
		
		JButton button = new JButton("Ok");
		button.setMnemonic(KeyEvent.VK_O);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Botao clicado !!!");
			}
		});
		
		
		this.add(button);
		
	}
	
	public static void main(String[] args) {
		new Exemplo_JButton();
	}

}
