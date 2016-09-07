package Interface_Cliente;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;

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
		lblEscolhaUmaOpo.setBounds(10, 11, 321, 14);
		contentPane.add(lblEscolhaUmaOpo);
		
		JButton btnCadastrarCliente = new JButton("Cadastrar cliente");
		btnCadastrarCliente.setBounds(69, 62, 210, 23);
		contentPane.add(btnCadastrarCliente);
		
		JButton btnNewButton = new JButton("Listar clientes cadastrados");
		btnNewButton.setBounds(69, 278, 210, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Excluir cliente");
		btnNewButton_1.setBounds(544, 62, 210, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Consultar cliente");
		btnNewButton_2.setBounds(544, 278, 210, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Cliente_Principal.class.getResource("/Img/Listagem.png")));
		label.setBounds(109, 334, 120, 120);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Cliente_Principal.class.getResource("/Img/consulta.png")));
		label_1.setBounds(594, 334, 120, 120);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Cliente_Principal.class.getResource("/Img/Excluir.png")));
		label_2.setBounds(594, 96, 120, 120);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Cliente_Principal.class.getResource("/Img/Layer1.png")));
		label_3.setBounds(414, 62, 4, 418);
		contentPane.add(label_3);
		
		JLabel lblVoltar = new JLabel("Voltar");
		lblVoltar.setFont(new Font("Trebuchet MS", Font.PLAIN, 12));
		lblVoltar.setBounds(703, 506, 46, 14);
		contentPane.add(lblVoltar);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(Cliente_Principal.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		button.setBounds(757, 497, 46, 23);
		contentPane.add(button);
	}

}
