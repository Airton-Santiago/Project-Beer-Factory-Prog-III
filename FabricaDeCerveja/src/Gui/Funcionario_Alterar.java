package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Beans.Cliente;
import Controle.CadastroCliente;
import Controle.CadastroFuncionario;
import Fachada.Fachada;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Funcionario_Alterar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private static JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionario_Alterar frame = new Funcionario_Alterar();
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
	public Funcionario_Alterar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Alterar Funcionario");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblNewLabel.setBounds(23, 40, 295, 68);
		contentPane.add(lblNewLabel);

		JLabel lblVoltar = new JLabel("Voltar");
		lblVoltar.setBounds(708, 490, 46, 14);
		contentPane.add(lblVoltar);

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario_Principal obj = new Funcionario_Principal();
				obj.setVisible(true);
				dispose();
			}
		});
		button.setIcon(new ImageIcon(
				Funcionario_Alterar.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		button.setBounds(743, 486, 56, 23);
		contentPane.add(button);

		JLabel lblCpfDoFuncionario = new JLabel("CPF do funcionario: ");
		lblCpfDoFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCpfDoFuncionario.setBounds(163, 205, 125, 14);
		contentPane.add(lblCpfDoFuncionario);

		JLabel lblNovoEndereo = new JLabel("Novo endere\u00E7o: ");
		lblNovoEndereo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNovoEndereo.setBounds(163, 280, 101, 14);
		contentPane.add(lblNovoEndereo);

		textField = new JTextField();
		textField.setBounds(272, 202, 206, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(272, 240, 206, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(274, 278, 204, 21);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {

					Cliente cliente = new Cliente();
					cliente.setNome(textField.getText());
					cliente.setCpf(textField_1.getText());
					cliente.setEndereco(textField_2.getText());

					CadastroFuncionario cf = new CadastroFuncionario();

					Fachada fachada = new Fachada();

					fachada.atualizarCliente(cliente);

					JOptionPane.showMessageDialog(rootPane, "Funcionario atualizado com sucesso!");
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(rootPane, "Erro!");

					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
				}
			}
		});

		// ----- Coloca o evento aqui pra fazer alteração do funcionario Tayene
		// -----
		btnAlterar.setBounds(391, 328, 89, 23);
		contentPane.add(btnAlterar);
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Funcionario_Alterar.class.getResource("/Img/Crystal_128_reload.png")));
		label.setBounds(543, 180, 130, 130);
		contentPane.add(label);
		
		JLabel lblEndereoAntigo = new JLabel("Endere\u00E7o antigo:");
		lblEndereoAntigo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEndereoAntigo.setBounds(163, 241, 141, 17);
		contentPane.add(lblEndereoAntigo);

	}
}