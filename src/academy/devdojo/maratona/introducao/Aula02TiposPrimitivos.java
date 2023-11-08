package academy.devdojo.maratona.introducao;

public class Aula02TiposPrimitivos {

    public static void main(String[] args) {

        //Tipos primitivos guardam em memória um valor simples
        // int, double, short, float, long, char, byte, boolean
        int age = 10;
        System.out.println("Age: " + age);
        long bigNumber = 1000000L;
        System.out.println("long: " + bigNumber);
        double salary = 2000;
        System.out.println("double: " + salary);
        char gender = 'F';
        System.out.println("Char: " + gender);
        float salaryFloat = 2500.0F;
        System.out.println("Float: " + salaryFloat);
        byte ageByte = 10;
        System.out.println("Byte: " + ageByte);
        short ageShort = 10;
        System.out.println("Short: " + ageShort);
        boolean chooseItemAsTrue = true;
        System.out.println("Boolean: " + chooseItemAsTrue);
        boolean chooseItemAsFalse = false;
        System.out.println("Boolean: " + chooseItemAsFalse);

        //Cast força a colocar um valor de uma variável em outra
        int ageCastLong = (int) 1000000000000000L;

        //String não é um primitivo e sim um reference type
        String name = "Simone";
        System.out.println("String: " + name);
    }
}
