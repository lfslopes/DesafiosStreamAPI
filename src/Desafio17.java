import java.util.function.Predicate;

public class Desafio17 {
    public static void main(String[] args) {
        Predicate<Integer> primo = number -> {
            for (int i = 2; i < number; i++) {
                if (number % i == 0)
                    return false;
            }
            return true;
        };

        Lista.numeros.
                stream().
                filter(primo).
                forEach(x -> System.out.print(x + " "));
    }
}
