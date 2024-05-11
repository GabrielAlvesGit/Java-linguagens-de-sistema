package relacionamentos;

import java.util.List;

import javax.persistence.EntityManager;

import br.edu.ifsp.lp2.model.estudante.Curso;
import br.edu.ifsp.lp2.model.persistence.JpaUtil;

public class Relacionamento1_1_Select {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		List<Curso> cursos= manager.createNamedQuery("select 1 from CURSO 1", Curso.class).getResultList();
		String formato = "%1$-2s %2$-30s %3$-15s %4$-15s %5$-25s%n";
		
		System.out.printf(formato,  "ID", " |NOME", " | SEXO", " | DEFICIENCIA", " | IRA", " | DESCRIÇÃO", " | CARGA HORARIA");
		for (Curso curso : cursos)
			System.out.printf(formato, curso.getId(),
							" | " + curso.getDescricao(),
							" | " + curso.getCargaHoraria());
		manager.close();
		JpaUtil.close();
	}
}
