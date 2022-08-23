package lista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Tela extends JFrame {

	private JPanel contentPane;
	private JTextField txfMatricula;
	private JTextField txfNome;
	List<Aluno> alunos = new ArrayList<Aluno>();

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
		setBounds(100, 100, 343, 266);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Matricula");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 10, 59, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(24, 44, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		txfMatricula = new JTextField();
		txfMatricula.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txfMatricula.setBounds(79, 7, 96, 19);
		contentPane.add(txfMatricula);
		txfMatricula.setColumns(10);
		
		txfNome = new JTextField();
		txfNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txfNome.setBounds(68, 41, 250, 19);
		contentPane.add(txfNome);
		txfNome.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				Aluno a = new Aluno();
				a.matricula = Integer.parseInt(txfMatricula.getText());
				a.nome = txfNome.getText();
				alunos.add(a);
				JOptionPane.showMessageDialog(null, "Inserido com sucesso");
				txfMatricula.setText(null);
				txfNome.setText(null);
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSalvar.setBounds(233, 70, 85, 21);
		contentPane.add(btnSalvar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 116, 308, 103);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Exibir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(alunos.toString());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(10, 86, 85, 21);
		contentPane.add(btnNewButton);
	}
}
