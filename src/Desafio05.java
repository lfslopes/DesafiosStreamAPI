public class Desafio05 {
    public static void main(String[] args) {
        long numerosMaiores5 = Lista.numeros.stream().filter(num -> num > 5).count();
        double mediaMaior5 = Lista.numeros.stream().
                filter(num -> num > 5).
                mapToDouble(num -> (double) num / numerosMaiores5).sum();
        System.out.println(mediaMaior5);
    }
}
