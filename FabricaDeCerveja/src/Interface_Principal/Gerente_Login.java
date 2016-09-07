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

public class Gerente_Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gerente_Login frame = new Gerente_Login();
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
	public Gerente_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Gerente_Login.class.getResource("/Img/Login.png")));
		lblNewLabel.setBounds(272, 34, 264, 142);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Efetue o seu login.");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_1.setBounds(186, 261, 160, 19);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(186, 295, 46, 14);
		contentPane.add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(186, 320, 46, 14);
		contentPane.add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(243, 292, 120, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(243, 317, 120, 20);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Principal obj=new Tela_Principal();
				obj.setVisible(true);
			  	dispose();
			}
		});
		btnLogin.setBounds(196, 348, 79, 23);
		contentPane.add(btnLogin);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSair.setBounds(285, 348, 79, 23);
		contentPane.add(btnSair);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Gerente_Login.class.getResource("/Img/PARE.png")));
		label.setBounds(475, 221, 167, 150);
		contentPane.add(label);
	}

}
