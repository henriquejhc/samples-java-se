package swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Exemplo_FlowLayout extends JFrame {

	public Exemplo_FlowLayout() {
		
		setSize(300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setResizable(false);

		JPanel formulario = new JPanel();
		GridLayout gridLayout = new GridLayout(3, 2);
		
		formulario.setLayout(gridLayout);
		formulario.add(new JLabel("Nome:"));
		formulario.add(new JTextField("Digite seu nome aqui..."));
		formulario.add(new JLabel("Endere�o:"));
		formulario.add(new JTextField("Digite seu endere�o aqui..."));
		formulario.add(new JLabel("Idade:"));
		formulario.add(new JTextField("Digite sua idade aqui..."));
		formulario.add(new JLabel("Novo:"));
		formulario.add(new JTextField("Digite seu novo aqui..."));
		formulario.add(new JLabel("Novo:"));
		this.add(formulario, BorderLayout.CENTER);
		
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);		
		JPanel botoes = new JPanel();
		botoes.setLayout(layout);
		botoes.add(new JButton("Salvar"));
		botoes.add(new JButton("Cancelar"));
		this.add(botoes, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		new Exemplo_FlowLayout();
	}
	
}
