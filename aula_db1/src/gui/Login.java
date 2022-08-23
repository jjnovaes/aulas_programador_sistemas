package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Conexao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txfLogin;
	private JPasswordField txfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 245, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Login:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(20, 23, 45, 13);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Senha:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(20, 83, 45, 13);
		contentPane.add(lblNewLabel_1);

		txfLogin = new JTextField();
		txfLogin.setBounds(67, 20, 134, 19);
		contentPane.add(txfLogin);
		txfLogin.setColumns(10);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Conexao conexao = new Conexao();
					Connection con = conexao.conectar();
					PreparedStatement ps; 
					ResultSet rs; 
					String sql = "select * from usuario where login = ? and senha = ?";
					ps = con.prepareStatement(sql);
					ps.setString(1, txfLogin.getText());
					ps.setString(2, txfSenha.getText());
					rs = ps.executeQuery(); 
					if (!rs.next()) { 
						JOptionPane.showMessageDialog(null, "Login ou senha invalidos"); 
					} else {
						Principal p = new Principal();
						p.setVisible(true);
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Ocorreu um erro " + ex, "Atenção", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(67, 135, 85, 21);
		contentPane.add(btnNewButton);

		txfSenha = new JPasswordField();
		txfSenha.setBounds(67, 81, 134, 19);
		contentPane.add(txfSenha);
	}
}
