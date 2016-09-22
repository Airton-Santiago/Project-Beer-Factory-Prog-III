package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class Estoque_Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Estoque_Principal frame = new Estoque_Principal();
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
	public Estoque_Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAdicionarremover = new JMenu("Op\u00E7\u00F5es");
		menuBar.add(mnAdicionarremover);
		
		JMenuItem mntmAdicionarProduto = new JMenuItem("Adicionar Produto");
		
		mnAdicionarremover.add(mntmAdicionarProduto);
		
		JMenuItem mntmRemoverProduto = new JMenuItem("Remover Produto");
		mnAdicionarremover.add(mntmRemoverProduto);
		
		JMenuItem mntmVoltar = new JMenuItem("Voltar");
		mntmVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Financeiro_Principal obj=new Financeiro_Principal ();
				obj.setVisible(true);
				dispose();
				}
		});
		mnAdicionarremover.add(mntmVoltar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JLabel lblProdutosCadastrados = new JLabel("Produtos Cadastrados");
		lblProdutosCadastrados.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblProdutosCadastrados.setBounds(28, 54, 142, 25);
		desktopPane.add(lblProdutosCadastrados);
		
		mntmAdicionarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Estoque_Cadastro est = new Estoque_Cadastro();
				desktopPane.add(est);
				est.setVisible(true);
				
				
			}
			});
		mntmRemoverProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Estoque_Excluir est = new Estoque_Excluir();
				desktopPane.add(est);
				est.setVisible(true);
			}
		});
	}
}
