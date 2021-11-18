import java.util.Scanner;

public class TP9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Entrez un chiffre entre 1 et 12");
        int c = keyboard.nextInt();

        if (c==1){
            System.out.print("Janvier");
        }
        if(c==2){
            System.out.print("Fevrier");
        }
        if(c==3)
        {
            System.out.print("Mars");
        }
        if(c==4)
        {
            System.out.print("Avril");
        }
        if(c==5)
        {
            System.out.print("Mai");
        }
        if(c==6)
        {
            System.out.print("Juin");
        }
        if(c==7)
        {
            System.out.print("Juillet");
        }
        if(c==8)
        {
            System.out.print("Aout");
        }
        if(c==9)
        {
            System.out.print("Septembre");
        }
        if(c==10)
        {
            System.out.print("Octobre");
        }
        if(c==11)
        {
            System.out.print("Novembre");
        }
        if(c==12)
        {
            System.out.print("decembre");
        }
        else {
            System.out.print("Entrer un chiffre entre 1 et 12 ");
        }

    }
}
