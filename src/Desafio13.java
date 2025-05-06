public class Desafio13 {
    public static void main(String[] args) {
        Lista.numeros.
                stream().
                filter(num -> num > 5 && num <= 10).
                forEach(num -> System.out.print(num + " "));
    }
}
