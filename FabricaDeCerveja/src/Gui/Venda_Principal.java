package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Venda_Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Venda_Principal frame = new Venda_Principal();
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
	public Venda_Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnOpes = new JMenu("Op\u00E7\u00F5es");
		menuBar.add(mnOpes);
		
		JMenuItem mntmNovaVenda = new JMenuItem("Nova Venda");
		
		mnOpes.add(mntmNovaVenda);
		
		JMenuItem mntmRemoverVenda = new JMenuItem("Remover Venda");
		
		mnOpes.add(mntmRemoverVenda);
		
		JMenuItem mntmVoltar = new JMenuItem("Voltar");
		mntmVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Financeiro_Principal obj=new Financeiro_Principal() ;
				obj.setVisible(true);
				dispose();
			}
		});
		mnOpes.add(mntmVoltar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(UIManager.getColor("Button.disabledShadow"));
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JLabel lblVendasCadastradas = new JLabel("Vendas Cadastradas");
		lblVendasCadastradas.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblVendasCadastradas.setBounds(36, 56, 154, 26);
		desktopPane.add(lblVendasCadastradas);
		
		JLabel lblLucro = new JLabel("Lucro:");
		lblLucro.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblLucro.setBounds(20, 462, 46, 14);
		desktopPane.add(lblLucro);
		mntmRemoverVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Venda_Excluir est = new Venda_Excluir();
				desktopPane.add(est);
				est.setVisible(true);
			}
		});
		mntmNovaVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						Venda_Excluir est = new Venda_Excluir();
						desktopPane.add(est);
						est.setVisible(true);
					
				
			}
		});
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
