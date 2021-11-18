import java.util.ArrayList;

public class TP26 {

    static boolean prefix(String chaine1, String chaine2) {
//convertir les 2 mots en tableaux dynamique
        ArrayList<Character> partfrom1 = new ArrayList<>();
        ArrayList<Character> listeCh1 = new ArrayList<>();
        for (int i = 0; i < chaine1.length(); i++) {
            listeCh1.add(chaine1.charAt(i));
        }
        ArrayList<Character> listeCh2 = new ArrayList<>();
        for (int i = 0; i < chaine2.length(); i++) {
            listeCh2.add(chaine2.charAt(i));
        }
        //for (int i=0; i<chaine2.length();i++) {
        //String part=chaine1.substring(i,i+1);
        //partfrom1.add(i);
        //}
        boolean result = listeCh1.containsAll(listeCh2);
        return result;
    }
    //voir si le premier mots contient le deuxiemme mots





        public static void main (String[]args)
        {
            String mots1 = "hugging";
            String mot2 = "hug";
            System.out.println(prefix(mots1, mot2));

        }
    }
