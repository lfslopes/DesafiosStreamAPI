import java.util.Comparator;

public class Desafio07 {
    public static void main(String[] args) {
        int segundoMaior = Lista.numeros.stream().sorted(Comparator.reverseOrder()).toList().get(1);
        System.out.println(segundoMaior);
    }
}
