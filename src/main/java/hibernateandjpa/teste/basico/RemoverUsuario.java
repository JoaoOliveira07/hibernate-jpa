package hibernateandjpa.teste.basico;

import hibernateandjpa.modelo.basico.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class RemoverUsuario {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence
                .createEntityManagerFactory("exercicios-jpa"); //Criar o entityManager
        EntityManager em = emf.createEntityManager(); //Representa um conexão/que nos ajudar a persistir os dados no banco de dados

        Usuario usuario = em.find(Usuario.class, 7L);

        if (usuario != null){
            em.getTransaction().begin();
            em.remove(usuario);
            em.getTransaction().commit();
        }

        em.close();
        emf.close();
    }
}
