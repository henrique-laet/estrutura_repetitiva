import java.util.Locale;
import java.util.Scanner;

public class Main_parImpar {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, x;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            x = sc.nextInt();


            if (x == 0) {
                System.out.println("NULO");
            }
            else {
                if (x % 2 != 0) {
                    System.out.print("IMPAR");
                } else {
                    System.out.print("PAR");
                }
                if (x > 0) {
                    System.out.println(" POSITIVO");
                } else {
                    System.out.println(" NEGATIVO");
                }
            }
        }

        sc.close();
    }
}
