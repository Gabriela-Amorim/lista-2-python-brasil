import java.util.Scanner;

public class Exer15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro lado do triângulo: ");
        double lado1 = sc.nextDouble();

        System.out.println("Informe o segundo lado do triângulo: ");
        double lado2 = sc.nextDouble();

        System.out.println("Informe o terceiro lado do triângulo: ");
        double lado3 = sc.nextDouble();

        boolean triangulo = (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);

        if (triangulo)
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("É um triângulo equilátero! ");
            } else if (lado1 == lado2 || lado2 == lado3) {
                System.out.println("É um triângulo isósceles! ");
            } else {
                System.out.println("É um triângulo escaleno! ");
            }
        else
            System.out.println("Os lados não formam um triangulo. ");

        sc.close();

    }

}
