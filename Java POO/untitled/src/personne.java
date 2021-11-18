import java.util.Scanner;

class Personne {
    private String nom;
    private String prenom;
    private String pays;
    private boolean estMarie;
    private int nombreEnfants;

    public Personne(String nom, String prenom, String pays, boolean estMarie, int nombreEnfants) {
        this.nom = nom;
        this.prenom = prenom;
        this.pays = pays;
        this.estMarie = estMarie;
        this.nombreEnfants = nombreEnfants;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getPays() {
        return pays;
    }

    public boolean isEstMarie() {
        return estMarie;
    }

    public int getNombreEnfants() {
        return nombreEnfants;
    }



    public String nomComplet(){
        return prenom+" "+nom;
    }
}

class main{
    public static void main(String[] args) {
        Personne moi=new Personne("Adjmi","Hiba","Algérie",true,0);
        System.out.println("Nom : "+moi.getNom());
        System.out.println("Prenom : "+moi.getPrenom());
        System.out.println("Nom complet : "+moi.nomComplet());
        System.out.println("Pays : "+moi.getPays());
        System.out.println("Est married : "+(moi.isEstMarie()?"Oui":"Non"));
        System.out.println("Enfants : "+moi.getNombreEnfants());
    }
}