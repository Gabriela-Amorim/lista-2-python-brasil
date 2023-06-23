import java.util.Scanner;

public class Exer6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.err.print("Informe o segundo número: ");
        double numero2 = sc.nextDouble();

        System.out.print("Informe o terceiro número: ");
        double numero3 = sc.nextDouble();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O número " + numero1 + " é maior! ");
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O número " + numero2 + " é maior! ");
        } else
            System.out.println("O número " + numero3 + " é maior! ");

        sc.close();
    }

}
