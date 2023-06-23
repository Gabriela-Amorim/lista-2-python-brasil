import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da hora de trabalho: ");
        double valorHora = sc.nextDouble();

        System.out.print("Informe  a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = sc.nextInt();

        double salarioBruto = valorHora * horasTrabalhadas;
        double descontoIR;

        if (salarioBruto <= 900.00) {
            descontoIR = 0.0;
        } else if (salarioBruto <= 1500.00) {
            descontoIR = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500.00) {
            descontoIR = salarioBruto * 0.1;
        } else {
            descontoIR = salarioBruto * 0.2;
        }

        double descontoINSS = salarioBruto * 0.1;
        double fgts = salarioBruto * 0.11;
        double totalDescontos = descontoIR + descontoINSS + fgts;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("(-) IR (" + descontoIR);
        System.out.println("(-) INSS (10%): R$ " + descontoINSS);
        System.out.println("FGTS (11%): R$ " + fgts);
        System.out.println("Total de descontos: R$ " + totalDescontos);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        sc.close();

    }
}
