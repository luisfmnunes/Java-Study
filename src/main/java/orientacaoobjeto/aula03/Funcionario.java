package orientacaoobjeto.aula03;

//Vamos pensar em um cenário onde temos Funcionários. Esses funcionários podem ser: Gerente, Supervisor e Atendente.
//Cada tipo de funcionário desses tem políticas diferentes de impostos:
/*
    - Gerente Paga 0,1% do Salário
    - Supervisor Paga 0.05% do Salário
    - Atendente paga 0,01% do Salário.
 */

//Monte um modelo que atenda esse cenário utilizando herança, encapsulamento e polimorfismo.

public abstract class Funcionario {

    private Integer salario;

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public abstract Double getImposto();

    Funcionario(Integer salario){
        this.salario = salario;
    }
    
}
