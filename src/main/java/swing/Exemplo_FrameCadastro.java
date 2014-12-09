package swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class Exemplo_FrameCadastro extends JFrame {

	public Exemplo_FrameCadastro() {
		setSize(400, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		
		//Exemplo_JComboBox comboEstados = new Exemplo_JComboBox();
		String[] estados = {"SC", "SP", "RJ", "RS"};
		JList lista = new JList(estados);
		lista.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		this.add(lista, BorderLayout.NORTH);
		
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("root");
		JTree tree = new JTree(root);
		DefaultMutableTreeNode nivel1 = new DefaultMutableTreeNode("Nivel 1");
		root.add(nivel1);
		DefaultMutableTreeNode nivel1_1 = new DefaultMutableTreeNode("Nivel 1.1");
		nivel1.add(nivel1_1);
		this.add(tree, BorderLayout.CENTER);
		
		JButton button = new JButton("Salvar");
		this.add(button, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		new Exemplo_FrameCadastro();
	}
	
}
