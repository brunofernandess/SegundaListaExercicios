import java.util.Scanner;

public class ContagemCaracteres {
    
    public static void countCharacters(String str) {
        int vowels = 0;
        int spaces = 0;
        int consonants = 0;
        
        str = str.toLowerCase(); 
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch == ' ') {
                spaces++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }
        
        System.out.println("Quantidade de vogais: " + vowels);
        System.out.println("Quantidade de espaços em branco: " + spaces);
        System.out.println("Quantidade de consoantes: " + consonants);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma cadeia de caracteres: ");
        String input = scanner.nextLine();
        
        countCharacters(input);
        
        scanner.close();
    }
}