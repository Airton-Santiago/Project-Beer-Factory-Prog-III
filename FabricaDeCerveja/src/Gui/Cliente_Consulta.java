package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cliente_Consulta extends JFrame {

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
					Cliente_Consulta frame = new Cliente_Consulta();
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
	public Cliente_Consulta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFiltosDaPesquisa = new JLabel("Filtos da pesquisa");
		lblFiltosDaPesquisa.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblFiltosDaPesquisa.setBounds(26, 32, 158, 14);
		contentPane.add(lblFiltosDaPesquisa);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(78, 71, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblNewLabel = new JLabel("CNPJ:");
		lblNewLabel.setBounds(78, 115, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(120, 68, 225, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 112, 225, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Consultar");
		btnNewButton.setBounds(387, 111, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Voltar");
		lblNewLabel_1.setBounds(704, 488, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente_Principal obj=new Cliente_Principal ();
				obj.setVisible(true);
				dispose();
			}
		});
		button.setIcon(new ImageIcon(Cliente_Consulta.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		button.setBounds(738, 484, 46, 23);
		contentPane.add(button);
	}

}