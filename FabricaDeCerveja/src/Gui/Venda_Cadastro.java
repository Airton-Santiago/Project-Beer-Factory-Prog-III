package Gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import Beans.Cliente;
import Beans.Funcionario;
import Beans.Venda;
import Fachada.Fachada;
import Fachada.IFachada;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Venda_Cadastro extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Venda_Cadastro frame = new Venda_Cadastro();
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
	public Venda_Cadastro() {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, Color.GRAY, null, null, null));
		setClosable(true);
		setBounds(100, 100, 480, 360);
		getContentPane().setLayout(null);
		
		JLabel lblN = new JLabel("N\u00FAmero do pedido:");
		lblN.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblN.setBounds(94, 72, 142, 14);
		getContentPane().add(lblN);
		
		JLabel lblProduto = new JLabel("Produto: ");
		lblProduto.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblProduto.setBounds(94, 97, 83, 14);
		getContentPane().add(lblProduto);
		
		JLabel lblQuantidade = new JLabel("Quantidade: ");
		lblQuantidade.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblQuantidade.setBounds(94, 122, 83, 14);
		getContentPane().add(lblQuantidade);
		
		JLabel lblNomeDoCliente = new JLabel("Nome do cliente: ");
		lblNomeDoCliente.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNomeDoCliente.setBounds(94, 151, 114, 14);
		getContentPane().add(lblNomeDoCliente);
		
		JLabel lblValorDoPedido = new JLabel("Valor do pedido:");
		lblValorDoPedido.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblValorDoPedido.setBounds(94, 176, 114, 14);
		getContentPane().add(lblValorDoPedido);
		
		JLabel lblData = new JLabel("Data: ");
		lblData.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblData.setBounds(94, 201, 46, 14);
		getContentPane().add(lblData);
		
		textField = new JTextField();
		textField.setBounds(218, 69, 109, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(218, 94, 109, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(218, 120, 109, 20);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(218, 145, 109, 20);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(218, 170, 109, 20);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(218, 195, 109, 20);
		getContentPane().add(textField_5);
		
		JLabel lblAdicionarNovaVenda = new JLabel("Adicionar nova venda");
		lblAdicionarNovaVenda.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblAdicionarNovaVenda.setBounds(25, 26, 162, 20);
		getContentPane().add(lblAdicionarNovaVenda);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Nº PEDIDO, PRODUTO, QUANTIDADE, NOME CLIENTE, VALOR PEDIDO, DATA
try {
					
					Venda venda = new Venda(0, null, 0) ;
					venda.setCodigoDoPedido(textField.getText());
					venda.setValor_pedido(Integer.parseInt(textField_4.getText()));
					
					
					IFachada fachada = new Fachada();
					fachada.cadastrarProduto(venda);
					
					
					
				}	catch (Exception ex){
					JOptionPane.showMessageDialog(rootPane, "Venda cadastrado com sucesso!");
					
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
				}
				//
				
			}
		});
		btnAdicionar.setBounds(311, 245, 89, 23);
		getContentPane().add(btnAdicionar);

	}

}
