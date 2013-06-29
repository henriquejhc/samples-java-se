import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Test_Swing_JButton extends JFrame {

	public Test_Swing_JButton() {
		super("Teste JButton");
		
		JButton botaoOk = new JButton("OK");
		botaoOk.setMnemonic(KeyEvent.VK_O);
		botaoOk.setEnabled(true);

		this.add(botaoOk);
		
		setSize(200, 50);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String ... args) {
		new Test_Swing_JButton();
	}
	
}
