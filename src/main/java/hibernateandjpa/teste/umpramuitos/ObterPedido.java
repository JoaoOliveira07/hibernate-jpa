package hibernateandjpa.teste.umpramuitos;

import hibernateandjpa.infra.DAO;
import hibernateandjpa.modelo.umpramuitos.ItemPedido;
import hibernateandjpa.modelo.umpramuitos.Pedido;

public class ObterPedido {
    public static void main(String[] args) {
        DAO<Pedido> dao = new DAO<>(Pedido.class);

        Pedido pedido = dao.obterPorID(1L);

        for (ItemPedido itemPedido: pedido.getItens()){
            System.out.println(itemPedido.getQuantidade());
            System.out.println(itemPedido.getProduto().getNome());

        }

        dao.fecharConexao();
    }
}
