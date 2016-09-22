package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Financeiro_Vendas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Financeiro_Vendas frame = new Financeiro_Vendas();
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
	public Financeiro_Vendas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Adicionar/Remover");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmAdicionarProduto = new JMenuItem("Adicionar Produto");
		mntmAdicionarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Estoque_Cadastro est = new Estoque_Cadastro();
				
			}
		});
		mnNewMenu.add(mntmAdicionarProduto);
		
		JMenuItem mntmRemoverProduto = new JMenuItem("Remover Produto");
		mnNewMenu.add(mntmRemoverProduto);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVoltar = new JLabel("Voltar");
		lblVoltar.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblVoltar.setBounds(709, 465, 46, 14);
		contentPane.add(lblVoltar);
		
		JLabel lblListagemDeProdutos = new JLabel("Listagem de Produtos Cadastrados");
		lblListagemDeProdutos.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblListagemDeProdutos.setBounds(10, 52, 252, 25);
		contentPane.add(lblListagemDeProdutos);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tela_Principal obj=new Tela_Principal ();
				obj.setVisible(true);
				dispose();	
			}
		});
		button.setIcon(new ImageIcon(Financeiro_Vendas.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		button.setBounds(751, 462, 43, 23);
		contentPane.add(button);
	}
}
