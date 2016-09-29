package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Beans.Fornecedor;
import Beans.Funcionario;
import Fachada.Fachada;
import Fachada.IFachada;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Fornecedor_Cadastro extends JFrame {

	private JPanel contentPane;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fornecedor_Cadastro frame = new Fornecedor_Cadastro();
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
	public Fornecedor_Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Fornecedor_Cadastro.class.getResource("/Img/LogoCadastro.png")));
		label.setBounds(10, 68, 174, 51);
		contentPane.add(label);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(146, 212, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		lblCnpj.setBounds(146, 237, 46, 14);
		contentPane.add(lblCnpj);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o: ");
		lblEndereo.setBounds(146, 262, 66, 14);
		contentPane.add(lblEndereo);
		
		JLabel lblProdutoFornecido = new JLabel("Produto fornecido: ");
		lblProdutoFornecido.setBounds(146, 287, 112, 14);
		contentPane.add(lblProdutoFornecido);
		
		JLabel lblQuantidadeDoProduto = new JLabel("Quantidade: ");
		lblQuantidadeDoProduto.setBounds(146, 312, 80, 14);
		contentPane.add(lblQuantidadeDoProduto);
		
		JLabel lblValorDoServio = new JLabel("Valor do servi\u00E7o: ");
		lblValorDoServio.setBounds(146, 337, 98, 14);
		contentPane.add(lblValorDoServio);
		
		textField = new JTextField();
		textField.setBounds(295, 209, 163, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(295, 234, 163, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(295, 287, 163, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(295, 262, 163, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(295, 337, 163, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(295, 312, 163, 20);
		contentPane.add(textField_5);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//nome>cnpj>endereco>produto>qnt>valor
				try {
					
					Fornecedor fornecedor = new Fornecedor(null, null, null, null, 0, 0) ;
					fornecedor.setNome(textField.getText());
					fornecedor.setCnpj(textField_1.getText());
					fornecedor.setEndereco(textField_2.getText());
					fornecedor.setProduto_fornecido(textField_3.getText());
					fornecedor.setQuantidade_produto(textField_4.getWidth());
					fornecedor.setValor_servico(textField_4.getWidth());
					
					Fachada.cadastrarFornecedor(fornecedor);
					
					
				}	catch (Exception ex){
					JOptionPane.showMessageDialog(rootPane, "Funcionario cadastrado com sucesso!");
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
				}
				//
				
				
			}
		});
		btnCadastrar.setBounds(261, 368, 98, 23);
		contentPane.add(btnCadastrar);
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon(Fornecedor_Cadastro.class.getResource("/Img/Cadastrofornecedores.png")));
		label_1.setBounds(541, 226, 150, 150);
		contentPane.add(label_1);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fornecedor_Principal obj = new Fornecedor_Principal();
				obj.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(369, 368, 89, 23);
		contentPane.add(btnVoltar);
	}


	}

