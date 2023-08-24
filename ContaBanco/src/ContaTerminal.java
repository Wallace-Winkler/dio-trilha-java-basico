import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o n\u00FAmero da conta! ");
        int numeroConta = Integer.parseInt(scanner.next());
        System.out.println("Por favor, digite o n\u00FAmero da Ag\u00EAncia ! ");
        String agencia = scanner.next();
        System.out.println("Por favor, digite seu nome ! ");
        String nomeCliente = scanner.next();
        System.out.println("Por favor, digite o saldo ! ");
        double saldo = Double.parseDouble(scanner.next());

        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", nomeCliente, agencia, numeroConta, saldo);

        System.out.println(mensagem);

    }
}
