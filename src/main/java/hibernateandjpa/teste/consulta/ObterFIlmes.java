package hibernateandjpa.teste.consulta;

import hibernateandjpa.infra.DAO;
import hibernateandjpa.modelo.muitospramuitos.Ator;
import hibernateandjpa.modelo.muitospramuitos.Filme;

import java.util.List;

public class ObterFIlmes {
    public static void main(String[] args) {
        DAO<Filme> dao = new DAO<>(Filme.class);
        List<Filme> filmes = dao.consultar("filmesNotaMaiorQue", "nota", 8.0);

        for (Filme filme: filmes) {
            System.out.println(filme.getNome() + " => " +filme.getNota());

            for (Ator ator : filme.getAtores()){
                System.out.println(ator.getNome());
            }
        }
    }
}
