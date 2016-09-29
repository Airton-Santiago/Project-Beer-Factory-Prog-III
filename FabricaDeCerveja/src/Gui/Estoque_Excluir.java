package Gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import Beans.Estoque;
import Fachada.Fachada;
import Fachada.IFachada;

public class Estoque_Excluir extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private List<Estoque> listaEstoque;
	private Estoque_Excluir listaEstoque1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estoque_Excluir frame = new Estoque_Excluir();
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
	public Estoque_Excluir() {
		setBorder(new SoftBevelBorder(BevelBorder.RAISED, Color.GRAY, null, null, null));
		setClosable(true);
		setBounds(100, 100, 480, 360);
		getContentPane().setLayout(null);
		
		JLabel lblAdicionarNovoProduto = new JLabel("Remover produto");
		lblAdicionarNovoProduto.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblAdicionarNovoProduto.setBounds(10, 28, 163, 22);
		getContentPane().add(lblAdicionarNovoProduto);
		
		JLabel lblIdProduto = new JLabel("ID produto: ");
		lblIdProduto.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblIdProduto.setBounds(113, 118, 85, 14);
		getContentPane().add(lblIdProduto);
		
		JLabel lblQuantidade = new JLabel("Quantidade: ");
		lblQuantidade.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblQuantidade.setBounds(113, 156, 85, 14);
		getContentPane().add(lblQuantidade);
		
		textField = new JTextField();
		textField.setBounds(201, 115, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(201, 153, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//id e quantidade
				try{
					Estoque estoque = new Estoque(null, 0, null, 0);
					if(textField_1.getText().trim().equals("")==false){
					estoque.setCodigoDoPedido(textField_1.getText());
					
				}
					Estoque estoque1 = listaEstoque1();
					Fachada fachada = null;
					fachada.removerProduto(e);
					JOptionPane.showMessageDialog(rootPane, "Produto removido do estoque.");
				} catch(Exception ex) {
					JOptionPane.showInputDialog(rootPane,ex.getMessage());
				}
				//
			}

			private Estoque listaEstoque1() {
				// TODO Auto-generated method stub
				return null;
			}
		});
		btnRemover.setBounds(284, 216, 89, 23);
		getContentPane().add(btnRemover);

	}

}
