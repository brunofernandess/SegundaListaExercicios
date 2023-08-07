import java.util.Scanner;

public class AreaCirculo {
    
    public static double calculoArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return Math.round(area);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o raio do círculo: ");
        double radius = scanner.nextDouble();
        
        double area = calculoArea(radius);
        System.out.println("A área do círculo é: " + area);
        
        scanner.close();
    }
}