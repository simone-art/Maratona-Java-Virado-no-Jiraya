package academy.devdojo.maratona.introducao;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDateTime;
import java.util.Date;

public class Aula03TiposPrimitivosExercicios {

    //Crie as variáveios para os seguintes campos descritos entre<> e imprima a seguinte mensagem:
    // Eu <nome> morando no endereco <endereco>, confirmo que recebi o salario de <salario>
    // na data <data>

    public static void main(String[] args) {
        String nome = "Simone";
        String endereco = "Alphaville, número 77";
        double salario = 2500;
        String dataRecebimentoSalario = "11-08-2023";

        System.out.println("Eu " + nome +
                " morando no endereco: " + endereco + ", " +
                "confirmo que recebi o salario de: " + salario + "," + " na data " + dataRecebimentoSalario + ".");

        String name = "Simone";
        String address = "Alphaville, número 77";
        double salary = 2500;
        String dateGetSalary = "11-08-2023";

        System.out.println("Me " + name +
                " living in: " + address + ", " +
                "confirm that I received the salary: " + salary + "," + " in " + dateGetSalary + ".");

        String nombre = "Simone";
        String direccion = "Alphaville, número 77";
        double salarioEspanol = 2500;
        String fechaRecibidoSalario = "11-08-2023";
        String relatorio = "Yo " + nombre +
                " dirección : " + direccion + ", " +
                "confirmo que recebi el salario de: " + salarioEspanol + "," + " en la fecha: " + fechaRecibidoSalario + ".";

        System.out.println(relatorio);
    }






}
