import java.util.Locale;
import java.util.Scanner;

public class Main_tabuada {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n, resultado;
        
        System.out.println("Deseja a tabuada para qual valor? ");
        n = sc.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            resultado = n * i;
            System.out.println("4 x " + i + " = " + resultado);
        }


        sc.close();
    }
}
