package application;

import model.entities.Pessoa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
    public static void main(String[] args) {
        //instanciando o EntityManeger
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("implements-jpa");
        EntityManager entityManager = emf.createEntityManager();

        //"delete"
        /*
        Pessoa pessoa = entityManager.find(Pessoa.class, 1);
        System.out.println(pessoa);

        entityManager.getTransaction().begin();
        {
            entityManager.remove(pessoa);
        }
        entityManager.getTransaction().commit();
        */

        //"get"
        /* Pessoa pessoa = entityManager.find(Pessoa.class, 1);

        System.out.println(pessoa);
        */

        //"set"
        /*
        Pessoa p1 = new Pessoa(null, "Josieide Nelson");

        entityManager.getTransaction().begin(); //iniciando uma transação
        {
            entityManager.persist(p1);
        }
        entityManager.getTransaction().commit(); //commitando a transação

        //fechando os objetos
        */

        entityManager.close();
        emf.close();
    }
}
