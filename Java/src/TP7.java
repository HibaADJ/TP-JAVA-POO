import java.util.Scanner;
public class TP7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Entrer un nombre :");
        int a = keyboard.nextInt();

        if (a>0){
            System.out.print("le nombre est positive");
        }
        else{
            System.out.print("le nombre est negative");
        }
        if(a%2==0){
            System.out.print(" et paire");
        }
        else {
            System.out.print(" et impaire");
        }
    }
}

