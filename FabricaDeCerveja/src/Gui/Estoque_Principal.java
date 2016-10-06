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
import java.awt.Color;
import javax.swing.ImageIcon;

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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.WHITE);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JMenuItem mntmAdicionarProduto = new JMenuItem("Vizualizar Produtos");
		mntmAdicionarProduto.setBounds(229, 194, 143, 22);
		desktopPane.add(mntmAdicionarProduto);
		
		JMenuItem mntmRemoverProduto = new JMenuItem("Remover Produto");
		mntmRemoverProduto.setBounds(449, 194, 137, 22);
		desktopPane.add(mntmRemoverProduto);
		
		JMenuItem mntmVoltar = new JMenuItem("Voltar");
		mntmVoltar.setBounds(649, 449, 75, 22);
		desktopPane.add(mntmVoltar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Estoque_Principal.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		label.setBounds(734, 449, 46, 22);
		desktopPane.add(label);
		
		JLabel lblEstoquePrincipal = new JLabel("Estoque principal");
		lblEstoquePrincipal.setFont(new Font("Verdana", Font.PLAIN, 17));
		lblEstoquePrincipal.setBounds(27, 39, 229, 36);
		desktopPane.add(lblEstoquePrincipal);
		mntmVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Financeiro_Principal obj=new Financeiro_Principal ();
				obj.setVisible(true);
				dispose();
				}
		});
		mntmRemoverProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Estoque_Excluir est = new Estoque_Excluir();
				desktopPane.add(est);
				est.setVisible(true);
			}
		});
		
		mntmAdicionarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Estoque_Cadastro est = new Estoque_Cadastro();
				desktopPane.add(est);
				est.setVisible(true);
				
				
			}
			});
	}
}
