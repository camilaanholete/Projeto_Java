import java.util.Scanner;

public class comparacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println(" Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if(numero1 == numero2){
            System.out.println("Os números são iguais");

        }else if(numero1 > numero2 ){
            System.out.println("O primero número é maior");

        }else{
            System.out.println("O segundo número é menor");
        }

    }
}