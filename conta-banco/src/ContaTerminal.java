import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {       

        Scanner sc = new Scanner(System.in); 
        sc.useLocale(Locale.US);       

        System.out.println("Por favor, digite o número da Agência: ");
        int numero = sc.nextInt();
        System.out.println("Por favor, digite o nome da Agência: ");
        String nomeAgencia = sc.next();
        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = sc.next();      
        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco. Sua agência é " 
        + nomeAgencia + ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

    }
}
