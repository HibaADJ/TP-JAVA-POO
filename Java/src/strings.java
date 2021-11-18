import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        var clavier=new Scanner(System.in);
        String monAdresseMail="christian@gmail.com";
        String emailConnexion="christian@gmail.com";
        System.out.println("Saisir une adresse email : ");
        String email3=clavier.nextLine();
        System.out.println(monAdresseMail==emailConnexion);
//        Affiche avant d'ajouuter email3 dans le pool des littéraux
        System.out.println(email3==monAdresseMail);
        //        Affiche avoir ajouté email3 dans le pool des littéraux
        email3= email3.intern();
        System.out.println(email3==monAdresseMail);
    }
}
