import java.util.Scanner;

public class TP4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Entrez votre année de naissance :");
        int a = keyboard.nextInt();
        int c=2021-a;
        System.out.printf("votre age est %d ans:",c);
    }
}
