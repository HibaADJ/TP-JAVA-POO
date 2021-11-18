import java.util.Scanner;
public class TP11 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int c = keyboard.nextInt();
        int fac = c;
        if (c != 0) {

            for (int i = c - 1; i > 0; i--) {
                fac = fac * i;
            }
        } else {
            fac = 1;
        }
        System.out.println("le factorielle de " + c + " est =" + fac);
    }
}