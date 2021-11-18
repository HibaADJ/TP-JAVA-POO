import java.util.ArrayList;
import java.util.Objects;

public class Auteur {
    private String nom;
    private boolean  prime;

    public Auteur(String nom, String status) {
        if (status == "oui") {
            this.prime = true;
            this.nom = nom;
        } else {

            this.nom = nom;
            this.prime = false;
        }
    }


    public String getNom() {
        return nom;
    }

    public boolean isPrime() {
        return prime;
    }

    public void setNoms(String nom) {
        this.nom = nom;
    }

    public void setPrimé(boolean primé) {
        this.prime = prime;
    }
    public  boolean getPrix(){
        return prime;
    }

    @Override
    public String toString() {
        return  nom ;
    }
}
abstract class Document{
    public String titre;
    public Auteur auteur;
    public String langue;
    public abstract void afficher();

    public Document(String titre, Auteur auteur, String langue) {
        this.titre = titre;
        this.auteur = auteur;
        this.langue = langue;
    }
}

class Livre extends Document{

    public Livre(String titre, Auteur auteur, String langue) {
        super(titre, auteur, langue);
    }

    @Override
    public void afficher() {
        System.out.println("Le livre" + super.titre+super.auteur.getNom()+super.langue);
    }


    public void getAuteurLivre() {
        System.out.println("L'auteur : "+super.auteur.getNom());
    }


    public void getTitreLivre() {
        System.out.println("Tite :"+super.titre);
    }


    public void getLangueLivre() {
        System.out.println("la langue:"+langue);

    }


}
class Revue extends Document{
    private String dateDeSortie;

    public Revue(String titre, Auteur auteur, String langue, String dateDeSortie) {
        super(titre, auteur, langue);
        this.dateDeSortie = dateDeSortie;
    }
    @Override
    public void afficher() {
        System.out.println("La revue" + super.titre+super.auteur.getNom()+super.langue);
    }

    public void getAuteurRevue() {
        System.out.println("L'auteur : "+super.auteur.getNom());
    }


    public void getTitreRevue() {
        System.out.println("Tite :"+super.titre);
    }


    public void getLangueRevue() {
        System.out.println(super.langue);

    }


}



public class Exemplaire{
    private Livre exemplairLivre;
    private Revue exemplairRevue;

    public Exemplaire(Document titreLivre, String type) {
        if (type=="live"){
           this.exemplairLivre=titreLivre;
        }
        this.exemplairLivre= titreLivre;
        System.out.println("Nouvel exemplaire "+titreLivre+ );
    }
    public Exemplaire(Exemplaire titreDocument){
        this.exemplairDocument=titreDocument.exemplairDocument;
        System.out.println("Nouvelle copie d’un exemplaire de:\n " +exemplairDocument.afficher());
    }

    public Document getExemplaireDocument() {

        return exemplairDocument;
    }


    public String afficher() {
        return "Un exemplaire de: \n " +exemplairDocument.afficher();
    }

}
class Bibliotheque{

    private String nomBibliotheque;
    private ArrayList<Exemplaire> exemplaires = new ArrayList<Exemplaire>();

    public Bibliotheque(String nomBibliotheque) {
        this.nomBibliotheque = nomBibliotheque;
        System.out.println("La bibliothèque "+this.nomBibliotheque+" "+"est ouverte!");
    }


    public String getNomBibliotheque() {
        return nomBibliotheque;
    }

    public int getNbExemplaire() {
        return exemplaires.size();
    }
    public void stocker(Oeuvre titreOeuvre, int nbrExemplaire){
        for (int i=0;i<nbrExemplaire;i++){
            this.exemplaires.add(new Exemplaire(titreOeuvre));
        }
    }
    public ArrayList<Exemplaire> listerExemplaires(){
        return exemplaires;
    }

    public ArrayList<Exemplaire> getExemplaires() {
        return exemplaires;
    }

    public ArrayList<Exemplaire>listerExemplaires(String langue){
        ArrayList<Exemplaire> listExemplaire = new ArrayList<>();
        for(int i=0;i<exemplaires.size(); i++){
            if(Objects.equals(exemplaires.get(i).getExemplaireDoeuvre().getLangue(),langue)){
                listExemplaire.add(exemplaires.get(i));
            }
        }return listExemplaire;

    }
    public long compterExemplaires(Oeuvre nomoeuvre){
        return exemplaires.stream().filter(ex -> Objects.equals(ex.getExemplaireDoeuvre(), nomoeuvre)).count();
    }
    public void afficherAuteur(boolean prime){
        if (prime) {
            for (int i = 0; i < this.getNbExemplaire(); i++) {
                if (this.exemplaires.get(i).getExemplaireDoeuvre().getAuteurDoeuvre().isPrimé()) {
                    System.out.printf("%s\n", this.exemplaires.get(i).getExemplaireDoeuvre().getAuteurDoeuvre().getNom());
                }
            }
        } else {
            for (int i = 0; i < this.getNbExemplaire(); i++) {
                System.out.printf("%s\n", this.exemplaires.get(i).getExemplaireDoeuvre().getAuteurDoeuvre().getNom());
            }
        }
    }

    public void afficherAuteur(){
        afficherAuteur(false);
    }



}

