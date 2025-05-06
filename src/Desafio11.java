public class Desafio11 {
    public static void main(String[] args) {
        int somaQuadrado = Lista.numeros.
                stream().
                mapToInt(x -> x * x).
                sum();
        System.out.println(somaQuadrado);
    }
}
