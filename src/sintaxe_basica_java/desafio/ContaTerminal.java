package sintaxe_basica_java.desafio;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        String nome;
        String agencia;
        int conta;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite sua agência: ");
        agencia = sc.nextLine();

        System.out.println("Digite sua conta: ");
        conta = sc.nextInt();

        System.out.println("Saldo do cliente: ");
        saldo = sc.nextDouble();

        System.out.println("Olá" + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque" );

    }
}
