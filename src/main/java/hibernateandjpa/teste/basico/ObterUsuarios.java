package hibernateandjpa.teste.basico;

import hibernateandjpa.modelo.basico.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class ObterUsuarios {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa"); //Criar o entityManager
        EntityManager em = emf.createEntityManager(); //Representa um conexão/que nos ajudar a persistir os dados no banco de dados

        String jpql = "select u from Usuario u";
        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
        query.setMaxResults(5);

        List<Usuario> usuarios = query.getResultList();

        for (Usuario usuario : usuarios) {
            System.out.println("ID: " + usuario.getId() + "\nNome: " + usuario.getNome() + "\nE-mail: " + usuario.getEmail() +"\n");
        }

        em.close();
        emf.close();
    }
}
