import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número da Conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite seu saldo: R$ ");
        double saldo = scanner.nextDouble();

        System.out.print("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + "já está disponpivel para saque");

        scanner.close();
    }
}
