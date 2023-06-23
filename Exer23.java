import java.util.Scanner;

public class Exer23 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double numero = sc.nextDouble();

        double numeroArredondado = Math.round(numero);

        if (numero == numeroArredondado){
            System.out.println("O número é inteiro!");
        } else {
            System.out.println("O número é decimal! ");
        }

        sc.close();

    }
    
}
