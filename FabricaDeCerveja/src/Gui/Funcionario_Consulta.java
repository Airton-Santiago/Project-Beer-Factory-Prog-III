package Gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Beans.Cliente;
import Beans.Fornecedor;
import Beans.Funcionario;
import Fachada.Fachada;
import Fachada.IFachada;

import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class Funcionario_Consulta extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private List<Funcionario> listaFuncionario;
	
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
		
		JLabel lblNewLabel = new JLabel("Consultar funcionario");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblNewLabel.setBounds(24, 22, 141, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCpf = new JLabel("CPF: ");
		lblCpf.setBounds(126, 232, 46, 14);
		contentPane.add(lblCpf);
		
		textField_1 = new JTextField();
		textField_1.setBounds(170, 229, 231, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel1 = new JLabel("Voltar ");
		lblNewLabel1.setBounds(701, 501, 46, 14);
		contentPane.add(lblNewLabel1);
		
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario_Principal obj=new Funcionario_Principal ();
				obj.setVisible(true);
				dispose();
			}
		});
		button.setIcon(new ImageIcon(Cliente_Alterar.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		button.setBounds(754, 497, 49, 23);
		contentPane.add(button);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			
				public void actionPerformed(ActionEvent e) {
					try {
						
						Cliente c = new Cliente();
					
						c.setCpf(textField_1.getText());
						c = Fachada.procurarCliente(c);
						if (c == null) {
							JOptionPane.showMessageDialog(null, "Não existe!");
						} else {
							JOptionPane.showMessageDialog(null, "Nome: " + c.getNome() + "  Endereço: " + c.getEndereco());
						}

					} catch (Exception e1) {
					e1.printStackTrace();
					}
			}
		});
		btnConsultar.setBounds(312, 260, 89, 23);
		contentPane.add(btnConsultar);
	}
}
