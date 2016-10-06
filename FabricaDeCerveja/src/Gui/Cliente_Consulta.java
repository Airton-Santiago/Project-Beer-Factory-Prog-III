package Gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Beans.Cliente;
import Beans.Fornecedor;
import Fachada.Fachada;
import Fachada.IFachada;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class Cliente_Consulta extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private List<Cliente> listaCliente;
	private Component btnConsultar;

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

		JLabel lblFiltosDaPesquisa = new JLabel("Consultar cliente");
		lblFiltosDaPesquisa.setFont(new Font("Verdana", Font.PLAIN, 17));
		lblFiltosDaPesquisa.setBounds(23, 70, 186, 34);
		contentPane.add(lblFiltosDaPesquisa);

		JLabel lblNewLabel = new JLabel("CNPJ: ");
		lblNewLabel.setBounds(130, 210, 46, 14);
		contentPane.add(lblNewLabel);

		textField_1 = new JTextField();
		textField_1.setBounds(172, 207, 225, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblVoltar = new JLabel("Voltar");
		lblVoltar.setBounds(708, 501, 36, 14);
		contentPane.add(lblVoltar);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cliente_Principal obj=new Cliente_Principal ();
				obj.setVisible(true);
				dispose();
			}
		});
		button.setIcon(new ImageIcon(Cliente_Alterar.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		button.setBounds(754, 497, 49, 23);
		contentPane.add(button);
		
		JButton btnConsultar_1 = new JButton("Consultar");
		btnConsultar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					
						
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
			
		
		btnConsultar_1.setBounds(316, 266, 89, 23);
		contentPane.add(btnConsultar_1);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Cliente_Consulta.class.getResource("/Img/consulta.png")));
		label.setBounds(541, 189, 150, 150);
		contentPane.add(label);

		}
}

