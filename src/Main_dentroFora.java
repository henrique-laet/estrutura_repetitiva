import java.util.Locale;
import java.util.Scanner;

public class Main_dentroFora {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n,x = 0, dentro = 0, fora = 0;

        System.out.print("Quantos numeros voce vai digitar?");
        n = sc.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.print("Digite um numero: ");
            x = sc.nextInt();

            if (x < 10 || x > 20) {
               dentro++;
            } else {
               fora++;
            }
        }

        System.out.println("FORA " + fora);
        System.out.println("DENTRO " + dentro);


        sc.close();
    }
}
