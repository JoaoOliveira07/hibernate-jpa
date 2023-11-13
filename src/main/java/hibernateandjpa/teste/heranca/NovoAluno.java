package hibernateandjpa.teste.heranca;

import hibernateandjpa.infra.DAO;
import hibernateandjpa.modelo.herenca.Aluno;
import hibernateandjpa.modelo.herenca.AlunoBolsista;

public class NovoAluno {
    public static void main(String[] args) {

        DAO<Aluno> alunoDAO = new DAO<>();

        Aluno aluno = new Aluno(123L, "João");
        AlunoBolsista alunoBolsista = new AlunoBolsista(345L, "Maria", 1000);

        alunoDAO.incluirAtomico(aluno);
        alunoDAO.incluirAtomico(alunoBolsista);

        alunoDAO.fecharConexao();
     }
}
