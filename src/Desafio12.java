public class Desafio12 {
    public static void main(String[] args) {
        int produto = Lista.numeros.stream().reduce(1, (x, y) -> x * y);
        System.out.println(produto);
    }
}
