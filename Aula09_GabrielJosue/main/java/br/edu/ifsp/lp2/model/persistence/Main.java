package br.edu.ifsp.lp2.model.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManager manager = JpaUtil.getEntityManager(); 
        manager.close();
    }
}