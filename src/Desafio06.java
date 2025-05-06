public class Desafio06 {
    public static void main(String[] args) {
        boolean maior10 = Lista.numeros.
                stream().
                anyMatch(num -> num > 10);
        System.out.println(maior10);
    }
}
