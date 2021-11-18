import java.util.ArrayList;

public class TP32 {

    static void diese(int a) {
        String r = "#";
        for (int i = 0; i < a-1; i++) {

            ArrayList<String> dieseList = new ArrayList<>();
            dieseList.add(r);
            System.out.printf("'%s ' \n", dieseList.get(0));
            r = r + "#";
        }
                ArrayList<String> dieseList2 = new ArrayList<>();
                r = r.replaceAll("\\s", "");
                dieseList2.add(r);
                System.out.printf("'%s' \n", dieseList2.get(0));


        }

        public static void main (String[]args){
            int a = 6;
            diese(a);

        }

}
