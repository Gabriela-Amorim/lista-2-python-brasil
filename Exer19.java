import java.util.Scanner;

public class Exer19 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número menor que 1000: ");
        double numero = sc.nextDouble();

        int centenas = (int) (numero / 100);
        int dezenas = (int) ((numero % 100) / 10);
        int unidades = (int) ((numero % 100) % 10);

        String resultado = "";

        if (centenas > 0) {
            resultado += centenas + (centenas == 1 ? " centena" : " centenas");
        }

        if (dezenas > 0) {
            if (resultado.length() > 0) {
                resultado += ", ";
            }
            resultado += dezenas + (dezenas == 1 ? " dezena" : " dezenas");
        }

        if (unidades > 0) {
            if (resultado.length() > 0) {
                resultado += ", ";
            }
            resultado += unidades + (unidades == 1 ? " unidade" : " unidades");
        }

        System.out.println(numero + " = " + resultado);

        sc.close();
        
    }
    
}
