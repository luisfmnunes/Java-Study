package orientacaoobjeto.aula01;

import java.util.List;
import java.util.Arrays;

public class Carro {

    Integer limite = 4;
    String pessoas = "";
    //List<String> doidos;
    Carro(){

    }

    Carro(Integer limite) {
        this.limite = limite;
    }

    void entrar(String pessoa) {
        if ( pessoas.trim().split(" ").length < limite) {
            pessoas = pessoas.concat(" " + pessoa);
            System.out.println(pessoas.trim());
        } else {
            System.out.println("Carro Lotado!");
        }
    }

    void sair(String pessoa) {
        if(pessoas == "") {
            System.out.println("Carro Vazio");
        } else if (pessoas.contains(pessoa)) {
            pessoas = pessoas.replace(" " + pessoa, "");
            System.out.println(pessoa + " saiu do Carro, restam: " + pessoas);
        } else {
            System.out.println("Pessoa Não Encontrada no Carro");
        }
    }

    void getPessoas() {
        System.out.println(Arrays.toString(pessoas.trim().split(" ")));
    }
}
