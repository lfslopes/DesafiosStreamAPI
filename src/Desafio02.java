public class Desafio02 {
    public static void main(String[] args) {
        int soma = Lista.numeros.
                stream().
                filter(num -> num % 2 == 0).
                mapToInt(Integer::intValue).
                sum();
        System.out.println(soma);
    }
}
