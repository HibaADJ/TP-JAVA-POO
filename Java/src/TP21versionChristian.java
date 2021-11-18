import java.util.Scanner;
public class TP21versionChristian {
    public static void main(String[] args) {
        Scanner clav=new Scanner(System.in);
        System.out.print("Votre texte : ");
        String str=clav.nextLine();
        String result = str.valueOf(str.charAt(0)).toUpperCase();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i-1) == ' ') {
                result += str.valueOf(str.charAt(i)).toUpperCase();
            } else {
                result += str.valueOf(str.charAt(i));
            }
        }
        System.out.println(result);
    }
}

