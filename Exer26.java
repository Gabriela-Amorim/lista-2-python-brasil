import java.util.Scanner;

public class Exer26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número de litros: ");
        double litros = sc.nextDouble();

        System.out.println("Informe o tipo de combustível (A - Álcool e G - Gasolina): ");
        String combustivel = sc.next();

        double valor = 0.0;

        if (combustivel.equalsIgnoreCase("A")) {
            valor = litros * 1.90;
            if (litros <= 20) {
                valor -= valor * 0.03;
            } else {
                valor -= valor * 0.05;
            }
        } else if (combustivel.equalsIgnoreCase("G")) {
            valor = litros * 2.50;
            if (litros <= 20) {
                valor -= valor * 0.04;
            } else {
                valor -= valor * 0.06;
            }

        } else {
            System.out.println("Digito ínvalido.");
        }

        if (combustivel.equalsIgnoreCase("A") || combustivel.equalsIgnoreCase("G")) {
            System.out.println("O valor pago será: \n" + valor);
        }

        sc.close();
    }

}
