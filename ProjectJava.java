import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ProjectJava {
    
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);

        // Vamos manter as variáveis aqui no topo

        int escolha;

        System.out.println("\nEscolha o idioma que você deseja: \n");
        System.out.println("EN-US\t\tPT-BR\t\tDE-DE");
        System.out.println("  1\t\t  2\t\t  3");
        escolha = input.nextInt();

        switch(escolha){

            case 1:
                Locale localeEN = new Locale("en", "US");
                ResourceBundle messages_en = ResourceBundle.getBundle("messages", localeEN);
                //...
                break;

            case 2:
                Locale localePT = new Locale("pt", "BR");
                ResourceBundle messages_pt = ResourceBundle.getBundle("messages", localePT);
                //...
                break;
            
            case 3:
                Locale localeDE = new Locale("de", "DE");
                ResourceBundle messages_de = ResourceBundle.getBundle("messages", localeDE);
                //...
                break;

            default:
                System.out.println("\n\nEscolha uma linguagem disponível, por favor.");

        }
        
    }
}