import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Em que turno você estuda? Digite M (Matutino), V (Vespertino) ou N (Noturno). ");
        String turno = sc.next();

        if (turno.equalsIgnoreCase("M")) {
            System.out.println("Bom Dia!");
        } else if (turno.equalsIgnoreCase("V")) {
            System.out.println("Boa Tarde!");
        } else if (turno.equalsIgnoreCase("N")) {
            System.out.println("Boa Noite!");
        } else {
            System.out.println("Valor Inválido!");
        }

        sc.close();
    }

}
