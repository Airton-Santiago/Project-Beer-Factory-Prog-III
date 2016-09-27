package Gui;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Estoque_Excluir extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;

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
			}
		});
		btnRemover.setBounds(284, 216, 89, 23);
		getContentPane().add(btnRemover);

	}

}
