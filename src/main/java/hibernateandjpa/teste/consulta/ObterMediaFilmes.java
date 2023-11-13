package hibernateandjpa.teste.consulta;

import hibernateandjpa.infra.DAO;
import hibernateandjpa.modelo.consulta.NotaFilme;

public class ObterMediaFilmes {
    public static void main(String[] args) {
        DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
        NotaFilme nota = dao.consultarUm("obterMediaGeral");

        System.out.println(nota.getMedia());

        dao.fecharConexao();
    }
}
