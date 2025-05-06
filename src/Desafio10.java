public class Desafio10 {
    public static void main(String[] args) {
        Lista.numeros.
                stream().
                filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0)).
                forEach(System.out::println);
    }
}
