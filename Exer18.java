import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Exer18 {
    public static boolean dataValida(String data) {
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/mm/aaaa");
        formatoData.setLenient(false);

        try {
            formatoData.parse(data);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String dataInput = sc.nextLine();

        if (dataValida(dataInput)) {
            System.out.println("A data é válida.");
        } else {
            System.out.println("A data é inválida.");
        }

        sc.close();
    }
}
