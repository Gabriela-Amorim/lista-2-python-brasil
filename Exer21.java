import java.util.Scanner;

public class Exer21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor do saque: (Entre 10 e 600 reais)");
        double saque = sc.nextDouble();

        if (saque < 10 || saque > 600) {
            System.out.println("Valor inválido. Informe um valor entre 10 e 600 reais. ");
        } else {
            int notas100 = (int) saque / 100;
            int notas50 = (int) (saque % 100) / 50;
            int notas10 = (int) ((saque % 100) % 50) / 10;
            int notas5 = (int) (((saque % 100) % 50) % 10) / 5;
            int notas1 = (int) (((saque % 100) % 50) % 10) % 5;

            System.out.println("Notas fornecidas:");
            System.out.println("Notas de 100 reais: " + notas100);
            System.out.println("Notas de 50 reais: " + notas50);
            System.out.println("Notas de 10 reais: " + notas10);
            System.out.println("Notas de 5 reais: " + notas5);
            System.out.println("Notas de 1 real: " + notas1);
        }

        sc.close();

    }

}
