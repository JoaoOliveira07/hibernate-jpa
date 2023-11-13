package hibernateandjpa.teste.basico;

import hibernateandjpa.infra.DAO;
import hibernateandjpa.modelo.basico.Produto;

public class NovoProduto {
    public static void main(String[] args) {
        DAO<Produto> dao = new DAO<>(Produto.class);

        Produto produto = new Produto("Notebook",2987.78);

        dao.incluirAtomico(produto).fecharConexao();

        System.out.println("ID do produto: "+ produto.getId());
    }
}
