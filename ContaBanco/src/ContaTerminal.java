import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            
            System.out.println("Por favor, digite seu nome");
            String nome = scanner.next();
            
            System.out.println("Por favor, digite a sua agencia");
            String agencia = scanner.next();
            
            System.out.println("Por favor, digite sua conta");
            int conta = scanner.nextInt();

            double saldo = 234.00;

            System.out.println("Olá " + nome + " Obrigado por criar uma conta em nosso banco!");
            System.out.println("Sua agência é " + agencia + " e o número da sua conta é " + conta);
            System.out.println ("Seu saldo atual é " + saldo + " e já está disponível para saque. ");


        }
        
    }
}