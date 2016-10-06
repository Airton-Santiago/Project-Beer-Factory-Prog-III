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
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;

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
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(255, 255, 255));
		contentPane.add(desktopPane, BorderLayout.CENTER);
		
		JMenuItem mntmNovaVenda = new JMenuItem("Nova Venda");
		mntmNovaVenda.setBounds(217, 216, 127, 22);
		desktopPane.add(mntmNovaVenda);
		
		JMenuItem mntmRemoverVenda = new JMenuItem("Remover Venda");
		mntmRemoverVenda.setBounds(446, 216, 127, 22);
		desktopPane.add(mntmRemoverVenda);
		
		JMenuItem mntmVoltar = new JMenuItem("Voltar");
		mntmVoltar.setBounds(657, 476, 75, 22);
		desktopPane.add(mntmVoltar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Venda_Principal.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		label.setBounds(742, 467, 50, 42);
		desktopPane.add(label);
		mntmVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Financeiro_Principal obj=new Financeiro_Principal() ;
				obj.setVisible(true);
				dispose();
			}
		});
		mntmRemoverVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Venda_Excluir est = new Venda_Excluir();
				desktopPane.add(est);
				est.setVisible(true);
			}
		});
		mntmNovaVenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						Venda_Cadastro est = new Venda_Cadastro();
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
