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

public class Fornecedor_Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fornecedor_Principal frame = new Fornecedor_Principal();
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
	public Fornecedor_Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escolha uma nova op\u00E7\u00E3o para fornecedor.");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblNewLabel.setBounds(31, 86, 371, 20);
		contentPane.add(lblNewLabel);
		
		JButton btnCadastrarFornecedor = new JButton("Cadastrar fornecedor");
		btnCadastrarFornecedor.setBounds(107, 188, 198, 23);
		contentPane.add(btnCadastrarFornecedor);
		
		JButton btnConsultarFornecedor = new JButton("Consultar fornecedor");
		btnConsultarFornecedor.setBounds(510, 188, 198, 23);
		contentPane.add(btnConsultarFornecedor);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Fornecedor_Principal.class.getResource("/Img/Cadastrofornecedores.png")));
		lblNewLabel_1.setBounds(127, 249, 167, 150);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Fornecedor_Principal.class.getResource("/Img/bg-tags.png")));
		lblNewLabel_2.setBounds(540, 249, 150, 150);
		contentPane.add(lblNewLabel_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Fornecedor_Principal.class.getResource("/Img/Layer1.png")));
		label.setBounds(412, 170, 4, 300);
		contentPane.add(label);
		
		JLabel lblNewLabel_3 = new JLabel("Voltar");
		lblNewLabel_3.setBounds(719, 501, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Principal obj=new Tela_Principal ();
				obj.setVisible(true);
				dispose();
			}
		});
		button.setIcon(new ImageIcon(Fornecedor_Principal.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		button.setBounds(752, 497, 46, 23);
		contentPane.add(button);
	}

}
