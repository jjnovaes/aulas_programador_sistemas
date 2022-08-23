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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txfValor1;
	private JTextField txfValor2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == 107) {
					JOptionPane.showMessageDialog(null, "+");
				}
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Valor 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(25, 23, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Valor 2");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(25, 56, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		txfValor1 = new JTextField();
		txfValor1.setBounds(88, 21, 96, 19);
		contentPane.add(txfValor1);
		txfValor1.setColumns(10);
		
		txfValor2 = new JTextField();
		txfValor2.setBounds(88, 54, 96, 19);
		contentPane.add(txfValor2);
		txfValor2.setColumns(10);
		
		JButton btnSomar = new JButton("+");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double valor1 = Double.parseDouble(txfValor1.getText());
				Double valor2 = Double.parseDouble(txfValor2.getText());
				Double resultado = valor1 + valor2;
				JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
			}
			
		});
		btnSomar.setBounds(144, 83, 39, 21);
		contentPane.add(btnSomar);
	}

}
