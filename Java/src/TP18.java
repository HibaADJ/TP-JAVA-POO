 import java.util.Objects;
 import java.util.Scanner;
    public class TP18 {
        public static void main(String[] args) {
            System.out.println("entrer la phrase");
            Scanner keyboard = new Scanner(System.in);
            String phrase = keyboard.nextLine();

            StringBuilder phraseObjet = new StringBuilder(phrase);
            String phrase2 = phraseObjet.reverse().toString();
            System.out.println(phrase2);
            if(!Objects.equals(phrase, phrase2)){
                System.out.println("c'est pas un palindrome");
            }
            else {
                System.out.println("c'est un palindrome");
            }

        }
    }