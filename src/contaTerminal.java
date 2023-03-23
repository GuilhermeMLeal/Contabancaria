import java.util.Scanner;
import java.util.Locale;

public class contaTerminal {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
       System.out.println("Digite seu nome");
        String nome= scanner.next();
        System.out.println("Digite seu saldo");
        double saldo= scanner.nextDouble() ;
        System.out.println("Digite sua Agencia");
        int agencia = scanner.nextInt() ;
        System.out.println("Digite o número da sua conta");
        String conta= scanner.next();

        System.out.println("Olá, "+ nome + ". Bem-vindo ao Banco Itau! Sua agência é " + agencia+ " , sua conta é " + conta + " e seu saldo é " + saldo + " ." );
    }    
}
