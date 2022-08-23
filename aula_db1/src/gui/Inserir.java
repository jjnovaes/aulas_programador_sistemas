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

public class Inserir extends JFrame {

	private JPanel contentPane;
	private JTextField txfNome;
	private JTextField txfTelefone;
	private JTextField txfId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inserir frame = new Inserir();
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
	public Inserir() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 403, 217);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(34, 70, 45, 13);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Telefone:");
		lblNewLabel_1.setBounds(34, 112, 45, 13);
		contentPane.add(lblNewLabel_1);

		txfNome = new JTextField();
		txfNome.setBounds(89, 67, 262, 19);
		contentPane.add(txfNome);
		txfNome.setColumns(10);

		txfTelefone = new JTextField();
		txfTelefone.setBounds(89, 109, 96, 19);
		contentPane.add(txfTelefone);
		txfTelefone.setColumns(10);

		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Conexao conexao = new Conexao();
					Connection con = conexao.conectar();
					PreparedStatement ps;
					String sql = "insert into pessoa (nome, telefone) values (?,?)";
					ps = con.prepareStatement(sql);
					ps.setString(1, txfNome.getText());
					ps.setString(2, txfTelefone.getText());
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "Registro inserido", "Atenção", JOptionPane.WARNING_MESSAGE);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Ocorreu um erro", "Atenção", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnIncluir.setBounds(294, 149, 85, 21);
		contentPane.add(btnIncluir);

		JLabel lblNewLabel_2 = new JLabel("Id:");
		lblNewLabel_2.setBounds(34, 24, 45, 13);
		contentPane.add(lblNewLabel_2);

		txfId = new JTextField();
		txfId.setBounds(89, 21, 96, 19);
		contentPane.add(txfId);
		txfId.setColumns(10);

		JButton btnNewButton = new JButton("Excluir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Conexao conexao = new Conexao();
					Connection con = conexao.conectar();
					PreparedStatement ps;
					String sql = "delete from pessoa where idpessoa = ?";
					ps = con.prepareStatement(sql);
					ps.setInt(1, Integer.parseInt(txfId.getText()));
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "Registro excluido", "Atenção", JOptionPane.WARNING_MESSAGE);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Ocorreu um erro", "Atenção", JOptionPane.ERROR_MESSAGE);
				}
			}			
		});
		btnNewButton.setBounds(10, 149, 85, 21);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Alterar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Conexao conexao = new Conexao();
					Connection con = conexao.conectar();
					PreparedStatement ps;
					String sql = "UPDATE pessoa SET nome = ?, telefone = ? WHERE idpessoa = ?";
					ps = con.prepareStatement(sql);
					ps.setString(1, txfNome.getText());
					ps.setString(2, txfTelefone.getText());
					ps.setInt(3, Integer.parseInt(txfId.getText()));
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "Registro alterado", "Atenção", JOptionPane.WARNING_MESSAGE);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Ocorreu um erro", "Atenção", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton_1.setBounds(147, 149, 85, 21);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Buscar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (txfId.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null,"Campo id vazio");
					} else {
						//conexao com banco de dados
						Conexao conexao = new Conexao();
						Connection con = conexao.conectar();
						PreparedStatement ps; //guarda o comando SQL
						ResultSet rs;  // guarda o retorno da consulta
						String sql = "select * from pessoa where idpessoa = ?";
						ps = con.prepareStatement(sql); //preparando o comando sql
						ps.setInt(1, Integer.parseInt(txfId.getText())); //substituindo a ?
						rs = ps.executeQuery(); //executando o sql
						if (!rs.next()) { //verificando se tá vazio
							throw new Exception("Nenhum registro encontrado");
						}
						//preenchendo os campos de texto com o resultado da consulta
						txfNome.setText(rs.getString("nome"));
						txfTelefone.setText(rs.getString("telefone"));
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Ocorreu um erro " + ex, "Atenção", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton_2.setBounds(195, 20, 74, 21);
		contentPane.add(btnNewButton_2);
	}
}
