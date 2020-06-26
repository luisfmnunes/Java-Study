package orientacaoobjeto.aula03;

public class Gerente extends Funcionario {

    Gerente(Integer salario) {
        super(salario);
    }

    @Override
    public Double getImposto() {
        return 0.001*getSalario();
    }
}
