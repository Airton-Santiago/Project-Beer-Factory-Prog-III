package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Beans.Estoque;
import Beans.Funcionario;
import Fachada.Fachada;
import Fachada.IFachada;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Funcionario_Excluir extends JFrame {

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
					Funcionario_Excluir frame = new Funcionario_Excluir();
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
	public Funcionario_Excluir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblExcluirFuncionarioCadastrado = new JLabel("Excluir funcionario cadastrado");
		lblExcluirFuncionarioCadastrado.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblExcluirFuncionarioCadastrado.setBounds(41, 99, 282, 14);
		contentPane.add(lblExcluirFuncionarioCadastrado);
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		lblNewLabel.setBounds(205, 228, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCpf = new JLabel("CPF: ");
		lblCpf.setBounds(205, 261, 46, 14);
		contentPane.add(lblCpf);
		
		textField = new JTextField();
		textField.setBounds(248, 225, 230, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(248, 258, 230, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(298, 289, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    Funcionario_Principal obj=new Funcionario_Principal ();
					obj.setVisible(true);
				  	dispose();
				  	//nome e cpf
				  	try{
						Funcionario funcionario = new Funcionario(null, null, null, 0);
						if(textField_1.getText().trim().equals("")==false){
						funcionario.setCpf(textField_1.getText());
						
					}
						Funcionario funcionario = this.listaFuncionario.getSelectedRow();
						IFachada fachada = new Fachada();
						fachada.removerFuncionario(f);
						JOptionPane.showMessageDialog(rootPane, "Funcionario removido do sistema.");
					} catch(Exception ex) {
						JOptionPane.showInputDialog(rootPane,ex.getMessage());
					}
				  	//
			}
		});
		btnVoltar.setBounds(389, 289, 89, 23);
		contentPane.add(btnVoltar);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Funcionario_Excluir.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-error@2x.png")));
		label.setBounds(574, 228, 96, 96);
		contentPane.add(label);
	}

}
