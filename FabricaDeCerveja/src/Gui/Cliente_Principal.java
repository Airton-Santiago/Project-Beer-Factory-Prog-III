package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cliente_Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente_Principal frame = new Cliente_Principal();
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
	public Cliente_Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscolhaUmaOpo = new JLabel("Escolha uma nova op\u00E7\u00E3o para Cliente");
		lblEscolhaUmaOpo.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblEscolhaUmaOpo.setBounds(10, 11, 321, 40);
		contentPane.add(lblEscolhaUmaOpo);
		
		JButton btnCadastrarCliente = new JButton("Cadastrar cliente");
		btnCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente_Cadastro obj=new Cliente_Cadastro ();
				obj.setVisible(true);
				dispose();
			}
		});
		btnCadastrarCliente.setBounds(69, 62, 210, 23);
		contentPane.add(btnCadastrarCliente);
		
		JButton btnNewButton_1 = new JButton("Excluir cliente");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente_Exclusao obj=new Cliente_Exclusao();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(544, 62, 210, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Consultar cliente");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente_Consulta obj=new Cliente_Consulta();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(69, 311, 210, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Cliente_Principal.class.getResource("/Img/consulta.png")));
		label_1.setBounds(109, 375, 120, 120);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Cliente_Principal.class.getResource("/Img/Excluir.png")));
		label_2.setBounds(594, 96, 120, 120);
		contentPane.add(label_2);
		

		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Tela_Principal.class.getResource("/Img/Crystal_128_reload.png")));
		label_4.setBounds(584, 365, 130, 130);
		contentPane.add(label_4);
		
		JLabel lblVoltar = new JLabel("Voltar");
		lblVoltar.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblVoltar.setBounds(703, 506, 46, 14);
		contentPane.add(lblVoltar);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Principal obj=new Tela_Principal ();
				obj.setVisible(true);
				dispose();
			}
		});
		button.setIcon(new ImageIcon(Cliente_Principal.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		button.setBounds(757, 497, 46, 23);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Cliente_Principal.class.getResource("/Img/CadastroCliente.png")));
		lblNewLabel.setBounds(109, 96, 150, 150);
		contentPane.add(lblNewLabel);
		
		JButton btnAlterarCliente = new JButton("Alterar cliente");
		btnAlterarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente_Alterar obj = new Cliente_Alterar();
				obj.setVisible(true);
				dispose();
			}
		});
		btnAlterarCliente.setBounds(544, 311, 210, 23);
		contentPane.add(btnAlterarCliente);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Cliente_Principal.class.getResource("/Img/CadastroCliente.png")));
		label.setBounds(414, 41, 3, 442);
		contentPane.add(label);
	}
}
