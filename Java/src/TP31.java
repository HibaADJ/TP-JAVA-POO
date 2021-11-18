import java.util.ArrayList;

public class TP31 {

    static void split(int[] tab, int nbr) {
        int taille = tab.length;
        for (int i = 0; i <=tab.length; i=i+nbr) {
            if (taille > nbr) {
                ArrayList<Integer> splited = new ArrayList<>();
                for (int j = 0; j < nbr; j++) {
                    splited.add(j, tab[i + j]);
                }
                taille = taille - nbr;
                System.out.println(splited);

            }
            else {
                ArrayList<Integer> splited2 = new ArrayList<>();
                for (int j=0 ; j<taille;j++){
                    splited2.add(j, tab[i + j]);
                }
                System.out.println(splited2);
            }
        }
    }

    public static void main(String[] args) {
        int [] tab={3,5,6,5,7};
        split(tab,3);
    }
}
