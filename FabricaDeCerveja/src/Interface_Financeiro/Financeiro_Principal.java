package Interface_Financeiro;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Interface_Principal.Tela_Principal;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Financeiro_Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Financeiro_Principal frame = new Financeiro_Principal();
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
	public Financeiro_Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblVoltar = new JLabel("Voltar");
		lblVoltar.setBounds(696, 487, 46, 14);
		contentPane.add(lblVoltar);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tela_Principal obj=new Tela_Principal ();
				obj.setVisible(true);
				dispose();
			}
		});
		button.setIcon(new ImageIcon(Financeiro_Principal.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		button.setBounds(738, 483, 56, 23);
		contentPane.add(button);
	}

}
