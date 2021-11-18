import java.util.ArrayList;

public class TP33 {
    static ArrayList somme(int[] tb, int s) {
        ArrayList<ArrayList <Integer>> listCpls = new ArrayList<>();
        for (int j = 0; j < tb.length; j++) {
            int v = tb[j];
            for (int i = j; i < tb.length; i++) {

                int m = v + tb[i];
                if (m == s && i!=j) {
                    ArrayList<Integer> cpl = new ArrayList<>();
                    cpl.add(0, v);
                    cpl.add(1,tb[i]);
                    if (!listCpls.contains(cpl)) {
                        listCpls.add(cpl);
                    }



                }

            }

        }
        return listCpls;

    }
        public static void main (String[]args){
            int[] couple = {3, 2,4,7,5,-1,9,8};
            System.out.println(somme(couple, 9));

        }
    }

