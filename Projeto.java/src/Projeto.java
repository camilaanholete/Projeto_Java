import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Projeto {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();

        String nome = "Camila";
        String conta = "Corrente";
        double saldo = 5000.99;
        double limite = 2000.00;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = agora.format(formato);
        int opcao = 0;


        System.out.println("--------------------");
        System.out.println("\nNome de cliente: " + nome);
        System.out.println("Tipo de conta: " + conta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
        System.out.println("Data e hora da consulta " + dataHoraFormatada);
        System.out.println("\n--------------------");

        String Menu = """
                ** Digite a opção que deseja **
                
                1 - Saldo Disponível
                2 - Transferir valor 
                3 - Receber valor
                4 - Limite Atual
                5 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 5) {
            System.out.println(Menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.printf("O saldo atualizado é = %.2f\n", saldo);

            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja transferir: ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("O valor transferido é maior que saldo em conta!");
                    System.out.println("Seu limite do cheque especial foi ultilizado para completar a transferência");
                    saldo = saldo - valor;
                    limite = limite + saldo;
                    System.out.printf("Seu limite atual é = %.2f\n", limite);
                    System.out.printf("Saldo atualizado = %.2f\n", saldo);
                } else {
                    saldo -= valor;
                    System.out.printf("Saldo atualizado = %.2f\n", saldo);
                }

            } else if (opcao == 3) {
                System.out.println("Digite o valor que irá receber: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.printf("Saldo atualizado = %.2f\n", saldo);

            } else if (opcao == 4) {
                System.out.printf("Seu limite atual é = %.2f\n", limite);

            } else if (opcao != 5) {
                System.out.println("Opção inválida, por favor digite novamente!");
            }
        }

    }
}