package br.edu.senac.relatorios;

import java.io.FileOutputStream;
import java.util.List;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import br.edu.senac.classes.Curso;
import br.edu.senac.dao.CursoDao;

public class RelatorioCursos {

	public static void main(String[] args) throws Exception {
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new 
					FileOutputStream("C:\\relatorios\\rel_cursos.pdf"));
			document.open();
			document.add(new Paragraph("Sistema de Controle Academico"));
			document.add(new Paragraph("Relatorio de Cursos"));
			document.add(new Paragraph(" "));
			document.add(new Paragraph(" "));
			
			PdfPTable table = new PdfPTable(3);
			table.addCell("ID");
			table.addCell("Descricao");
			table.addCell("Conteudo");			
			
			CursoDao cursoDao = new CursoDao();
			List<Curso> lista = cursoDao.buscarTodos();
			//gerando o restante da tabela
			for (Curso curso : lista) {
				table.addCell(curso.getIdcurso().toString());
				table.addCell(curso.getDescricao());
				table.addCell(curso.getConteudo());
			}
			document.add(table);
			
		} catch (Exception e) {
			throw new Exception(e);
		} finally {
			document.close();
		}

	}

}
