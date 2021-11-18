import java.util.Arrays;

public class essai {
    public static void main(String[] args) {
        int nbr = 5;
        int t[][] = {{1, 2, 3}, {4, 5, 6}, {4, 5, 6}};
        System.out.println(t.length);
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (t[i][j] == nbr) {
                    System.out.printf("la valeur %d ce trouve dans la position (%d,%d)\n", t[i][j], i, j);
                }
            }
        }
    }
}
