package hibernateandjpa.infra;

import hibernateandjpa.modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto>{

    public ProdutoDAO() {
        super(Produto.class);
    }
}
