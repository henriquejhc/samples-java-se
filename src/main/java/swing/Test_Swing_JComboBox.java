package swing;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import com.sun.corba.se.pept.transport.Selector;


public class Test_Swing_JComboBox extends JFrame {

	public Test_Swing_JComboBox() {
		super("Teste JComboBox");
		
		JComboBox seletorBancos = new JComboBox();
		seletorBancos.addItem(new Cliente("Rodrigo"));
//		seletorBancos.addItem("Ita�");
//		seletorBancos.addItem("Bradesco");
//		seletorBancos.addItem("Globalcode Bank");
		this.add(seletorBancos);
		//seletorBancos.gets
		
		setSize(275, 50);
		setVisible(true);
	}
	
	public class Cliente {
		
		private String nome;
		
		public Cliente(String nome) {
			this.nome = nome;
		}
//		
//		@Override
//		public String toString() {
//			return nome;
//		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Test_Swing_JComboBox();
	}

}
