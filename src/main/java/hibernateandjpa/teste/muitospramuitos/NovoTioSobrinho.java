package hibernateandjpa.teste.muitospramuitos;

import hibernateandjpa.infra.DAO;
import hibernateandjpa.modelo.muitospramuitos.Sobrinho;
import hibernateandjpa.modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {
    public static void main(String[] args) {
        Tio tia1 = new Tio("Andressa");
        Tio tio2 = new Tio("Klebão");

        Sobrinho sobrinho1 = new Sobrinho("Davi");
        Sobrinho sobrinha2 = new Sobrinho("Sophia");

        tia1.getSobrinhos().add(sobrinho1);
        sobrinho1.getTios().add(tia1);

        tia1.getSobrinhos().add(sobrinha2);
        sobrinha2.getTios().add(tia1);

        tio2.getSobrinhos().add(sobrinho1);
        sobrinho1.getTios().add(tio2);

        tio2.getSobrinhos().add(sobrinha2);
        sobrinha2.getTios().add(tio2);

        DAO<Object> dao = new DAO<>();

        dao.abrirT()
                .incluir(tia1)
                .incluir(tio2)
                .incluir(sobrinho1)
                .incluir(sobrinha2)
                .fecharT();

    }
}
