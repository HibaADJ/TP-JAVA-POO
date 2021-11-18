import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class TP20 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Entrer la premiere phrase");
        String phrase1 = keyboard.nextLine();
        System.out.println("Entrer la deuxieme phrase");
        String phrase2 = keyboard.nextLine();
        HashMap<Character, Integer> occurences = new HashMap<>();
        for (int i = 0; i < phrase1.length(); i++) {
            if (occurences.get(phrase1.charAt(i)) == null) {
                occurences.put(phrase1.charAt(i), 1);
            } else {
                occurences.replace(phrase1.charAt(i), occurences.get(phrase1.charAt(i)) + 1);
            }
        }


        HashMap<Character, Integer> occurences2 = new HashMap<>();
        for (int i = 0; i < phrase2.length(); i++) {
            if (occurences2.get(phrase2.charAt(i)) == null) {
                occurences2.put(phrase2.charAt(i), 1);
            } else {
                occurences2.replace(phrase2.charAt(i), occurences2.get(phrase2.charAt(i)) + 1);
            }
        }

        occurences.remove(' ');
        occurences2.remove(' ');
        System.out.println(occurences);
        System.out.println(occurences2);
        if (Objects.equals(occurences, occurences2))
        {
            System.out.println("oui c'est une anagramme");
        }
        else {
            System.out.println("Non c'est pas  une anagramme ");
        }
    }
}