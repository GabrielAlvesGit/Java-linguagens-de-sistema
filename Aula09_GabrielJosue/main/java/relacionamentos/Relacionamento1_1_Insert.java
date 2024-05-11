package relacionamentos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.edu.ifsp.lp2.model.estudante.Curso;
import br.edu.ifsp.lp2.model.persistence.JpaUtil;

public class Relacionamento1_1_Insert {
	public static void main(String[] args) {
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		
		Curso curso = new Curso();
		curso.setDescricao("Curso voltado para ADS");
		curso.setCargaHoraria("10h");
		manager.persist(curso);
		
		Curso curso1 = new Curso();
		curso.setDescricao("Curso voltado para ODS");
		curso.setCargaHoraria("10h");
		manager.persist(curso1);
		
		Curso curso2 = new Curso();
		curso.setDescricao("Curso voltado para ADS2");
		curso.setCargaHoraria("10h");
		manager.persist(curso2);
		
		tx.commit();
		manager.close();
		JpaUtil.close();
	}
}
