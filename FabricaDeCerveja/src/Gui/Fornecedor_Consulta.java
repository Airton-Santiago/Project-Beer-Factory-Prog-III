package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Beans.Cliente;
import Beans.Fornecedor;
import Beans.Gerente;
import Fachada.Fachada;
import Fachada.IFachada;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class Fornecedor_Consulta extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private List<Fornecedor> listaFornecedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fornecedor_Consulta frame = new Fornecedor_Consulta();
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
	public Fornecedor_Consulta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConsulta = new JLabel("Consulta");
		lblConsulta.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		lblConsulta.setBounds(29, 28, 70, 28);
		contentPane.add(lblConsulta);
		
		JLabel lblCnpj = new JLabel("CNPJ: ");
		lblCnpj.setBounds(82, 116, 46, 14);
		contentPane.add(lblCnpj);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(82, 86, 46, 14);
		contentPane.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(134, 83, 169, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(134, 113, 169, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try{
					
					Fornecedor f = new Fornecedor();
					if(textField_1.getText().trim().equals("")==false){
					f.setCnpj(textField_1.getText());
					}
					f.setNome(textField.getText());
					listaFornecedor = Fachada.procurarFornecedor(f);
					DefaultTableModel modelo = new DefaultTableModel();
					modelo.setColumnIdentifiers(new String[]{"CNPJ", "NOME"});
					for( Fornecedor fornecedor : listaFornecedor) {
					modelo.addRow(new String[]{fornecedor.getCnpj() + "", fornecedor.getNome()});
					}
					AbstractButton jTableResultadoPesquisa = null;
					jTableResultadoPesquisa.setModel((ButtonModel) modelo);
					} catch (Exception ex) {
						JOptionPane.showMessageDialog(rootPane, "Erro!");
					}
				
			}
		});
		btnConsultar.setBounds(338, 112, 89, 23);
		contentPane.add(btnConsultar);
		
		JLabel lblVoltar = new JLabel("Voltar");
		lblVoltar.setBounds(670, 491, 46, 14);
		contentPane.add(lblVoltar);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				Fornecedor_Principal obj=new Fornecedor_Principal() ;
				obj.setVisible(true);
				dispose();
				
			}
		});
		button.setIcon(new ImageIcon(Fornecedor_Consulta.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		button.setBounds(726, 487, 46, 23);
		contentPane.add(button);
	}

}
