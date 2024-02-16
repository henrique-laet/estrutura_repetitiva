import java.util.Locale;
import java.util.Scanner;

public class Main_senhaFixa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int senha;

        System.out.println("Digite  a senha: ");
        senha = sc.nextInt();

        while (senha != 2312) {
            System.out.println("Senha Invalida! Tente novamente: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido!");


        sc.close();
    }
}
