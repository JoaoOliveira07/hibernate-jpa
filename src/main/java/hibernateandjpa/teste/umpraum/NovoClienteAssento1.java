package hibernateandjpa.teste.umpraum;

import hibernateandjpa.infra.DAO;
import hibernateandjpa.modelo.umpraum.Assento;
import hibernateandjpa.modelo.umpraum.Cliente;

public class NovoClienteAssento1 {
    public static void main(String[] args) {
        Assento assento = new Assento("17J");
        Cliente cliente = new Cliente("Cleber", assento);

        DAO<Object> dao = new DAO<>();

        dao.abrirT().incluir(cliente).incluir(assento).fecharT().fecharConexao();
    }
}
