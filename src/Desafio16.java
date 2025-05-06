import java.util.List;
import java.util.stream.Collectors;

public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> listaPares = Lista.numeros.stream().filter(x -> x % 2 == 0).toList();
        List<Integer> listaImpares = Lista.numeros.stream().filter(x -> x % 2 != 0).toList();

        listaPares.forEach(x -> System.out.print(x + " "));
        System.out.println();
        listaImpares.forEach(x -> System.out.print(x + " "));
    }
}
