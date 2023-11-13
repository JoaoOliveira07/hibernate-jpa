package hibernateandjpa.modelo.herenca;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("AB")
public class AlunoBolsista extends Aluno{

    private double valorDaBolsa;

    public AlunoBolsista() {

    }

    public AlunoBolsista(Long matricula, String nome, double valorDaBolsa) {
        super(matricula, nome);
        this.valorDaBolsa = valorDaBolsa;
    }

    public double getValorDaBolsa() {
        return valorDaBolsa;
    }

    public void setValorDaBolsa(double valorDaBolsa) {
        this.valorDaBolsa = valorDaBolsa;
    }
}
