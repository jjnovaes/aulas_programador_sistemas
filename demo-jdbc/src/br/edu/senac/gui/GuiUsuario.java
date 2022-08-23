package br.edu.senac.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.senac.classes.Curso;
import br.edu.senac.classes.Usuario;
import br.edu.senac.dao.CursoDao;
import br.edu.senac.dao.UsuarioDao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class GuiUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField txfLogin;
	private JTextField txfSenha;
	private JTextField txfNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiUsuario frame = new GuiUsuario();
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
	public GuiUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 416, 226);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 23, 45, 13);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 61, 45, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nome");
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 99, 45, 13);
		panel.add(lblNewLabel_2);
		
		txfLogin = new JTextField();
		txfLogin.setBounds(55, 21, 96, 19);
		panel.add(txfLogin);
		txfLogin.setColumns(10);
		
		txfSenha = new JTextField();
		txfSenha.setBounds(65, 59, 96, 19);
		panel.add(txfSenha);
		txfSenha.setColumns(10);
		
		txfNome = new JTextField();
		txfNome.setBounds(55, 97, 351, 19);
		panel.add(txfNome);
		txfNome.setColumns(10);
		
		JCheckBox chcAtivo = new JCheckBox("Ativo");
		chcAtivo.setForeground(new Color(0, 0, 128));
		chcAtivo.setFont(new Font("Tahoma", Font.BOLD, 12));
		chcAtivo.setBounds(10, 140, 93, 21);
		panel.add(chcAtivo);
		
		JLabel lblNewLabel_3 = new JLabel("Sexo:");
		lblNewLabel_3.setBounds(10, 189, 45, 13);
		panel.add(lblNewLabel_3);
		
		JRadioButton rdbMasc = new JRadioButton("Masculino");
		rdbMasc.setBounds(58, 185, 103, 21);
		panel.add(rdbMasc);
		
		JRadioButton rdbFem = new JRadioButton("Feminino");
		rdbFem.setBounds(163, 185, 103, 21);
		panel.add(rdbFem);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 259, 416, 36);
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("Incluir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Usuario usuario = new Usuario();
					usuario.setNome(txfNome.getText());
					usuario.setLogin(txfLogin.getText());
					usuario.setSenha(txfSenha.getText());
					usuario.setAtivo(chcAtivo.isSelected());					
					//isSelected retorna true se tiver marcado e false caso contrario
					UsuarioDao usuarioDao = new UsuarioDao();
					usuarioDao.incluir(usuario);					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Erro " + ex);
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\joao46152477\\projetos\\demo-jdbc\\icones\\icon_save.png"));
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(btnNewButton);
	}
}
