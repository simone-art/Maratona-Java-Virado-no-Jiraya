package academy.devdojo.maratona.introducao;

public class Aula04Operadores {

    public static void main(String[] args) {

        // Operadores básicos de matemática
        int numero01 = 10;
        int numero02 = 30;

        int soma = numero01 + numero02;
        int divisao = numero02 / numero01;
        int multiplicacao = numero01 * numero02;
        int subtracao = numero02 - numero01;

        System.out.println(soma);
        System.out.println(divisao);
        System.out.println(multiplicacao);
        System.out.println(subtracao);

        // Operadores lógicos sempre retornan valores booleanos
        // Só se pode comparar com valores numéricos
        // <= => == !=

        boolean isDezMaiorDoQueVente = 10 > 20;
        boolean isDezMenorDoQueVente = 10 < 20;
        boolean isDezIgualaDez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;

        System.out.println(isDezMaiorDoQueVente);
        System.out.println(isDezMenorDoQueVente);
        System.out.println(isDezIgualaDez);
        System.out.println(isDezDiferenteDeDez);
    }
}
