import java.util.Scanner;

public class Exer17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o ano: ");
        double ano = sc.nextDouble();

        boolean anoBissexto = false;

        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            anoBissexto = true;
        } else {
            anoBissexto = false;
        }

        if (anoBissexto == true) {
            System.out.println("Ano BISSEXTO");
        } else {
            System.out.println("Ano não BISSEXTO");
        }
        sc.close();

    }
}
