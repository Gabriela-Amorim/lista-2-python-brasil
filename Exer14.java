import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Informe a segunda nota");
        double nota2 = sc.nextDouble();
        double mediaAritmetica;

        mediaAritmetica = (nota1 + nota2) / 2;

        System.out.println("Notas: " + nota1 + ", " + nota2);
        System.out.println("Média: " + mediaAritmetica);

        String conceito;

        if (mediaAritmetica >= 9) {
            conceito = "A";
        } else if (mediaAritmetica >= 7.5) {
            conceito = "B";
        } else if (mediaAritmetica >= 6) {
            conceito = "C";
        } else if (mediaAritmetica >= 4) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        System.out.println("Conceito: " + conceito);

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("Aprovado! ");
        } else {
            System.out.println("Reprovado");
        }
        sc.close();

    }
}
