import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //TODO: Exibir as mensagens para o nosso usuário
        //TODO: Obter pela scanner os valores digitados no terminal
        System.out.println("Digite sua conta: ");
        int numero = scanner.nextInt();
        
        System.out.println("Digite sua agencia: ");
        String agencia = scanner.next();
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        scanner.close();

        //TODO: Exibir a mensagem conta criada
        System.out.println("Ola, " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " e conta " + numero + " e seu saldo é R$" + saldo + " e já está disponível para saque!");
    }
}
