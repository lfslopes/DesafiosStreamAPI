import java.util.function.ToIntFunction;

//Esse desafio ficou meio ambíguo, então o implementei de acordo com a interpretação mais certa do desafio que é
//pegar cada dígito isolado dos números na lista e somá-los.
public class Desafio08 {
    public static void main(String[] args) {
        ToIntFunction<Integer> separarDigitos = new ToIntFunction<Integer>() {
            @Override
            public int applyAsInt(Integer value) {
                if (value < 10)
                    return value;
                String tamanhoNum = value.toString();
                int soma = 0;
                for (int i = 0; i < tamanhoNum.length(); i++){
                    soma += Integer.parseInt(String.valueOf(tamanhoNum.charAt(i)));
                }
                return soma;
            }
        };
        int soma = Lista.numeros.stream()
                .mapToInt(separarDigitos).sum();
        System.out.println(soma);
    }
}
