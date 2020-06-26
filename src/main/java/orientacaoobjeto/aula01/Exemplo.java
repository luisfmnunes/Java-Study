package orientacaoobjeto.aula01;

public class Exemplo {

    public static void main(String[] args){
        Carro onix = new Carro();

        onix.sair("Zeca");

        onix.entrar("Joao");
        onix.entrar("Maria");
        onix.sair("Maria");

        onix.entrar("Pedro");
        onix.entrar("José");
        onix.entrar("Jaqueline");
        onix.entrar("Otario");

        onix.getPessoas();

        onix.sair("Predo");
    }
}
