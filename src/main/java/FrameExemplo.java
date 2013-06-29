import java.awt.Frame;
import java.awt.Panel;
import java.awt.GridBagLayout;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridBagConstraints;
import java.awt.Choice;

public class FrameExemplo extends Frame {

	private static final long serialVersionUID = 1L;
	private Panel panel = null;
	private Button button = null;
	private Panel panel1 = null;
	private Choice choice = null;

	/**
	 * This is the default constructor
	 */
	public FrameExemplo() {
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
		this.setTitle("Frame");

		this.add(getPanel(), BorderLayout.CENTER);
	}

	/**
	 * This method initializes panel	
	 * 	
	 * @return java.awt.Panel	
	 */
	private Panel getPanel() {
		if (panel == null) {
			GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
			gridBagConstraints2.gridx = 2;
			gridBagConstraints2.gridy = 0;
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 1;
			gridBagConstraints1.gridy = 0;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			panel = new Panel();
			panel.setLayout(new GridBagLayout());
			panel.add(getButton(), gridBagConstraints);
			panel.add(getPanel1(), gridBagConstraints1);
			panel.add(getChoice(), gridBagConstraints2);
		}
		return panel;
	}

	/**
	 * This method initializes button	
	 * 	
	 * @return java.awt.Button	
	 */
	private Button getButton() {
		if (button == null) {
			button = new Button();
			button.setLabel("OK");
		}
		return button;
	}

	/**
	 * This method initializes panel1	
	 * 	
	 * @return java.awt.Panel	
	 */
	private Panel getPanel1() {
		if (panel1 == null) {
			panel1 = new Panel();
			panel1.setLayout(new GridBagLayout());
		}
		return panel1;
	}

	/**
	 * This method initializes choice	
	 * 	
	 * @return java.awt.Choice	
	 */
	private Choice getChoice() {
		if (choice == null) {
			choice = new Choice();
		}
		return choice;
	}

}
