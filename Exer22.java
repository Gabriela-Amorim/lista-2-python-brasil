import java.util.Scanner; 

public class Exer22 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar! ");
        }

        sc.close();

    }
    
}
