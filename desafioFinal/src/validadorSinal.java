import java.util.Scanner;

public class validadorSinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Digite um número ");
        int numero = scanner.nextInt();

        if (numero > 0){
            System.out.println( "Este número é positivo");

        } else if (numero < 0){
            System.out.println("Este número é negativo");
        }

    }

}