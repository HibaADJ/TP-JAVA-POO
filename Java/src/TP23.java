import java.util.ArrayList;
import java.util.Scanner;
public class TP23 {
    public static void main(String[] args) {

//        Declaration
        ArrayList<String> listeDesLangague = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Entrez le nombre des langagues");
        int nbr=keyboard.nextInt();

      for (int i=0;i<nbr;i++){
            System.out.printf("Entrez le langague N°= %d ",i+1);
            Scanner kbd = new Scanner(System.in);
            String input = kbd.nextLine();
            listeDesLangague.add(input);
        }
        for(int i=0;i<listeDesLangague.size();i++){
            System.out.printf("Langague N °= %d est : %s \n",(i+1),listeDesLangague.get(i));
        }
        System.out.println("Combien de langage que vous voulez supprimer?");
        int langagueToDeletNbr=keyboard.nextInt();
       for (int i=0;i<langagueToDeletNbr;i++){
           System.out.printf("Entrez le langague a supprimer N°= %d ",i+1);
           Scanner kd = new Scanner(System.in);
           String langagueToDelet = kd.nextLine();
           listeDesLangague.remove(langagueToDelet);

       }
        for(int i=0;i<listeDesLangague.size();i++){
            System.out.printf("Langague N °= %d est : %s \n",(i+1),listeDesLangague.get(i));
        }
    }
}

