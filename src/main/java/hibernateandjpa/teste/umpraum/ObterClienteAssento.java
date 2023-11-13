package hibernateandjpa.teste.umpraum;

import hibernateandjpa.infra.DAO;
import hibernateandjpa.modelo.umpraum.Assento;
import hibernateandjpa.modelo.umpraum.Cliente;

public class ObterClienteAssento {
    public static void main(String[] args) {

        DAO<Cliente> daoCliente = new DAO<>(Cliente.class);

        Cliente cliente = daoCliente.obterPorID(2L);
        System.out.println(cliente.getAssento().getNome());

        daoCliente.fecharT();

        DAO<Assento> daoAssento = new DAO<>(Assento.class);

        Assento assento = daoAssento.obterPorID(3L);
        System.out.println(assento.getCliente().getNome());

        daoCliente.fecharT();

    }
}
