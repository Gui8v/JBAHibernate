package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null, "João Paulo", "jao@gmail.com");
		Pessoa p2 = new Pessoa(null, "Maria Paula", "maria@gmail.com");
		Pessoa p3 = new Pessoa(null, "Lajota rojão", "Lajota@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		//Inserindo no banco pessoas
		//em.persist(p1);
		//em.persist(p2);
		//em.persist(p3);
		
		
		
		//Buscando pessoa
		Pessoa p = em.find(Pessoa.class, 3);
		
		em.getTransaction().commit();
		
		System.out.println(p + "\nPronto!");
	}

}
