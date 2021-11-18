import java.util.Scanner;

public class Tirelire {
    private double montant;


    public Tirelire(double montant) {

        this.montant = montant;
    }

    public Tirelire() {
        montant = 0;
    }

    public String toString() {
        return "montant restant =" + montant + "€";
    }

    public void afficher() {
        if (montant == 0) {
            System.out.println("vous étes sans sous allez bosser");
        } else {
            System.out.println("Il vous reste =" + montant + "dans votre tirlire");
        }
    }

    public void secouer() {
        if (montant != 0) {
            System.out.println("BIIIIIIING BAAAAAANG");
        }
    }

    public void remplir(double add) {
        if (add > 0) {
            montant = montant + add;
        }
    }

    public void vider() {
        montant = 0;

    }

    public void puiser(double somme) {
        if (somme > montant) {
            montant = 0;
        }
        if (somme < montant) {
            montant = montant - somme;
        }
        if (somme < 0) {

        }
    }

    public double calculeSold() {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Quel est le budget qu'il vaut faut pour aller en vacance");
        double budget = clavier.nextDouble();
        if (budget <= 0) {
            return montant;
        } else {
            montant=montant-budget;
            System.out.println("Vous pouvez aller en vacance tranquilement il vous reste"+montant+"€ pour la rentré");
        }
            return montant ;

    }

}

class Transaction {
    public static void main(String[] args) {
        Tirelire maTirelire = new Tirelire();
        maTirelire.afficher();
        maTirelire.remplir(40);
        maTirelire.afficher();
        System.out.println(maTirelire.calculeSold());



    }

}
