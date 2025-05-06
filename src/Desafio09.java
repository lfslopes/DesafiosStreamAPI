public class Desafio09 {
    public static void main(String[] args) {
        boolean todosSaoDiferentes = Lista.numeros.stream().distinct().count() == (long) Lista.numeros.size();
        System.out.println(todosSaoDiferentes);
    }
}
