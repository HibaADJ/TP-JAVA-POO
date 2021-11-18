import java.util.Scanner;

public class TP21 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Entrer une phrase");
        String phrase = keyboard.nextLine();

        for (int i=0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == ' ') {
                String toUpper = phrase.substring(i+1, i+2).toUpperCase();
                phrase = phrase.replace(phrase.substring(i+1, i+2), toUpper);
            }

        }
        System.out.println(phrase);
    }
}


