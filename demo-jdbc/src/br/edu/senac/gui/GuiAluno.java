package br.edu.senac.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import java.util.List;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import br.edu.senac.classes.Aluno;
import br.edu.senac.classes.Curso;
import br.edu.senac.dao.AlunoDao;
import br.edu.senac.dao.CursoDao;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GuiAluno extends JFrame {

	private JPanel contentPane;
	private JTextField txfId;
	private JTextField txfNome;
	private JTextField txfMatricula;
	private JTextField txfCpf;
	private JTable table;
	private JComboBox cmbCurso;
	
	private Aluno aluno;
	private Curso curso;
	private AlunoDao alunoDao;
	private CursoDao cursoDao;
	private List<Aluno> listaAlunos;
	private List<Curso> listaCursos;
	private DefaultTableModel modeloTabela;
	private DefaultComboBoxModel modeloCombo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiAluno frame = new GuiAluno();
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
	public GuiAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 10, 438, 164);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Id");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setForeground(new Color(0, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(20, 7, 45, 13);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(20, 36, 45, 13);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Matricula");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(-3, 66, 68, 13);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("CPF");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(20, 100, 45, 13);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("Curso");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setForeground(new Color(0, 0, 128));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(20, 135, 45, 13);
		panel.add(lblNewLabel_4);

		txfId = new JTextField();
		txfId.setEditable(false);
		txfId.setBounds(75, 5, 45, 19);
		panel.add(txfId);
		txfId.setColumns(10);

		txfNome = new JTextField();
		txfNome.setBounds(75, 34, 353, 19);
		panel.add(txfNome);
		txfNome.setColumns(10);

		txfMatricula = new JTextField();
		txfMatricula.setBounds(75, 64, 99, 19);
		panel.add(txfMatricula);
		txfMatricula.setColumns(10);

		txfCpf = new JTextField();
		txfCpf.setBounds(75, 98, 96, 19);
		panel.add(txfCpf);
		txfCpf.setColumns(10);

		cmbCurso = new JComboBox();
		cmbCurso.setBounds(75, 132, 171, 21);
		panel.add(cmbCurso);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 184, 438, 37);
		contentPane.add(panel_1);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Integer resp = JOptionPane.showConfirmDialog(null, "Deseja excluir?");
					if (resp == 0) {
						aluno = new Aluno();
						alunoDao = new AlunoDao();
						aluno.setIdaluno(Integer.parseInt(txfId.getText()));
						alunoDao.excluir(aluno);
						limparCampos();
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
		panel_1.add(btnExcluir);

		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					aluno = new Aluno();
					aluno.setIdaluno(Integer.parseInt(txfId.getText())); // aqui
					aluno.setNome(txfNome.getText());
					aluno.setCpf(txfCpf.getText());
					aluno.setMatricula(txfMatricula.getText());
					int itemSelecionado = cmbCurso.getSelectedIndex();
					curso = listaCursos.get(itemSelecionado);
					aluno.setCurso(curso);
					alunoDao = new AlunoDao();
					alunoDao.alterar(aluno); // aqui
					limparCampos();
					popularTabela();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});
		btnAlterar.setIcon(new ImageIcon("C:\\Users\\joao46152477\\projetos\\demo-jdbc\\icones\\icon_edit.png"));
		btnAlterar.setForeground(new Color(0, 0, 128));
		btnAlterar.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(btnAlterar);

		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					aluno = new Aluno();
					aluno.setNome(txfNome.getText());
					aluno.setCpf(txfCpf.getText());
					aluno.setMatricula(txfMatricula.getText());
					int itemSelecionado = cmbCurso.getSelectedIndex();
					curso = listaCursos.get(itemSelecionado);
					aluno.setCurso(curso);
					alunoDao = new AlunoDao();
					alunoDao.incluir(aluno);
					limparCampos();
					popularTabela();
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});
		btnIncluir.setIcon(new ImageIcon("C:\\Users\\joao46152477\\projetos\\demo-jdbc\\icones\\icon_save.png"));
		btnIncluir.setForeground(new Color(0, 0, 128));
		btnIncluir.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_1.add(btnIncluir);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 231, 438, 210);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				Integer itemSelecionado = table.getSelectionModel().getLeadSelectionIndex();
				aluno = listaAlunos.get(itemSelecionado);
				txfId.setText(aluno.getIdaluno().toString());
				txfNome.setText(aluno.getNome());
				txfMatricula.setText(aluno.getMatricula());
				txfCpf.setText(aluno.getCpf());
				cmbCurso.setSelectedItem(aluno.getCurso().getDescricao());
			}
		});
		scrollPane.setViewportView(table);
		popularCombo();
		popularTabela();
	}

	public void popularCombo() {
		try {
			cursoDao = new CursoDao();
			listaCursos = cursoDao.buscarTodos(); // obtendo a lista de cursos
			modeloCombo = new DefaultComboBoxModel();
			for (Curso curso : listaCursos) {
				modeloCombo.addElement(curso.getDescricao());
			}
			cmbCurso.setModel(modeloCombo);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao criar combo" + e);
		}
	}

	public void limparCampos() {
		txfId.setText(null);
		txfNome.setText(null);
		txfMatricula.setText(null);
		txfCpf.setText(null);
		cmbCurso.setSelectedIndex(0); // faz exibir o primeiro item do combo
	}

	public void popularTabela() {
		try {
			alunoDao = new AlunoDao();
			listaAlunos = alunoDao.buscarTodos();
			modeloTabela = new DefaultTableModel();
			modeloTabela.addColumn("Id");
			modeloTabela.addColumn("Nome");
			modeloTabela.addColumn("Matricula");
			modeloTabela.addColumn("CPF");
			modeloTabela.addColumn("Curso");
			for (Aluno aluno : listaAlunos) {
				modeloTabela.addRow(new String[] { aluno.getIdaluno().toString(), aluno.getNome(), aluno.getMatricula(),
						aluno.getCpf(), aluno.getCurso().getDescricao() });
			}
			table.setModel(modeloTabela);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro" + e);
		}
	}

}
