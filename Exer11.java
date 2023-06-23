import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o salário atual: ");
        double salarioAtual = sc.nextDouble();

        double percentualAumento;
        if (salarioAtual <= 280.00) {
            percentualAumento = 0.2;
        } else if (salarioAtual <= 700.00) {
            percentualAumento = 0.15;
        } else if (salarioAtual <= 1500.00) {
            percentualAumento = 0.1;
        } else {
            percentualAumento = 0.05;
        }

        double valorAumento = salarioAtual * percentualAumento;
        double novoSalario = salarioAtual + valorAumento;

        System.out.println("Salário anterior: R$ " + salarioAtual);
        System.out.println("Aumento aplicado: " + (percentualAumento * 100) + "%");
        System.out.println("Valor do aumento: R$ " + valorAumento);
        System.out.println("Novo salário: R$ " + novoSalario);

        sc.close();
    }
}
