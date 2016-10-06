package Gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import Beans.Cliente;
import Beans.Estoque;
import Beans.Funcionario;
import Controle.CadastroCliente;
import Fachada.Fachada;
import Fachada.IFachada;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class Estoque_Cadastro extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estoque_Cadastro frame = new Estoque_Cadastro();
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
	public Estoque_Cadastro() {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, Color.GRAY, null, null, null));
		setClosable(true);
		setBounds(100, 100, 480, 360);
		getContentPane().setLayout(null);

		JLabel lblNomeDoProduto = new JLabel("Codigo do produto:");
		lblNomeDoProduto.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNomeDoProduto.setBounds(64, 107, 123, 35);
		getContentPane().add(lblNomeDoProduto);

		textField = new JTextField();
		textField.setBounds(199, 115, 123, 20);
		getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnVizualizar = new JButton("Vizualizar");
		btnVizualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					Cliente cliente = new Cliente();
					cliente.setNome(textField.getText());
					cliente.setQuantidadeEmEstoque(textField_1.getText());
					

					CadastroCliente cc = new CadastroCliente();

					Fachada fachada = new Fachada();

					fachada.cadastrarCliente(cliente);

					JOptionPane.showMessageDialog(null, " Nome:" + cliente.getNome() + " Quantidade: " + cliente.getQuantidadeEmEstoque());
					textField.setText("");
					textField_1.setText("");
					

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Erro!");
					dispose();
				}
			}
		});
		btnVizualizar.setBounds(360, 277, 89, 23);
		getContentPane().add(btnVizualizar);

		JLabel lblVizualizarProdutoCadastrado = new JLabel(" Produto Cadastrado");
		lblVizualizarProdutoCadastrado.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		lblVizualizarProdutoCadastrado.setBounds(15, 30, 324, 35);
		getContentPane().add(lblVizualizarProdutoCadastrado);
		
		textField_1 = new JTextField();
		textField_1.setBounds(199, 173, 123, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setBounds(64, 146, 162, 74);
		getContentPane().add(lblQuantidade);

	}
}
