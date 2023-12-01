package academy.devdojo.maratona.introducao;

public class Aula18OperadoresLogicos {

    // Operador lógico OR. Basta uma das condições ser verdadeiras que tudo e verdadeiro
    public static void main(String[] args) {
        double salary = 4000;
        final String message = "Você ganha salario minimo";
        final String messageSalary = "Você ganha mais que salario minimo";

            if (salary == 1000 || salary == 1300) {
                System.out.println(message);
            } else {
                System.out.println(messageSalary);
            }

        }
    }
