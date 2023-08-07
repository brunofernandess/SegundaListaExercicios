import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = input.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = input.nextDouble();

        double maiorValor = encontrarMaior(valor1, valor2);
        System.out.println("O maior valor é: " + maiorValor);
    }

    public static double encontrarMaior(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}