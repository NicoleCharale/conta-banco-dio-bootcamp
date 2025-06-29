import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.print("Digite a agência da sua conta: ");
        String agencia = scanner.next();

        System.out.print("Digite o saldo inicial para a sua conta: ");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu " +
                "saldo %.2f já está disponível para saque.", nome, agencia, numero, saldo);
    }
}
