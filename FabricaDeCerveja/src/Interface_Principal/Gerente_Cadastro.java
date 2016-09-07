package Interface_Principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Interface_Funcionario.Funcionario_Cadastro;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gerente_Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gerente_Cadastro frame = new Gerente_Cadastro();
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
	public Gerente_Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Gerente_Cadastro.class.getResource("/Img/Cadastro.png")));
		lblNewLabel.setBounds(-29, 0, 490, 125);
		contentPane.add(lblNewLabel);
		
		JLabel lblPrimeiroAcessoComo = new JLabel("Primeiro acesso como GERENTE.");
		lblPrimeiroAcessoComo.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblPrimeiroAcessoComo.setBounds(43, 136, 275, 14);
		contentPane.add(lblPrimeiroAcessoComo);
		
		JLabel lblE = new JLabel("Por favor efetue o seu cadastro.");
		lblE.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblE.setBounds(43, 161, 264, 14);
		contentPane.add(lblE);
		
		JLabel lblNewLabel_1 = new JLabel("Nome: ");
		lblNewLabel_1.setBounds(159, 268, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblLogin = new JLabel("Login: ");
		lblLogin.setBounds(159, 293, 46, 14);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha: ");
		lblSenha.setBounds(159, 318, 46, 14);
		contentPane.add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(207, 265, 120, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(207, 290, 120, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(207, 316, 120, 20);
		contentPane.add(passwordField);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Principal obj=new Tela_Principal();
				obj.setVisible(true);
			  	dispose();
			}
		});
		btnCadastrar.setBounds(217, 347, 110, 23);
		contentPane.add(btnCadastrar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Gerente_Cadastro.class.getResource("/Img/gerente.png")));
		label.setBounds(481, 244, 150, 135);
		contentPane.add(label);
	}
}
