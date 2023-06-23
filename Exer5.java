import java.util.Scanner;

public class Exer5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Informe o segundo número: ");
        double numero2 = sc.nextDouble();

        double media = (numero1 + numero2) / 2;

        if (media == 10) {
            System.out.println("Média: " + media + "\nAluno aprovado com distinção! ");
        } else if (media >= 7) {
            System.out.println("Média: " + media + "\nAluno aprovado! ");
        } else
            System.out.println("Média: " + media + "\nAluno reprovado! ");

        sc.close();
    }

}
