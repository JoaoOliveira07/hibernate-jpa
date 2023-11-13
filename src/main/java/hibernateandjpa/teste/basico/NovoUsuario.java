package hibernateandjpa.teste.basico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import hibernateandjpa.modelo.basico.Usuario;

public class NovoUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa"); //Criar o entityManager
        EntityManager em = emf.createEntityManager(); //Representa um conexão/que nos ajudar a persistir os dados no banco de dados

        Usuario novoUsuario = new Usuario("João","joao@lanche.com.br");

        em.getTransaction().begin();
        em.persist(novoUsuario);
        em.getTransaction().commit();

        System.out.println("O ID gerado foi: " + novoUsuario.getId());

        em.close();
        emf.close();
    }
}
