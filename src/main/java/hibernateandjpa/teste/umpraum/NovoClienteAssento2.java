package hibernateandjpa.teste.umpraum;

import hibernateandjpa.infra.DAO;
import hibernateandjpa.modelo.umpraum.Assento;
import hibernateandjpa.modelo.umpraum.Cliente;

public class NovoClienteAssento2 {
    public static void main(String[] args) {
        Assento assento = new Assento("17J");
        Cliente cliente = new Cliente("Joca", assento);

        DAO<Cliente> dao = new DAO<>(Cliente.class);

        dao.incluirAtomico(cliente);
    }
}
