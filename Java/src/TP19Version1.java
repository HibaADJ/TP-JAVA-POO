import java.util.Scanner;
    public class TP19Version1 {
        public static void main(String[] args) {
            System.out.println("entrer le nombre");
            Scanner keyboard = new Scanner(System.in);
            String phrase = keyboard.nextLine();
            StringBuilder strb = new StringBuilder(phrase);
            String phrase2 = strb.reverse().toString();
            if (phrase.charAt(0) == '-') {
                String phraseSansMoin = phrase2.replace('-',' ');
                System.out.printf("-%s",phraseSansMoin);
            } else {
                System.out.println(phrase2);
            }
        }}

