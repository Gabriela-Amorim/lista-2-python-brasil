import java.util.Scanner;

public class Exer1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Informe o segundo número: ");
        double numero2 = sc.nextDouble();

        if (numero1 > numero2) {
            System.out.println(numero1 + " é maior.");
        } else {
            System.out.println(numero2 + " é maior.");
        }

        sc.close();
    }
}