package one.digitalinnovation.optionals;

import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Predicate;

public class Exercicio {

    public static void main(String[] args) {

        //Crie com estado vazio, estado presete e com null
        Optional<String> estadoPresente = Optional.of("valor");
        Optional<String> estadoVazio = Optional.empty();
        Optional<String> estadoNull = Optional.ofNullable(null);

        //Se presente, exiba o valor no console
            estadoPresente.ifPresent(System.out::println);
            estadoVazio.ifPresent(System.out::println);
            estadoNull.ifPresent(System.out::println);

        //Se vazio, lance uma exceção IllegalStateException
            estadoPresente.orElseThrow(IllegalStateException::new);
            //estadoVazio.orElseThrow(IllegalStateException::new);
            //estadoNull.orElseThrow(IllegalStateException::new);

        //Se vazio exiba "Optional Vazio" no console
            estadoPresente.ifPresentOrElse(System.out::println, () -> System.out.println("Optional Vazio"));
            estadoVazio.ifPresentOrElse(System.out::println, () -> System.out.println("Optional Vazio"));
            estadoNull.ifPresentOrElse(System.out::println, () -> System.out.println("Optional Vazio"));

        //Se presente, transforme o valor e exiba no console
        if (estadoPresente.isPresent()) {
            estadoPresente.map((valor) -> valor.concat("_OK_")).ifPresent(System.out::println);
        } else {
            estadoPresente.orElseThrow(IllegalStateException::new);
        }

        //Se presente, pegue o valor do optional e atribua em uma variável

        if (estadoPresente.isPresent()) {
            String valor = estadoPresente.get();
            System.out.println("Variável obtida: " + valor);
        }

        //Se presente, filtre o optional com uma determinada regra de negócio

        if(estadoPresente.isPresent()) {
            System.out.println(estadoPresente.filter(valor -> valor.length() > 10 ).isPresent());
        }
    }
}
