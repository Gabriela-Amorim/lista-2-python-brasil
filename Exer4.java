import java.util.Scanner;

public class Exer4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe uma letra: ");
        String letra = sc.next();

        if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I")
                || letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
            System.out.println("A letra é uma vogal.");
        } else {
            System.out.println("A letra é uma consoante.");
        }

        sc.close();
    }

}
