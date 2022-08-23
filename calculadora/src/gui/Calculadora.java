package gui;

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
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 228, 203);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Valor 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(25, 42, 58, 13);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Valor 2");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(25, 92, 58, 13);
		contentPane.add(lblNewLabel_1);

		txfValor1 = new JTextField();
		txfValor1.setBounds(81, 39, 96, 19);
		contentPane.add(txfValor1);
		txfValor1.setColumns(10);

		txfValor2 = new JTextField();
		txfValor2.setBounds(81, 89, 96, 19);
		contentPane.add(txfValor2);
		txfValor2.setColumns(10);

		JButton btnDividir = new JButton("/");
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Double v1 = Double.parseDouble(txfValor1.getText());
					Double v2 = Double.parseDouble(txfValor2.getText());
					if(v2 == 0) {
						throw new Exception(); // gerando um erro
					}
					Double r = v1 / v2;
					JOptionPane.showMessageDialog(null, "Resultado: " + r);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, 
							"Ocorreu um erro");
				} finally {
					txfValor1.setText(null);
					txfValor2.setText(null);
				}
			}
		});
		btnDividir.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDividir.setBounds(156, 137, 48, 21);
		contentPane.add(btnDividir);

		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnMultiplicar.setBounds(87, 137, 48, 21);
		contentPane.add(btnMultiplicar);
	}
}
