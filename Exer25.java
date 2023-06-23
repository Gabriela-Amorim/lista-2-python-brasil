import java.util.Scanner;

public class Exer25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contador = 0;
        String opcao = ("");

        System.out.println("Responda a pergunta com SIM ou NÃO! ");

        System.out.println("Telefonou para a vítima: ");
        opcao = sc.next();

        if (opcao.equalsIgnoreCase("sim")) {
            contador++;
        }

        System.out.println("Esteve no local do crime? ");
        opcao = sc.next();

        if (opcao.equalsIgnoreCase("sim")) {
            contador++;
        }

        System.out.println("Mora perto da vítima? ");
        opcao = sc.next();

        if (opcao.equalsIgnoreCase("sim")) {
            contador++;
        }

        System.out.println("Devia para a vítima: ");
        opcao = sc.next();

        if (opcao.equalsIgnoreCase("sim")) {
            contador++;
        }

        System.out.println("Já trabalhou com a vítima? ");
        opcao = sc.next();
        
        if (opcao.equalsIgnoreCase("sim")) {
            contador++;
        }

        if (contador == 2) {
            System.out.println("Você é considerado SUSPEITO. ");
        } else if (contador >= 3 && contador <= 4) {
            System.out.println("Você é considerado CÚMPLICE. ");
        } else if (contador == 5) {
            System.out.println("Você é considerado ASSASSINO. ");
        } else {
            System.out.println("Você é considerado INOCENTE. ");
        }

        sc.close();

    }

}
