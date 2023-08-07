import java.util.Scanner;

public class CalculadoraConsumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalQuilometros = 0;
        int totalLitros = 0;
        int tanquesCheios = 0;
        
        while (true) {
            System.out.print("Informe os quilômetros dirigidos (-1 para sair): ");
            int quilometros = scanner.nextInt();
            
            if (quilometros == -1) {
                break;
            }
            
            System.out.print("Informe a quantidade de combustível em litros: ");
            int litros = scanner.nextInt();
            
            double consumo = (double) quilometros / litros;
            
            System.out.println("Consumo do tanque: " + consumo + " km/l");
            
            totalQuilometros += quilometros;
            totalLitros += litros;
            tanquesCheios++;
        }
        
        if (tanquesCheios > 0) {
            double consumoMedio = (double) totalQuilometros / totalLitros;
            
            
            System.out.println("Tanques cheios: " + tanquesCheios);
            System.out.println("Quilometragem combinada: " + totalQuilometros + " km");
            System.out.println("Total de litros consumidos: " + totalLitros + " litros");
            System.out.println("Consumo médio: " + consumoMedio + " km/l");
        } else {
            System.out.println("Nenhum dado de consumo foi inserido.");
        }
        
        scanner.close();
    }
}