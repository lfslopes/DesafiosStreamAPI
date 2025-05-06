public class Desafio03 {
    public static void main(String[] args) {
        boolean positivo = Lista.numeros.
                stream().
                allMatch(num -> num > 0);
        System.out.println(positivo);
    }
}
