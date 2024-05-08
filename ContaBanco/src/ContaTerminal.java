
import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nome;
        BigDecimal saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        numeroConta = sc.nextInt();
        System.out.println("Digite a agência:");
        agencia = sc.next();
        System.out.println("Digite o nome:");
        nome = sc.next();
        System.out.println("Digite o saldo:");
        saldo = sc.nextBigDecimal();

        System.out.println("Olá, " + nome + "! Obrigado por criar uma conta em nosso banco, sua conta é " + agencia
                + "conta " + numeroConta + " e seu saldo R$" + saldo + " já esta disponível para saque.");
    }
}