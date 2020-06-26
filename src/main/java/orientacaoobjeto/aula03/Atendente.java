package orientacaoobjeto.aula03;

public class Atendente extends Funcionario{

    Atendente(Integer salario) {
        super(salario);
    }

    @Override
    public Double getImposto() {
        return 0.0001*getSalario();
    }
}
