package Interface_Funcionario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import Interface_Principal.Tela_Principal;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Funcionario_Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionario_Cadastro frame = new Funcionario_Cadastro();
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
	public Funcionario_Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Funcionario_Cadastro.class.getResource("/Img/LogoCadastro.png")));
		lblNewLabel.setBounds(0, 54, 168, 55);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome do funcionario: ");
		lblNewLabel_1.setBounds(160, 229, 128, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(309, 226, 150, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(160, 260, 46, 14);
		contentPane.add(lblCpf);
		
		textField_1 = new JTextField();
		textField_1.setBounds(309, 257, 150, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o: ");
		lblEndereo.setBounds(160, 294, 83, 14);
		contentPane.add(lblEndereo);
		
		textField_2 = new JTextField();
		textField_2.setBounds(309, 288, 150, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Funcionario_Principal obj=new Funcionario_Principal();
				obj.setVisible(true);
			  	dispose();

			}
		});
		btnCadastrar.setBounds(259, 337, 95, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario_Principal obj=new Funcionario_Principal();
				obj.setVisible(true);
			  	dispose();
			}
		});
		btnVoltar.setBounds(364, 337, 95, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Funcionario_Cadastro.class.getResource("/Img/add_user.png")));
		lblNewLabel_2.setBounds(512, 215, 128, 158);
		contentPane.add(lblNewLabel_2);
	}
}
