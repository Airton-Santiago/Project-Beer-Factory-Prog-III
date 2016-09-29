package Gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import Beans.Venda;
import Fachada.Fachada;
import Fachada.IFachada;

public class Venda_Excluir extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
    private List listaVenda;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Venda_Excluir frame = new Venda_Excluir();
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
	public Venda_Excluir() {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, Color.GRAY, null, null, null));
		setClosable(true);
		setBounds(100, 100, 480, 360);
		getContentPane().setLayout(null);
		
		JLabel lblRemoverVenda = new JLabel("Remover venda");
		lblRemoverVenda.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblRemoverVenda.setBounds(10, 26, 126, 28);
		getContentPane().add(lblRemoverVenda);
		
		JLabel lblNmeroDoPedido = new JLabel("N\u00FAmero do pedido: ");
		lblNmeroDoPedido.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNmeroDoPedido.setBounds(90, 106, 117, 14);
		getContentPane().add(lblNmeroDoPedido);
		
		JLabel lblProduto = new JLabel("Produto: ");
		lblProduto.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblProduto.setBounds(90, 140, 69, 14);
		getContentPane().add(lblProduto);
		
		JLabel lblNomeDoCliente = new JLabel("Nome do cliente:");
		lblNomeDoCliente.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNomeDoCliente.setBounds(90, 175, 117, 14);
		getContentPane().add(lblNomeDoCliente);
		
		textField = new JTextField();
		textField.setBounds(205, 103, 126, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(205, 137, 126, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(205, 172, 126, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//Nº Pedido, Produto, Nome do Cliente
				try{
					Venda venda = new Venda(getAlignmentX(), title, title, title, null, getAlignmentX());
					if(textField.getText().trim().equals("")==false){
					venda.setCodigoDoPedido(textField.getText());
					
				}
					Venda venda2 = listaVenda();
					IFachada fachada = new Fachada();
					fachada.removerProduto(venda2);
					JOptionPane.showMessageDialog(rootPane, "Venda removida do sistema.");
				} catch(Exception ex) {
					
				}
				//
			}

			private Venda listaVenda() {
				// TODO Auto-generated method stub
				return null;
			}
		});
		btnRemover.setBounds(317, 226, 89, 23);
		getContentPane().add(btnRemover);

	}

}
