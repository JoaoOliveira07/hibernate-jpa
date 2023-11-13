package hibernateandjpa.teste.muitospramuitos;

import hibernateandjpa.infra.DAO;
import hibernateandjpa.modelo.muitospramuitos.Ator;
import hibernateandjpa.modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {
    public static void main(String[] args) {
        Filme filmeA = new Filme("Star Wars", 8.1);
        Filme filmeB = new Filme("O Fugitivo", 8.9);


        Ator atorA = new Ator("Harrison Ford");
        Ator atrizB = new Ator("Carrie Fisher");

        filmeA.adicionarAtor(atorA);
        filmeA.adicionarAtor(atrizB);

        filmeB.adicionarAtor(atorA);

        DAO<Filme> dao = new DAO<>();
        dao.incluirAtomico(filmeB);
    }
}
