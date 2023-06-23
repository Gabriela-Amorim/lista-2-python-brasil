import java.util.Scanner;

public class Exer28 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tipo de carne: \nFilé duplo \nAlcatra \nPicanha ");
        String tipoCarne = sc.nextLine();

        System.out.println("Informe a quantidade (Em KG): ");
        double quantidadeCarne = sc.nextDouble();

        System.out.println("Informe forma de pagamento: \nDinheiro \nCartao ");
        String formaPagamento = sc.next();

        double precoCarne = 0;

        if (tipoCarne.equalsIgnoreCase("File Duplo")) {
            if (quantidadeCarne <= 5) {
                precoCarne = quantidadeCarne * 4.90;
            } else {
                precoCarne = quantidadeCarne * 5.80;
            }
        } else if (tipoCarne.equalsIgnoreCase("Alcatra")) {
            if (quantidadeCarne <= 5) {
                precoCarne = quantidadeCarne * 5.90;
            } else {
                precoCarne = quantidadeCarne * 6.80;
            }
        } else {
            if (quantidadeCarne <= 5) {
                precoCarne = quantidadeCarne * 6.90;
            } else {
                precoCarne = quantidadeCarne * 7.80;
            }
        }

        double totalDesconto = 0;
        double valorFinalComDesconto = 0;

        System.out.println("Tipo de carne comprada: " + tipoCarne);
        System.out.println("Quantidade: " + quantidadeCarne);
        System.out.printf("Preço total: %.2f\n", precoCarne);
        System.out.println("Tipo de pagamento: " + formaPagamento);

        if (formaPagamento.equalsIgnoreCase("cartao")) {
            totalDesconto = precoCarne * 0.05;
            valorFinalComDesconto = precoCarne - totalDesconto;
            System.out.printf("Valor do desconto: %.2f\n", totalDesconto);
            System.out.printf("Valor a pagar: %.2f", valorFinalComDesconto);

        } else {
            System.out.printf("Valor do desconto: %.2f\n", totalDesconto);
            System.out.printf("Valor a pagar: %.2f", precoCarne);
        }

        sc.close();

    }

}
