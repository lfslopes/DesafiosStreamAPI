public class Desafio15 {
    public static void main(String[] args) {
        boolean temNegativo = Lista.numeros.
                stream().
                anyMatch(num -> num < 0);
        System.out.println(temNegativo);
    }
}
