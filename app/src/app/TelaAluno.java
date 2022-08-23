package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAluno extends JFrame {

	private JPanel contentPane;
	private JTextField txfNome;
	private JTextField txfIdade;
	private Aluno aluno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAluno frame = new TelaAluno();
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
	public TelaAluno() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 510, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 32, 69, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idade:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 74, 69, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Curso:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 120, 69, 13);
		contentPane.add(lblNewLabel_2);
		
		txfNome = new JTextField();
		txfNome.setBounds(89, 29, 366, 19);
		contentPane.add(txfNome);
		txfNome.setColumns(10);
		
		txfIdade = new JTextField();
		txfIdade.setBounds(89, 71, 43, 19);
		contentPane.add(txfIdade);
		txfIdade.setColumns(10);
		
		JComboBox cmbCurso = new JComboBox();
		cmbCurso.setFont(new Font("Tahoma", Font.BOLD, 12));
		cmbCurso.setModel(new DefaultComboBoxModel(new String[] {"Informatica", "Redes de Computadores", "Programador de Sistemas"}));
		cmbCurso.setBounds(89, 118, 199, 21);
		contentPane.add(cmbCurso);
		
		JButton btnGravar = new JButton("Gravar");
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aluno = new Aluno();
				aluno.nome = txfNome.getText();
				aluno.idade = Integer.parseInt(txfIdade.getText());
				aluno.curso = cmbCurso.getSelectedItem().toString();
				JOptionPane.showMessageDialog(null, "Aluno gravado com sucesso");
			}
		});
		btnGravar.setBounds(363, 160, 85, 21);
		contentPane.add(btnGravar);
	}
}
