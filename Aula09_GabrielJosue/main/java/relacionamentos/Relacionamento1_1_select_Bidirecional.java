package relacionamentos;

import javax.persistence.EntityManager;

import br.edu.ifsp.lp2.model.estudante.Curso;
import br.edu.ifsp.lp2.model.persistence.JpaUtil;

public class Relacionamento1_1_select_Bidirecional {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		
		Curso curso = manager.find(Curso.class, 4L);
		System.out.print("Curso do Alun'" + curso.getDescricao() + "' :" + 
											curso.getCargaHoraria());
		
		manager.close();
		JpaUtil.close();
	}
}
