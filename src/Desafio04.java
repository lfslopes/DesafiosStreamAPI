public class Desafio04 {
    public static void main(String[] args) {
        Lista.numeros = Lista.numeros.
                stream().
                filter(num -> num % 2 == 0).
                toList();
        Lista.numeros.forEach(num -> System.out.println(num + " "));
    }
}
