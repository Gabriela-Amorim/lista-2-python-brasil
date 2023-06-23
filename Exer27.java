import java.util.Scanner;

public class Exer27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de morangos (Em KG): ");
        double quantidadeMorango = sc.nextDouble();

        System.out.println("Informe a quantidade de maçãs (Em KG): ");
        double quantidadeMaca = sc.nextDouble();

        double precoMorango = 0;
        double precoMaca = 0;

        if (quantidadeMorango <= 5) {
            precoMorango = quantidadeMorango * 2.50;
        } else {
            precoMorango = quantidadeMorango * 2.20;
        }

        if (quantidadeMaca <= 5) {
            precoMaca = quantidadeMaca * 1.80;
        } else {
            precoMaca = quantidadeMaca * 1.50;
        }

        double quantidadeTotal = quantidadeMorango + quantidadeMaca;
        double precoTotal = precoMorango + precoMaca;
        double total = precoMorango + precoMaca;

        if (quantidadeTotal >= 8 || precoTotal >= 25) {
            total -= total * 0.10;
        }

        System.out.println("O valor total será: " + total);

        sc.close();

    }
}
