import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        double valor = sc.nextDouble();

        if (valor > 0) {
            System.out.println("O valor é positivo. ");
        } else {
            System.out.println("O valor é negativo. ");
        }

        sc.close();

    }

}
