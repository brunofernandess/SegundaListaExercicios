import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] diasDaSemana = { "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado", "Domingo" };

        System.out.print("Digite um número de 1 a 7: ");
        int numero = input.nextInt();

        if (numero >= 1 && numero <= 7) {
            String dia = diasDaSemana[numero - 1];
            System.out.println("Dia da semana: " + dia);
        } else {
            System.out.println("Número inválido. Digite um número de 1 a 7.");
        }

        input.close();
    }
}