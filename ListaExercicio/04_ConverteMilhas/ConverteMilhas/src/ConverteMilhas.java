import java.util.Scanner;

public class ConverteMilhas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a distância em milhas: ");
        double milhas = input.nextDouble();

        double quilometros = converterMilhasParaQuilometros(milhas);

        System.out.println(milhas + " milhas equivalem a " + quilometros + " quilômetros.");
    }

    public static double converterMilhasParaQuilometros(double milhas) {
        double quilometros = milhas * 1.609;
        return quilometros;
    }
}