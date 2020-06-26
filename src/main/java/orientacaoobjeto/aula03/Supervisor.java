package orientacaoobjeto.aula03;

public class Supervisor extends Funcionario {

    Supervisor(Integer salario) {
        super(salario);
    }

    @Override
    public Double getImposto() {
        return 0.0005*getSalario();
    }
}
