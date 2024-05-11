package br.edu.ifsp.lp2.model.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	private static EntityManagerFactory factory;
	static {
		factory = Persistence.createEntityManagerFactory("EstudantePu");
	}
	
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
	
	public static void close () {
		factory.close();
	}
}

