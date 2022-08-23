package br.edu.senac.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Desktop;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import br.edu.senac.classes.Curso;
import br.edu.senac.dao.CursoDao;
import br.edu.senac.relatorios.RelatorioCursos;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class GuiCurso extends JFrame {

	private JPanel contentPane;
	private JTextField txfId;
	private JTextField txfDescricao;
	private JTextField txfConteudo;
	private JTable table;

	private Curso curso;
	private CursoDao cursoDao;
	private List<Curso> lista;
	private DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiCurso frame = new GuiCurso();
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
	public GuiCurso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 10, 555, 157);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(31, 20, 45, 13);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Descricao");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(7, 58, 69, 13);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Conte\u00FAdo");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(-3, 103, 99, 13);
		panel.add(lblNewLabel_2);

		txfId = new JTextField();
		txfId.setEditable(false);
		txfId.setBounds(86, 18, 86, 19);
		panel.add(txfId);
		txfId.setColumns(10);

		txfDescricao = new JTextField();
		txfDescricao.setBounds(86, 56, 459, 19);
		panel.add(txfDescricao);
		txfDescricao.setColumns(10);

		txfConteudo = new JTextField();
		txfConteudo.setBounds(90, 101, 455, 19);
		panel.add(txfConteudo);
		txfConteudo.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 177, 555, 42);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PESQUISAR SOBRE O JOptionPane.showConfirmDialog
				try {
					Integer resp = JOptionPane.showConfirmDialog(null, "Deseja excluir?");
					if(resp == 0) {					
						curso = new Curso();
						cursoDao = new CursoDao();
						curso.setDescricao(txfDescricao.getText());
						curso.setConteudo(txfConteudo.getText());
						curso.setIdcurso(Integer.parseInt(txfId.getText()));					
						cursoDao.excluir(curso);
						limpar();
						popularTabela();
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Erro " + ex);
				}
			}
		});
		btnExcluir.setIcon(new ImageIcon("C:\\Users\\joao46152477\\projetos\\demo-jdbc\\icones\\icon_trash.png"));
		btnExcluir.setForeground(new Color(0, 0, 128));
		btnExcluir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnExcluir.setBounds(30, 10, 108, 24);
		panel_1.add(btnExcluir);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					curso = new Curso();
					cursoDao = new CursoDao();
					curso.setDescricao(txfDescricao.getText());
					curso.setConteudo(txfConteudo.getText());
					curso.setIdcurso(Integer.parseInt(txfId.getText()));					
					cursoDao.alterar(curso);
					limpar();
					popularTabela();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Erro " + ex);
				}
			}
		});
		btnAlterar.setIcon(new ImageIcon("C:\\Users\\joao46152477\\projetos\\demo-jdbc\\icones\\icon_edit.png"));
		btnAlterar.setForeground(new Color(0, 0, 128));
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAlterar.setBounds(165, 10, 99, 24);
		panel_1.add(btnAlterar);

		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					curso = new Curso();
					cursoDao = new CursoDao();
					curso.setDescricao(txfDescricao.getText());
					curso.setConteudo(txfConteudo.getText());
					cursoDao.incluir(curso);
					limpar();
					popularTabela();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "Erro " + ex);
				}
			}
		});
		btnIncluir.setIcon(new ImageIcon("C:\\Users\\joao46152477\\projetos\\demo-jdbc\\icones\\icon_save.png"));
		btnIncluir.setForeground(new Color(0, 0, 128));
		btnIncluir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnIncluir.setBounds(301, 10, 108, 24);
		panel_1.add(btnIncluir);
		
		JButton btnNewButton = new JButton("Relatorio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//vai gerar relatorio pdf
					RelatorioCursos rc = new RelatorioCursos();
					//abrindo o arquivo gerado
					Desktop desktop = Desktop.getDesktop();
					desktop.open(new File("C:\\relatorios\\rel_cursos.pdf"));					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Erro "+e2);
				}				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setForeground(new Color(0, 0, 128));
		btnNewButton.setBounds(438, 13, 107, 21);
		panel_1.add(btnNewButton);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 234, 555, 218);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				//peguei o indice selecionado 
				Integer itemSelecionado = table.getSelectionModel().getLeadSelectionIndex();
				//peguei o objeto que representa o indice
				curso = lista.get(itemSelecionado);
				//colando as informações do objeto na tela
				txfId.setText(curso.getIdcurso().toString());
				txfDescricao.setText(curso.getDescricao());
				txfConteudo.setText(curso.getConteudo());
				
			}
		});
		scrollPane.setViewportView(table);
		
		popularTabela();
	}

	public void limpar() {
		txfId.setText(null);
		txfDescricao.setText(null);
		txfConteudo.setText(null);
	}

	public void popularTabela() {
		try {
			cursoDao = new CursoDao();
			lista = cursoDao.buscarTodos();
			modelo = new DefaultTableModel();
			modelo.addColumn("Id");
			modelo.addColumn("Descrição");
			modelo.addColumn("Conteudo");
			for (Curso curso : lista) {
				modelo.addRow(new String[] {
						curso.getIdcurso().toString(), 
						curso.getDescricao(),
						curso.getConteudo()
				});
			}
			table.setModel(modelo);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro" + e);
		}
	}
}
