public class Desafio18 {
    public static void main(String[] args) {
        int first = Lista.numeros.getFirst();
        boolean tudoIgual = Lista.numeros.
                stream().allMatch(num -> num == first);

        System.out.println(tudoIgual);
    }
}
