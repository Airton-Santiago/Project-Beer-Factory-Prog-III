package Interface_Funcionario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Funcionario_Consulta extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionario_Consulta frame = new Funcionario_Consulta();
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
	public Funcionario_Consulta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Filtros da pesquisa");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblNewLabel.setBounds(24, 22, 141, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(91, 64, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF: ");
		lblCpf.setBounds(91, 103, 46, 14);
		contentPane.add(lblCpf);
		
		textField = new JTextField();
		textField.setBounds(135, 61, 231, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(135, 100, 231, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnConsulta = new JButton("Consulta");
		btnConsulta.setBounds(413, 99, 89, 23);
		contentPane.add(btnConsulta);
		
		JLabel lblNewLabel_1 = new JLabel("Voltar ");
		lblNewLabel_1.setBounds(701, 501, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    Funcionario_Principal obj=new Funcionario_Principal ();
					obj.setVisible(true);
				  	dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon(Funcionario_Consulta.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		btnNewButton.setBounds(740, 497, 59, 23);
		contentPane.add(btnNewButton);
	}
}
