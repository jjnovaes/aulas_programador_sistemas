package br.edu.senac.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import br.edu.senac.classes.Usuario;
import br.edu.senac.dao.UsuarioDao;

import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiLogin extends JFrame {

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
					GuiLogin frame = new GuiLogin();
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
	public GuiLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 285, 209);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(10, 22, 251, 95);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\joao46152477\\projetos\\demo-jdbc\\icones\\icon_user.png"));
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(28, 17, 45, 20);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\joao46152477\\projetos\\demo-jdbc\\icones\\icon_key.png"));
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(28, 55, 45, 20);
		panel.add(lblNewLabel_1);
		
		txfLogin = new JTextField();
		txfLogin.setBounds(79, 17, 135, 19);
		panel.add(txfLogin);
		txfLogin.setColumns(10);
		
		txfSenha = new JPasswordField();
		txfSenha.setBounds(79, 56, 135, 19);
		panel.add(txfSenha);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(10, 127, 251, 32);
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Usuario usuario = new Usuario();
					usuario.setLogin(txfLogin.getText());
					usuario.setSenha(txfSenha.getText());
					UsuarioDao usuarioDao = new UsuarioDao();
					//Boolean login = usuarioDao.validarUsuario(usuario);
					if(usuarioDao.validarUsuario(usuario)) {
						GuiPrincipal gp = new GuiPrincipal();
						gp.setVisible(true);
					} else {
						JOptionPane.showMessageDialog(null, "Usuario ou senha inválidos");
					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Ocorreu um erro"+e2);
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\joao46152477\\projetos\\demo-jdbc\\icones\\login.png"));
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(btnNewButton);
	}
}
