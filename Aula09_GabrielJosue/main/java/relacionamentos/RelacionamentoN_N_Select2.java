package relacionamentos;

import javax.persistence.EntityManager;

import br.edu.ifsp.lp2.model.estudante.Curso;
import br.edu.ifsp.lp2.model.persistence.JpaUtil;

public class RelacionamentoN_N_Select2 {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		
		Curso curso = manager.find(Curso.class, 2L);
		System.out.print("Curso do Alun'" + curso.getDescricao() + "' :" + 
											curso.getCargaHoraria());
		for (Curso curso : curso.getCurso())
			System.out.print(curso.getDescricao());
		
		manager.close();
		JpaUtil.close();
	}
}
