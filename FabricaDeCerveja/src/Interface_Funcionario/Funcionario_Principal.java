package Interface_Funcionario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import Interface_Principal.Tela_Principal;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Funcionario_Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionario_Principal frame = new Funcionario_Principal();
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
	public Funcionario_Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Escolha uma nova op\u00E7\u00E3o para funcionario.");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblNewLabel.setBounds(20, 11, 326, 56);
		contentPane.add(lblNewLabel);
		
		JButton btnCadastrarFuncionario = new JButton("Cadastrar funcionario");
		btnCadastrarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Funcionario_Cadastro obj=new Funcionario_Cadastro();
				obj.setVisible(true);
			  	dispose();
			}
		});
		btnCadastrarFuncionario.setBounds(74, 78, 210, 23);
		contentPane.add(btnCadastrarFuncionario);
		
		JButton btnExcluirFuncionario = new JButton("Excluir funcionario");
		btnExcluirFuncionario.setBounds(557, 78, 210, 23);
		contentPane.add(btnExcluirFuncionario);
		
		JButton btnListarFuncionariosCadastrado = new JButton("Listar funcionarios cadastrados");
		btnListarFuncionariosCadastrado.setBounds(74, 303, 210, 23);
		contentPane.add(btnListarFuncionariosCadastrado);
		
		JButton btnConsultarFuncionario = new JButton("Consultar funcionario");
		btnConsultarFuncionario.setBounds(557, 303, 210, 23);
		contentPane.add(btnConsultarFuncionario);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Funcionario_Principal.class.getResource("/Img/AddUser.png")));
		label.setBounds(109, 112, 120, 120);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Funcionario_Principal.class.getResource("/Img/Listagem.png")));
		label_1.setBounds(109, 353, 120, 120);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(Funcionario_Principal.class.getResource("/Img/Excluir.png")));
		label_2.setBounds(597, 133, 120, 120);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(Funcionario_Principal.class.getResource("/Img/consulta.png")));
		label_3.setBounds(597, 363, 120, 120);
		contentPane.add(label_3);
		
		JLabel lblNewLabel_1 = new JLabel("Voltar");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(716, 506, 34, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Principal obj=new Tela_Principal();
				obj.setVisible(true);
			  	dispose();
			}
		});
		button.setIcon(new ImageIcon(Funcionario_Principal.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		button.setBounds(758, 502, 54, 23);
		contentPane.add(button);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(Funcionario_Principal.class.getResource("/Img/Layer1.png")));
		label_4.setBounds(417, 78, 4, 418);
		contentPane.add(label_4);
	}
}
