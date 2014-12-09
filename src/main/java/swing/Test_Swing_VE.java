package swing;

import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;

public class Test_Swing_VE extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jpCenter = null;  //  @jve:decl-index=0:visual-constraint="152,137"
	private JLabel labelNome = null;
	private JTextField txNome = null;
	private JLabel labelSobrenome = null;
	private JTextField txSobreNome = null;
	private JTable tableTeste = null;

	/**
	 * This method initializes jpCenter	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJpCenter() {
		if (jpCenter == null) {
			labelSobrenome = new JLabel();
			labelSobrenome.setText("Sobrenome:");
			labelNome = new JLabel();
			labelNome.setText("Nome:");
			GridLayout gridLayout = new GridLayout();
			gridLayout.setRows(8);
			gridLayout.setColumns(1);
			jpCenter = new JPanel();
			jpCenter.setLayout(gridLayout);
			jpCenter.add(labelNome, null);
			jpCenter.add(getTxNome(), null);
			jpCenter.add(labelSobrenome, null);
			jpCenter.add(getTxSobreNome(), null);
			jpCenter.add(getTableTeste(), null);
			
		}
		return jpCenter;
	}

	/**
	 * This method initializes txNome	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxNome() {
		if (txNome == null) {
			txNome = new JTextField();
		}
		return txNome;
	}

	/**
	 * This method initializes txSobreNome	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getTxSobreNome() {
		if (txSobreNome == null) {
			txSobreNome = new JTextField();
		}
		return txSobreNome;
	}

	/**
	 * This method initializes tableTeste	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getTableTeste() {
		if (tableTeste == null) {
			tableTeste = new JTable();
		}
		return tableTeste;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Test_Swing_VE thisClass = new Test_Swing_VE();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This is the default constructor
	 */
	public Test_Swing_VE() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
		this.setContentPane(getJContentPane());
		this.setTitle("Aplica��o VE");
		this.setVisible(true);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
		}
		return jContentPane;
	}

}
