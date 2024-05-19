import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    System.out.println("Conta");
    System.out.println();
    System.out.println("Por Favor, Digite o numero da Conta: (1010)");
    numero =sc.nextInt();
    
           System.out.println("Digite o Numero da Sua Agencia (101-1)");
           agencia =sc.next();

        System.out.println("Informe seu Nome");
        nomeCliente =sc.next();
        sc.nextLine();

        System.out.println("Informe se Saldo");
        saldo = sc.nextDouble();

        System.out.println();
        System.out.printf("olá %s, sua conta foi criada com sucesso"
      + "sua agencia é %s" + "Sua conta é %s" + "seu saldo %s ja esta dispovinel para o saque",
      nomeCliente, agencia, numero, saldo);
        sc.close();


  }
  }  
