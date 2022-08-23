package gui;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import classes.Funcionario;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class TabelaDinamica extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel modelo;
	private List<Funcionario> lista;
	private JTextField txfNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabelaDinamica frame = new TabelaDinamica();
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
	public TabelaDinamica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 41, 416, 258);
		contentPane.add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Nome", "CPF"}));
		comboBox.setBounds(244, 10, 74, 21);
		contentPane.add(comboBox);

		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					lista = Funcionario.consultarPersonalizada(
							txfNome.getText(), 
							comboBox.getSelectedItem().toString());
					
					modelo = new DefaultTableModel();
					modelo.addColumn("Id");
					modelo.addColumn("Nome");
					modelo.addColumn("CPF");
					for (Funcionario f : lista) {
						modelo.addRow(new String[] {
								f.idfuncionario.toString(), f.nome, f.cpf
						});
					}
					table.setModel(modelo);
				} catch (Exception e2) {
					
					JOptionPane.showMessageDialog(null, "Erro" + e2);
				}
			}
		});
		btnConsultar.setBounds(328, 10, 98, 21);
		contentPane.add(btnConsultar);
		
		JLabel lblNewLabel = new JLabel("Digite a pista:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 14, 91, 13);
		contentPane.add(lblNewLabel);
		
		txfNome = new JTextField();
		txfNome.setBounds(99, 12, 98, 19);
		contentPane.add(txfNome);
		txfNome.setColumns(10);
		
	}
}
