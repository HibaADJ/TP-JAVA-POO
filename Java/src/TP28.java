import java.util.List;
import java.util.Arrays;

public class TP28 {
    static void maj(String[] tb) {
        //convertir un tableau en une liste pour qu'on puisse remplacer facilement
        List<String> tbList = Arrays.asList(tb);
        System.out.println(tbList);
        for (int i = 1; i < tbList.size()-1; i=i+2) {
            tbList.set(i,tbList.get(i).toUpperCase());
        }
        System.out.println(tbList);
    }


    public static void main(String[] args) {
        String [] tb = {"a", "d", "g", "s", "m"};
        maj(tb);
    }
}
