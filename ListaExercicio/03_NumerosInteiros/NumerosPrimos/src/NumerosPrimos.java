import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        System.out.println("Números primos menores que " + numero + ":");
        for (int i = 2; i < numero; i++) {
            if (ePrimo(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean ePrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}