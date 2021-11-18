import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;
public class TP24 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> liste = new ArrayList<>();
        //remplissage de la liste
        System.out.println("Entrez la taille de votre list");
        int nbr = keyboard.nextInt();
        for (int i = 0; i < nbr; i++) {
            System.out.printf("Le nombre N°= %d ", i + 1);
            Scanner kbd = new Scanner(System.in);
            int input = kbd.nextInt();
            liste.add(input);
        }
        for(int i=0;i<liste.size();i++){
            System.out.printf("Nombre N°= %d est : %s \n",(i+1),liste.get(i));
        }
        Scanner kd = new Scanner(System.in);
        System.out.println("Combien de nombre voulez vous supprimer?");
        int ToDeletNbr=kd.nextInt();
        for (int i=0; i<ToDeletNbr ; i++){
            System.out.println("Entrer le numbre que vous voullez supprimer ");
            int nbrDel=keyboard.nextInt();

            liste.removeIf(lang -> Objects.equals(lang,nbrDel));
        }
        for(int i=0;i<liste.size();i++){
            System.out.printf("Nombre N°= %d est : %s \n",(i+1),liste.get(i));
        }


    }
}
