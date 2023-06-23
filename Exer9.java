import java.util.Scanner;

public class Exer9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.println("Informe o segundo número: ");
        double numero2 = sc.nextDouble();

        System.out.println("Informe o terceiro número: ");
        double numero3 = sc.nextDouble();

        if (numero1 >= numero2 && numero1 >= numero3) {
            if (numero2 >= numero3) {
                System.out.println("Ordem decrescente: " + numero1 + " " + numero2 + " " + numero3);
            } else {
                System.out.println("Ordem decrescente: " + numero1 + " " + numero3 + " " + numero2);
            }
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            if (numero1 >= numero3) {
                System.out.println("Ordem decrescente: " + numero2 + " " + numero1 + " " + numero3);
            } else {
                System.out.println("Ordem decrescente: " + numero2 + " " + numero3 + " " + numero1);
            }
        } else {
            if (numero1 >= numero2) {
                System.out.println("Ordem decrescente: " + numero3 + " " + numero1 + " " + numero2);
            } else {
                System.out.println("Ordem decrescente: " + numero3 + " " + numero2 + " " + numero1);
            }
        }

        sc.close();
    }

}
