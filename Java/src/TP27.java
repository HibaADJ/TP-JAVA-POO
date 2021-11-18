import java.util.HashMap;
import java.util.*;

public class TP27 {

    static void tri(int[][] t, int nbr) {
        HashMap<Integer, Integer> position = new HashMap<>();
        int cpt = 0;

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (t[i][j] == nbr) {
                    position.put(i, j);
                    cpt = cpt + 1;
                }
            }
        }
        System.out.printf("La valeur %d est présente %d fois dans les positions suivantes : \n", nbr, cpt);
        for (Map.Entry<Integer, Integer> entry : position.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            System.out.println("(" + key + "," + value + ")");
        }


    }

    public static void main(String[] args) {
        int tb[][] = {{5, 2, 3}, {4, 5, 6}, {4, 5, 6}};

        tri(tb, 5);

    }


}

