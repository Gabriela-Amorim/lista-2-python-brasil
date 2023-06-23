import java.util.Scanner;

public class Exer24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.println("Informe o segundo número: ");
        double numero2 = sc.nextDouble();

        System.out.println("Escolha a operação: \n1 = Soma \n2 = subtração \n3 = multiplicação \n4 = divisão");
        int opcao = sc.nextInt();

        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = numero1 + numero2;
                break;

            case 2:
                resultado = numero1 - numero2;
                break;

            case 3:
                resultado = numero1 * numero2;
                break;

            case 4:
                resultado = numero1 / numero2;
                break;

            default:
                System.out.println("Dados incorretos.");
        }

        String parImpar = null;

        if (resultado % 2 == 0) {
            parImpar = "Par! ";
        } else {
            parImpar = "Ímpar! ";
        }

        String negativoPositivo = null;

        if (resultado < 0) {
            negativoPositivo = "Negativo! ";
        } else {
            negativoPositivo = "Positivo! ";
        }

        String inteiroDecimal = null;

        if (resultado % 1 == 0) {
            inteiroDecimal = "Inteiro! ";
        } else {
            inteiroDecimal = "Decimal! ";
        }

        System.out.printf("Resultado: %.2f\n", resultado);
        System.out.println("O número é: ");
        System.out.println(parImpar);
        System.out.println(negativoPositivo);
        System.out.println(inteiroDecimal);

        sc.close();

    }
}
