package orientacaoobjeto.aula03;

public class Programa {

    public static void main(String[] args){
        Funcionario gerente = new Gerente(5300);
        Funcionario atendente = new Atendente(1500);
        Funcionario supervisor = new Supervisor(3000);

        System.out.println("Os funcionários pagam os seguintes impostos:");
        System.out.printf("- Gerente: %.2f R$. \n", gerente.getImposto());
        System.out.printf("- Supervisor: %.2f R$. \n", supervisor.getImposto());
        System.out.printf("- Atendente: %.2f R$. \n", atendente.getImposto());
    }
}
