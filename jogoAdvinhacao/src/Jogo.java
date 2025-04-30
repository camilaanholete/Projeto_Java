import java.util.Random;
import java.util.Scanner;


public class Jogo {
    public static void main(String[] args) {
        int numeroAdivinhar = new Random().nextInt(100);
        Scanner usuario = new Scanner(System.in);
        int valor = 0;

        for (int i = 0 ; i <5 ; i++ ){
            System.out.println("Adivinhe qual número eu escolhi de 0 a 100");
            valor = usuario.nextInt();

            if (valor == numeroAdivinhar){
                //incluir mensagem de acerto
                System.out.println("Você acertou, o número era " +numeroAdivinhar);
                break;
            } else if (valor > numeroAdivinhar ) {
                //incluir mensagem de menor
                System.out.println("Você errou, o número é menor");
            } else if (valor < numeroAdivinhar ) {
                //incluir mensagem de maior
                System.out.println("Você errou, o número é maior");
            }

        }
        System.out.println("O número era " +numeroAdivinhar);
    }
}