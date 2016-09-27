package Gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import Beans.Estoque;
import Beans.Funcionario;
import Fachada.Fachada;
import Fachada.IFachada;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JLabel lblNomeDoProduto = new JLabel("Nome do Produto: ");
		lblNomeDoProduto.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblNomeDoProduto.setBounds(80, 133, 109, 14);
		getContentPane().add(lblNomeDoProduto);
		
		JLabel lblQuantidade = new JLabel("Quantidade: ");
		lblQuantidade.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblQuantidade.setBounds(80, 163, 89, 14);
		getContentPane().add(lblQuantidade);
		
		textField = new JTextField();
		textField.setBounds(199, 131, 123, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(199, 161, 123, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				dispose();
			}
		});
		btnAdicionar.setBounds(299, 215, 89, 23);
		getContentPane().add(btnAdicionar);
		
		JLabel lblAdicionarNovoProduto = new JLabel("Adicionar novo produto");
		lblAdicionarNovoProduto.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblAdicionarNovoProduto.setBounds(10, 24, 184, 29);
		getContentPane().add(lblAdicionarNovoProduto);

	}
}
