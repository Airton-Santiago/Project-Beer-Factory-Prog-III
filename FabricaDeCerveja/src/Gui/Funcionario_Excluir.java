package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Beans.Cliente;
import Beans.Estoque;
import Beans.Funcionario;
import Controle.CadastroCliente;
import Fachada.Fachada;
import Fachada.IFachada;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class Funcionario_Excluir extends JFrame {

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
		
		JLabel lblCpf = new JLabel("CPF: ");
		lblCpf.setBounds(205, 261, 46, 14);
		contentPane.add(lblCpf);
		
		textField_1 = new JTextField();
		textField_1.setBounds(248, 258, 230, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    
				try{
					Cliente cliente = new Cliente();
					if(textField_1.getText().trim().equals("")==false){
					cliente.setCnpj(textField_1.getText());
					
					cliente.setCpf(textField_1.getText());
					
					CadastroCliente cc = new CadastroCliente();
					Fachada fachada = new Fachada();
					fachada.cadastrarCliente(cliente);
					Fachada.removerCliente(cliente);
					JOptionPane.showMessageDialog(rootPane, "Funcionario removido!");
				}
					
				} catch(NullPointerException e1) {
					JOptionPane.showInputDialog(rootPane, "Erro, tente novamente!");
				}

			  	//
		}

		private Funcionario listaFuncionario() {
			// TODO Auto-generated method stub
			return null;
		}
	});
		btnExcluir.setBounds(298, 289, 89, 23);
		contentPane.add(btnExcluir);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    Funcionario_Principal obj=new Funcionario_Principal ();
					obj.setVisible(true);
				  	dispose();
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
