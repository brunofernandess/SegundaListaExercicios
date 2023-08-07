import java.util.Scanner;

public class OrdemAlfabetica {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();
        
        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();
        
        
        int resultadoComparacao = palavra1.compareTo(palavra2);
        if (resultadoComparacao < 0) {
            System.out.println("As palavras em ordem alfabética: " + palavra1 + ", " + palavra2);
        } else if (resultadoComparacao > 0) {
            System.out.println("As palavras em ordem alfabética: " + palavra2 + ", " + palavra1);
        } else {
            System.out.println("As palavras são iguais.");
        }
        
        
        int tamanhoPalavra1 = palavra1.length();
        int tamanhoPalavra2 = palavra2.length();
        
        if (tamanhoPalavra1 > tamanhoPalavra2) {
            System.out.println("A palavra '" + palavra1 + "' tem o maior número de caracteres.");
        } else if (tamanhoPalavra2 > tamanhoPalavra1) {
            System.out.println("A palavra '" + palavra2 + "' tem o maior número de caracteres.");
        } else {
            System.out.println("As palavras têm o mesmo número de caracteres.");
        }
        
        scanner.close();
    }
}