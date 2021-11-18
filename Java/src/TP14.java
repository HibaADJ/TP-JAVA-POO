import java.util.Scanner;
public class TP14 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int cpt = 0;
        int rec = 0;
        System.out.println("Quelle est la taille de votre liste");
        int taille = keyboard.nextInt();
        int[] numbers = new int[taille];
        for (int i = 0; i < numbers.length; i++) {

            System.out.printf("l'element %d = ", i);
            numbers[i] = keyboard.nextInt();
        }}}




