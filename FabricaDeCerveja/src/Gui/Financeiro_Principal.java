package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Financeiro_Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Financeiro_Principal frame = new Financeiro_Principal();
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
	public Financeiro_Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVoltar = new JLabel("Voltar");
		lblVoltar.setBounds(696, 487, 46, 14);
		contentPane.add(lblVoltar);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Principal obj=new Tela_Principal ();
				obj.setVisible(true);
				dispose();
			}
		});
		button.setIcon(new ImageIcon(Financeiro_Principal.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		button.setBounds(738, 483, 56, 23);
		contentPane.add(button);
		
		JLabel lblEscolhaUmaNova = new JLabel("Escolha uma nova op\u00E7\u00E3o para financeiro.");
		lblEscolhaUmaNova.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblEscolhaUmaNova.setBounds(10, 37, 311, 23);
		contentPane.add(lblEscolhaUmaNova);
		
		JButton btnVendas = new JButton("Vendas");
		btnVendas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Venda_Principal obj=new Venda_Principal() ;
				obj.setVisible(true);
				dispose();
			}
		});
		btnVendas.setBounds(546, 191, 95, 23);
		contentPane.add(btnVendas);
		
		JButton btnEstoque = new JButton("Estoque");
		btnEstoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Estoque_Principal obj=new Estoque_Principal();
				obj.setVisible(true);
				dispose();
			}
		});
		btnEstoque.setBounds(179, 191, 95, 23);
		contentPane.add(btnEstoque);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Financeiro_Principal.class.getResource("/Img/Estoque.png")));
		label.setBounds(148, 261, 150, 150);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Financeiro_Principal.class.getResource("/Img/Vendas.png")));
		label_1.setBounds(520, 261, 150, 150);
		contentPane.add(label_1);
	}
}
