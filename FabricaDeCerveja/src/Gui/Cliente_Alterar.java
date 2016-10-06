package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Beans.Cliente;
import Controle.CadastroCliente;
import Fachada.Fachada;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;

public class Cliente_Alterar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private static JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente_Alterar frame = new Cliente_Alterar();
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
	public Cliente_Alterar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClientesCadastrados = new JLabel("Alterar clientes ");
		lblClientesCadastrados.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblClientesCadastrados.setBounds(34, 64, 215, 23);
		contentPane.add(lblClientesCadastrados);
		
		JLabel lblVoltar = new JLabel("Voltar");
		lblVoltar.setBounds(708, 501, 36, 14);
		contentPane.add(lblVoltar);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente_Principal obj=new Cliente_Principal ();
				obj.setVisible(true);
				dispose();
			}
		});
		button.setIcon(new ImageIcon(Cliente_Alterar.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		button.setBounds(754, 497, 49, 23);
		contentPane.add(button);
		
		JLabel lblCnpjDoCliente = new JLabel("CNPJ do cliente: ");
		lblCnpjDoCliente.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblCnpjDoCliente.setBounds(143, 238, 121, 20);
		contentPane.add(lblCnpjDoCliente);
		
		JLabel lblNovoEndereo = new JLabel("Novo endere\u00E7o: ");
		lblNovoEndereo.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblNovoEndereo.setBounds(143, 312, 121, 23);
		contentPane.add(lblNovoEndereo);
		
		textField = new JTextField();
		textField.setBounds(250, 239, 195, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(250, 278, 185, 23);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(250, 314, 195, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Cliente_Alterar.class.getResource("/Img/Crystal_128_reload.png")));
		label.setBounds(574, 205, 130, 130);
		contentPane.add(label);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                   try {
					
					Cliente cliente = new Cliente() ;
					cliente.setNome(textField.getText());
					cliente.setCpf(textField_1.getText());
					cliente.setEndereco(textField_2.getText());
					
					CadastroCliente cc = new CadastroCliente();
					
					Fachada fachada = new Fachada();
					
					fachada.atualizarCliente(cliente);
					
						JOptionPane.showMessageDialog(rootPane, "Cliente atualizado com sucesso!");
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");	

				}	catch (Exception ex){
					JOptionPane.showMessageDialog(rootPane, "Erro!");
					
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
				}
			}
		});
				
				// ----- Coloca o evento aqui pra fazer alteração do cliente Tayene -----
		btnAlterar.setBounds(335,357,89,23);contentPane.add(btnAlterar);
JLabel lblEndereoAntigo = new JLabel("Endere\u00E7o antigo:");
lblEndereoAntigo.setFont(new Font("Verdana", Font.PLAIN, 12));
lblEndereoAntigo.setBounds(143, 274, 130, 32);
contentPane.add(lblEndereoAntigo);
		
	}
}








