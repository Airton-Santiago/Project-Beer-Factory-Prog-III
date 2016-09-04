package Interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escolha uma fun\u00E7\u00E3o para continuar");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblNewLabel.setBounds(20, 146, 364, 57);
		contentPane.add(lblNewLabel);
		
		JButton btnFuncionario = new JButton("Funcionario");
		btnFuncionario.setBounds(50, 224, 89, 23);
		contentPane.add(btnFuncionario);
		
		JButton btnNewButton = new JButton("Cliente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(240, 224, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Financeiro");
		btnNewButton_1.setBounds(424, 224, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Fornecedor");
		btnNewButton_2.setBounds(638, 224, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("Voltar");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(711, 497, 54, 23);
		contentPane.add(lblNewLabel_1);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		button.setBounds(761, 497, 54, 23);
		contentPane.add(button);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Italo\\Desktop\\Projeto\\Imagens\\CadastroFuncionario.png"));
		label.setBounds(20, 274, 157, 158);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Italo\\Desktop\\Projeto\\Imagens\\bem-vindo.png"));
		label_1.setBounds(10, 0, 517, 135);
		contentPane.add(label_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Italo\\Desktop\\Projeto\\Imagens\\Cliente.png"));
		lblNewLabel_2.setBounds(210, 274, 157, 157);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Italo\\Desktop\\Projeto\\Imagens\\Financeiro.png"));
		lblNewLabel_3.setBounds(401, 274, 163, 157);
		contentPane.add(lblNewLabel_3);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Italo\\Desktop\\Projeto\\Imagens\\Cadastrofornecedores.png"));
		label_2.setBounds(602, 274, 163, 158);
		contentPane.add(label_2);
	}
}
