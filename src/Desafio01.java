import java.util.Comparator;

public class Desafio01 {
    public static void main(String[] args) {
        Lista.numeros.
                stream().
                sorted(Integer::compareTo).
                forEach(n -> System.out.print(n + " "));
    }
}
