package Interface_Funcionario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Funcionario_Listar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionario_Listar frame = new Funcionario_Listar();
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
	public Funcionario_Listar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Todos funcionarios cadastrados");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblNewLabel.setBounds(22, 67, 295, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblVoltar = new JLabel("Voltar");
		lblVoltar.setBounds(708, 490, 46, 14);
		contentPane.add(lblVoltar);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(Funcionario_Listar.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		button.setBounds(743, 486, 56, 23);
		contentPane.add(button);
	}

}
