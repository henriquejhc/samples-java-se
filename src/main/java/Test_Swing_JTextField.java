import javax.swing.JFrame;
import javax.swing.JTextArea;


public class Test_Swing_JTextField extends JFrame {

	public Test_Swing_JTextField() {
		super("Teste JTextField");
		
//		JTextField textField = new JTextField();
//		this.add(textField);
//		String valorInputado = textField.getText();
//		textField.setSize(200, 100);
		
		JTextArea textArea = new JTextArea(2, 40);
		this.add(textArea);
		
		
		
		setSize(200, 50);
		setVisible(true);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Test_Swing_JTextField();
	}

}
