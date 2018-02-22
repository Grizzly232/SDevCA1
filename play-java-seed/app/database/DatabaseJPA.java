package database;

import javax.persistence.*;

public class DatabaseJPA {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
	EntityManager em = emf.createEntityManager();

	public DatabaseJPA() {

    }
}
