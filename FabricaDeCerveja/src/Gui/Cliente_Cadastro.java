package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Beans.Cliente;
import Controle.CadastroCliente;
import Fachada.Fachada;
import Fachada.IFachada;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cliente_Cadastro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static final String String = null;
	private JPanel contentPane;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente_Cadastro frame = new Cliente_Cadastro();
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
	public Cliente_Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Cliente_Cadastro.class.getResource("/Img/LogoCadastro.png")));
		lblNewLabel.setBounds(10, 53, 186, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(152, 236, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblCnpj = new JLabel("CNPJ: ");
		lblCnpj.setBounds(152, 267, 46, 14);
		contentPane.add(lblCnpj);
		
		JLabel lblNewLabel_1 = new JLabel("Endere\u00E7o:");
		lblNewLabel_1.setBounds(152, 298, 66, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(226, 233, 210, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(226, 264, 210, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(226, 295, 210, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					Cliente cliente = new Cliente() ;
					cliente.setNome(textField.getText());
					cliente.setCpf(textField_1.getText());
					cliente.setEndereco(textField_2.getText());
					
					CadastroCliente cc = new CadastroCliente();
					
					Fachada fachada = new Fachada();
					
					fachada.cadastrarCliente(cliente);
					
						JOptionPane.showMessageDialog(rootPane, "Cliente cadastrado com sucesso!");

				}	catch (Exception ex){
					JOptionPane.showMessageDialog(rootPane, "Erro de cadastro!");
					
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
				}
			}
		});
		btnNewButton.setBounds(236, 326, 101, 23);
		contentPane.add(btnNewButton);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente_Principal obj=new Cliente_Principal ();
				obj.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(347, 326, 89, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Cliente_Cadastro.class.getResource("/Img/CadastroCliente.png")));
		lblNewLabel_2.setBounds(573, 199, 150, 150);
		contentPane.add(lblNewLabel_2);
		
	}

}
