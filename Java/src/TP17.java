import java.util.Scanner;
public class TP17 {
    public static void main(String[] args) {
        System.out.println("entrer la phrase");
        Scanner keyboard = new Scanner(System.in);
        String phrase = keyboard.nextLine();

        StringBuilder c = new StringBuilder(phrase);
        phrase = c.reverse().toString();
        System.out.println(phrase);

    }
}