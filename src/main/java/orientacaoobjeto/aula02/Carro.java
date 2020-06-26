package orientacaoobjeto.aula02;

import java.util.Arrays;

public class Carro {

    Integer limite = 4;
    String pessoas = "";
    String marca = "";
    String modelo = "";
    Integer ano = 1900;
    String variante = "";

    //List<String> doidos;

    Carro(){

    }

    Carro (Integer limite) {
        this.limite = limite;
    }

    Carro (String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
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
