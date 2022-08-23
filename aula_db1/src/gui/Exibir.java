package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import classes.Conexao;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Exibir extends JFrame {

	private JPanel contentPane;
	private JTextArea txaResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exibir frame = new Exibir();
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
	public Exibir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//realizando a conexao com o BD
					Conexao conexao = new Conexao();
					Connection con = conexao.conectar();
					
					PreparedStatement ps; //Classe que armazena um comando SQL
					ResultSet rs; //Classe que armazena o resultado da consulta
					String sql = "select * from pessoa"; //definindo o comando SQL
					ps = con.prepareStatement(sql); //Preparando o comando
					rs = ps.executeQuery(); //executa o SQL o rs armazena o resulta
					String resultado = "";
					while(rs.next()) {
						resultado  = resultado + rs.getInt("idpessoa") + "   " + 
								rs.getString("nome") +"   " + 
								rs.getString("telefone") + "\n";						
					}
					txaResultado.setText(resultado);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Ocorreu um erro" + ex, 
							"Atenção", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnConsultar.setBounds(10, 10, 85, 21);
		contentPane.add(btnConsultar);
		
		txaResultado = new JTextArea();
		txaResultado.setBounds(10, 41, 416, 212);
		contentPane.add(txaResultado);
	}
}
