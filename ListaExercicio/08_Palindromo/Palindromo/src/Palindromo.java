import java.util.Scanner;

public class Palindromo {
    
    public static boolean isPalindromo(String palavra) {
        palavra = palavra.toLowerCase(); 
        
        int length = palavra.length();
        
        for (int i = 0; i < length / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(length - 1 - i)) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        
        if (isPalindromo(palavra)) {
            System.out.println("A palavra '" + palavra + "' é um palíndromo.");
        } else {
            System.out.println("A palavra '" + palavra + "' não é um palíndromo.");
        }
        
        scanner.close();
    }
}