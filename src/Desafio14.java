import java.util.Comparator;

public class Desafio14 {
    public static void main(String[] args) {
        int primo = Lista.numeros.
                    stream().
                    filter(num -> {
                        boolean ePrimo = true;
                        for (int i = 2; i < num; i++) {
                            if (num % i == 0) {
                                ePrimo = false;
                            }
                        }
                        return ePrimo;
                    }).
                    sorted(Comparator.reverseOrder()).toList().
                    getFirst();

        System.out.println(primo);
    }
}
