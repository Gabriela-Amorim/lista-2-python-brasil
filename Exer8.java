import java.util.Scanner;

public class Exer8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o preço do primeiro produto: ");
        double produto1 = sc.nextDouble();

        System.out.print("Informe o preço do segundo produto: ");
        double produto2 = sc.nextDouble();

        System.out.print("Informe o preço do terceiro produto: ");
        double produto3 = sc.nextDouble();

        if (produto1 < produto2 && produto1 < produto3) {
            System.out.println("Você deve comprar o primeiro produto.");
        } else if (produto2 < produto1 && produto2 < produto3) {
            System.out.println("Você deve comprar o segundo produto.");
        } else
            System.out.println("Você deve comprar o terceiro produto.");

        sc.close();

    }

}
