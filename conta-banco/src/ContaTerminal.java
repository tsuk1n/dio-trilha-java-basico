import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número do usuário: ");
        int numero = sc.nextInt();

        System.out.print("Digite o número da agência: ");
        String agencia = sc.next();

        System.out.print("Digite o nome do cliente: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.print("Digite o saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá, ".concat(nome) +
                ", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia) +
                ", conta " + numero + " e seu saldo " + saldo +
                ", já está disponível para saque.");

        sc.close();
    }
}
