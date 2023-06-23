import java.util.Scanner;

public class Exer20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Informe a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Média: %.1f ", media);

        if (media == 10) {
            System.out.println("\nAprovado com distinção");
        } else if (media >= 7) {
            System.out.println("\nAprovado");
        } else {
            System.out.println("\nReprovado");
        }

        sc.close();

    }

}
