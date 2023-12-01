package academy.devdojo.maratona.introducao;

public class Aula190peradoresDeAtribuicao {

    // Atribuem valor a uma variável. Eles economizam código

    public static void main(String[] args) {
        double bonus = 1000;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;

        System.out.println(bonus);

        int contador = 0;
        contador += 1;
        contador++;// Primeiro se executa o valor e depois incrementa o mesmo
        contador--;
        ++contador;
        --contador; // primeiro ele faz a operação e depois executa o valor da variável
        System.out.println(contador);
    }

}
