public class Desafio19 {
    //Mais uma vez achei a questão meio ambígua
    //Creio que seja a soma dos elementos da lista que são múltiplos de 3 e múltiplos de 5 simultaneamente
    //Foi o que eu implementei, se for a soma dos elementos múltiplos de 3 ou múltiplos de 5, aí é outro caso
    //Nesse caso, Só mudar de && para ||
    public static void main(String[] args) {
        int somaMult3ou5 = Lista.numeros.
                stream().
                filter(x -> x % 3 == 0 && x % 5 == 0).
                mapToInt(Integer::intValue).
                sum();
        System.out.println(somaMult3ou5);
    }
}
