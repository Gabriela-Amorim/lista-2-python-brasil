import java.util.Scanner;

public class Exer16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        double valorA = sc.nextDouble();

        System.out.println("Informe o segundo valor: ");
        double valorB = sc.nextDouble();

        System.out.println("Informe o terceiro valor: ");
        double valorC = sc.nextDouble();

        double delta = valorB * valorB - 4 * valorA * valorC;

        if (valorA == 0) {
            System.out.println("A equação nao é de segundo grau! ");
        } else if (delta < 0) {
            System.out.println("A equação não possui raizes reais! ");
        } else if (delta == 0) {
            System.out.println("A equação possui apenas uma raiz real! ");
        } else {
            double raiz1 = (-valorB + Math.sqrt(delta)) / (2 * valorA);
            double raiz2 = (-valorB - Math.sqrt(delta)) / (2 * valorA);
            System.out.println("A equação possui duas raizes reias! ");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);
        }

        sc.close();

    }

}
