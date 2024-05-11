package br.edu.ifsp.lp2.controller;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.edu.ifsp.lp2.model.estudante.Estudante;
import br.edu.ifsp.lp2.model.persistence.JpaUtil;

public class EstudanteController {
	EntityManager manager;
	EntityTransaction transaction;
	
	public EstudanteController() {
		manager = JpaUtil.getEntityManager();
		transaction = manager.getTransaction();
	}
	
	public void insereEstudante(String nome, Character sexo, Boolean deficiencia, Double ira) {
		transaction.begin();
		Estudante estudante = new Estudante();
		estudante.setNome(nome);
		estudante.setSexo(sexo);
		estudante.setDeficiencia(deficiencia);
		estudante.setIra(ira);
		manager.persist(estudante);
		transaction.commit();
	}
	
	@SuppressWarnings("unchecked")
    public List<Estudante> consultaEstudante(){
        Query query = manager.createQuery("SELECT l FROM Estudante l"); 
        List<Estudante> estudantes = query.getResultList();
        return estudantes;
    }
	
	public Estudante consultaEstudantePorId(Long id) {
		Estudante estudante = manager.find(Estudante.class, id);
		return estudante;
	}
	
	public void alteraEstudante(Long id, String nome, Character sexo, Boolean deficiencia, Double ira) {
		transaction.begin();
		Estudante estudante = manager.find(Estudante.class, id);
		estudante.setNome(nome);
		estudante.setSexo(sexo);
		estudante.setDeficiencia(deficiencia);
		estudante.setIra(ira);
		transaction.commit();
	}
	
	
	public void excluirEstudante(Long id) {
		transaction.begin();
		Estudante estudante = manager.find(Estudante.class, id);
		manager.remove(estudante);
		transaction.commit();
	}
	
	public void finalizaEntityManager() {
		manager.close();
		JpaUtil.close();
	}
}
