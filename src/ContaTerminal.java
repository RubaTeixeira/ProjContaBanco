import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

      public static void main(String[] args) throws Exception {
     
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Inputs para nosso usuário
        System.out.println("Digite seu primeiro nome:");
        String nome = scanner.next();

        System.out.println("Digite o número da agência:");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Digite o valor de depósito:");
        double saldo = scanner.nextDouble();

        //Exibir a mensagem de conta criada
        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia +", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");
    }
}