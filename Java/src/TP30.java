import java.util.Objects;

public class TP30 {


    static boolean check(String mots) {
        boolean status=false;
        for (int i = 1; i <mots.length(); i++) {
            String lettre =mots.substring(i,i+1);
            char charPrecedent=mots.charAt(i-1);
            String lettrePrecedente = Character.toString(charPrecedent);
            if (Objects.equals(lettre,lettrePrecedente)){
                status = true;
                 break;
            }

            }return status;
        }




    public static void main(String[] args) {
        String mots="hiiba";
        System.out.println(check(mots));

    }
}
