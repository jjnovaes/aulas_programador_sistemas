package tela;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Media extends JFrame {

	private JPanel contentPane;
	private JTextField txfNota1;
	private JTextField txfNota2;
	private JTextField txfMedia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Media frame = new Media();
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
	public Media() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 272, 203);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 245, 145);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nota 1:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 10, 58, 13);
		panel.add(lblNewLabel);
		
		txfNota1 = new JTextField();
		txfNota1.setBounds(65, 7, 96, 19);
		panel.add(txfNota1);
		txfNota1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nota 2:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 47, 58, 13);
		panel.add(lblNewLabel_1);
		
		txfNota2 = new JTextField();
		txfNota2.setBounds(65, 44, 96, 19);
		panel.add(txfNota2);
		txfNota2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("M\u00E9dia:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 80, 45, 13);
		panel.add(lblNewLabel_2);
		
		txfMedia = new JTextField();
		txfMedia.setBounds(65, 77, 96, 19);
		panel.add(txfMedia);
		txfMedia.setColumns(10);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txfNota1.setText("");
				txfNota2.setText("");
				txfMedia.setText("");
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLimpar.setBounds(10, 114, 85, 21);
		panel.add(btnLimpar);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double nota1, nota2, media;
				nota1 = Double.parseDouble(txfNota1.getText());
				nota2 = Double.parseDouble(txfNota2.getText());
				media = (nota1 + nota2)/2;
				txfMedia.setText(media.toString());
				
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCalcular.setBounds(150, 114, 85, 21);
		panel.add(btnCalcular);
	}
}
