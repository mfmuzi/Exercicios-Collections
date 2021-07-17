import java.util.Optional;

// Crie um optional de um determinado tipo de dado:

public class ExercicioOptional {

        public static void main (String[] args) {

//       Crie com estado vazio, estado presente e com null.
            Optional<String> optionalComValor = Optional.of("DIO - A melhor plataforma, sempre presente");

            Optional<String> optionalVazia = Optional.empty();

            Optional<String> optionalNull = Optional.ofNullable("Null");


            optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("DIO - Está null no momento"));

//       Se presente, exiba o valor no console.
            optionalComValor.ifPresentOrElse(System.out::println, () -> System.out.println("DIO - Está offline no momento"));

//        Se vazio, exiba "Optional vazio" no console.
            optionalVazia.ifPresentOrElse(System.out::println, () -> System.out.println("Optional vazio"));

//        Se presente, pegue o valor do optional e atribua em uma variável.
            if (optionalComValor.isPresent()){
                String outroValor = optionalComValor.get();
                System.out.println(outroValor);
            }

//        Se presente, transforme o valor e exiba no console.
            optionalComValor.map((mudavalor) -> mudavalor.concat(" para você!")).ifPresent(System.out::println);

//        Se presente, filtre o optional com uma determinada regra de negocio.
            optionalComValor.map((dio) -> dio.contains("DIO")).ifPresent(System.out::println);

//        Se vazio, lance uma exceção IlegalStateException.
            optionalVazia.orElseThrow(IllegalStateException:: new);
        }

}


