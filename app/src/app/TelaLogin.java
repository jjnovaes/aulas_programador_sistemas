package app;

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
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txfLogin;
	private JPasswordField txfSenha;
	private Usuario usuario;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 284, 208);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(106, 21, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(106, 69, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		txfLogin = new JTextField();
		txfLogin.setBounds(80, 44, 96, 19);
		contentPane.add(txfLogin);
		txfLogin.setColumns(10);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usuario = new Usuario();
				usuario.login = txfLogin.getText();
				usuario.senha = txfSenha.getText();
				if(usuario.logar()) {
					TelaPrincipal tp = new TelaPrincipal();
					tp.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Login ou senha inválidos");
				}
			}
		});
		btnLogar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnLogar.setBounds(86, 128, 85, 21);
		contentPane.add(btnLogar);
		
		txfSenha = new JPasswordField();
		txfSenha.setBounds(80, 92, 96, 19);
		contentPane.add(txfSenha);
	}
}
