import java.util.Scanner;
public class TP3 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


        System.out.println("Entrez la première valeur  :");
        int a = keyboard.nextInt();

        System.out.println("Entrez la première valeur  :");
        int b = keyboard.nextInt();

        System.out.println("Entrez la première valeur  :");
        int c = keyboard.nextInt();

        System.out.printf("Les valeurs entrées sont : a= %d b=%d c=%d\n",a,b,c);

        int attente = a;
        a = c;
        c = b;
        b = attente;

        System.out.printf("Les valeurs permutées sont : a= %d b=%d c=%d",a,b,c);

    }
}
