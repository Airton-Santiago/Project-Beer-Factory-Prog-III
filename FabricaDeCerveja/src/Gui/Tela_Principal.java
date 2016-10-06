package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class Tela_Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela_Principal frame = new Tela_Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tela_Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escolha uma fun\u00E7\u00E3o para continuar");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblNewLabel.setBounds(20, 146, 364, 57);
		contentPane.add(lblNewLabel);
		
		JButton btnFuncionario = new JButton("Funcionario");
		btnFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario_Principal obj=new Funcionario_Principal();
				obj.setVisible(true);
			  	dispose();

			}
		});
		btnFuncionario.setBounds(60, 224, 100, 23);
		contentPane.add(btnFuncionario);
		
		JButton btnNewButton = new JButton("Cliente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				    Cliente_Principal obj=new Cliente_Principal();
					obj.setVisible(true);
			}
		});
		btnNewButton.setBounds(250, 224, 100, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Financeiro");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Financeiro_Principal obj=new Financeiro_Principal();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(434, 224, 100, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Fornecedor");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fornecedor_Principal obj=new Fornecedor_Principal();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(648, 224, 100, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Voltar");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(711, 497, 54, 23);
		contentPane.add(lblNewLabel_1);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Gerente_Login obj=new Gerente_Login();
				obj.setVisible(true);
			  	dispose();
			}
		});
		button.setIcon(new ImageIcon(Tela_Principal.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		button.setBounds(761, 497, 54, 23);
		contentPane.add(button);
		
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Tela_Principal.class.getResource("/Img/CadastroFuncionario.png")));
		label.setBounds(30, 278, 150, 150);
		contentPane.add(label);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Tela_Principal.class.getResource("/Img/bem-vindo.png")));
		lblNewLabel_2.setBounds(20, 11, 527, 119);
		contentPane.add(lblNewLabel_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Tela_Principal.class.getResource("/Img/Cliente.png")));
		label_1.setBounds(219, 278, 150, 150);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Tela_Principal.class.getResource("/Img/Financeiro.png")));
		label_2.setBounds(404, 278, 150, 150);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Tela_Principal.class.getResource("/Img/Cadastrofornecedores.png")));
		label_3.setBounds(618, 278, 150, 150);
		contentPane.add(label_3);
		
	}
}
