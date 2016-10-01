package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Beans.Cliente;
import Controle.CadastroCliente;
import Fachada.Fachada;
import Fachada.IFachada;

import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Cliente_Exclusao extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private List<Cliente> listaClientes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente_Exclusao frame = new Cliente_Exclusao();
					frame.setVisible(true);
				} catch (NullPointerException e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cliente_Exclusao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblExcluirClienteDo = new JLabel("Excluir cliente do banco de dados");
		lblExcluirClienteDo.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblExcluirClienteDo.setBounds(24, 78, 281, 52);
		contentPane.add(lblExcluirClienteDo);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(198, 222, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblNewLabel = new JLabel("CPF:");
		lblNewLabel.setBounds(198, 247, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(239, 219, 185, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(239, 244, 185, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnExcluir.setBounds(262, 275, 76, 23);
		contentPane.add(btnExcluir);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Cliente_Principal obj=new Cliente_Principal ();
				obj.setVisible(true);
				dispose();
				//
				try{
					Cliente cliente = new Cliente();
					if(textField_1.getText().trim().equals("")==false){
					cliente.setCnpj(textField_1.getText());
					cliente.setNome(textField.getText());
					cliente.setCpf(textField_1.getText());
					
					CadastroCliente cc = new CadastroCliente();
					Fachada fachada = new Fachada();
					fachada.cadastrarCliente(cliente);
					Fachada.removerCliente(cliente);
					JOptionPane.showMessageDialog(rootPane, "Cliente removido com sucesso.");
				}
					
				} catch(NullPointerException e1) {
					JOptionPane.showInputDialog(rootPane, "Erro, cliente não foi removido!");
				}
				
				//
			}
		});
		btnVoltar.setBounds(348, 275, 76, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Cliente_Exclusao.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-error@2x.png")));
		lblNewLabel_1.setBounds(534, 202, 96, 96);
		contentPane.add(lblNewLabel_1);
	}
}
