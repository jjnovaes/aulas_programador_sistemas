package tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField txfNome;
	private JTextField txfIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
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
	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 187);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(20, 23, 45, 13);
		contentPane.add(lblNewLabel);
		
		txfNome = new JTextField();
		txfNome.setBounds(75, 22, 325, 19);
		contentPane.add(txfNome);
		txfNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Idade:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(20, 69, 59, 13);
		contentPane.add(lblNewLabel_1);
		
		txfIdade = new JTextField();
		txfIdade.setBounds(67, 68, 38, 19);
		contentPane.add(txfIdade);
		txfIdade.setColumns(10);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome;
				Integer idade;

				nome = txfNome.getText();
				idade = Integer.parseInt(txfIdade.getText());
				
				JOptionPane.showMessageDialog(null, "Seu nome é: " + nome 
						+ "\nSua Idade: " + idade);
			}
		});
		btnGravar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnGravar.setBounds(312, 120, 85, 21);
		contentPane.add(btnGravar);
	}
}
