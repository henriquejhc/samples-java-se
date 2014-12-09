package swing;

import java.awt.Color;

import javax.swing.JFrame;

public class ExemploFrameSwing extends JFrame {

	public ExemploFrameSwing() {
		setTitle("Exemplo Frame Swing");
		setBackground(Color.WHITE);
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		ExemploFrameSwing frame = new ExemploFrameSwing();
	}
	
}
