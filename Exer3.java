import java.util.Scanner;

public class Exer3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe F para Feminino ou M para Masculino: ");
        String sexo = sc.next();

        if (sexo.equalsIgnoreCase("F")) {
            System.out.println("F - Feminino");
        } else if (sexo.equalsIgnoreCase("M")) {
            System.out.println("M - Masculino");
        } else {
            System.err.println("Sexo inválido");
        }

        sc.close();

    }

}
