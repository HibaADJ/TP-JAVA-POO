import java.util.ArrayList;
import java.util.Objects;

public class Auteur {
    private String nom;
    private boolean  primé;

    public Auteur(String nom, String status) {
        if (status == "oui") {
            this.primé = true;
            this.nom = nom;
        } else {

            this.nom = nom;
            this.primé = false;
        }
    }

    public String getNom() {
        return nom;
    }

    public boolean isPrimé() {
        return primé;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrimé(boolean primé) {
        this.primé = primé;
    }
    public  boolean getPrix(){
        return primé;
    }

    @Override
    public String toString() {
        return  nom ;
    }
}
class Oeuvre{
   private String titreDoeuvre;
   private Auteur auteurDoeuvre;
   private String langue;

    public Oeuvre(String titreDoeuvre, Auteur auteurDoeuvre, String langue) {
        this.titreDoeuvre = titreDoeuvre;
        this.auteurDoeuvre = auteurDoeuvre;
        this.langue = langue;
    }

    public String afficher() {
        return
                "------------------------"+"\n"+"Titre de l'oeuvre:" + titreDoeuvre + "\n" +"------------------------"+"\n"+ "Nom de l'oeuvre:" + auteurDoeuvre +"\n" +"------------------------"+"\n"+ "Langue:" + langue +"\n" +"-----------------------"
                ;
    }

    public String getTitreDoeuvre() {
        return titreDoeuvre;
    }

    public Auteur getAuteurDoeuvre() {
        return auteurDoeuvre;
    }

    public String getLangue() {
        return langue;
    }
}


class Exemplaire{
    private Oeuvre exemplaireOeuvre;

    public Exemplaire(Oeuvre titreOeuvre) {
        this.exemplaireOeuvre=titreOeuvre;
        System.out.println("Nouvel exemplaire "+titreOeuvre.getTitreDoeuvre()+" "+titreOeuvre.getAuteurDoeuvre()+" "+titreOeuvre.getLangue());

    }
    public Exemplaire(Exemplaire titreOeuvre){
        this.exemplaireOeuvre=titreOeuvre.exemplaireOeuvre;
        System.out.println("Nouvelle copie d’un exemplaire de:\n " +exemplaireOeuvre.afficher());
    }

    public Oeuvre getExemplaireDoeuvre() {

        return exemplaireOeuvre;
    }


    public String  {
        return "Un exemplaire de: \n " +exemplaireOeuvre.afficher();
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

class test {
    public static void main(String[] args) {
        Bibliotheque municipale =new Bibliotheque("municipale");
        Auteur VictorHugo=new Auteur("Victor Hugo","oui");
        Auteur AlexandreDumas=new Auteur("Alexandre Dumas","oui");
        Auteur RaymondQueneau=new Auteur("Raymond Queneau","oui");
        Oeuvre lesMiserables=new Oeuvre("Les Miserables",VictorHugo,"français");
        Oeuvre lHommeQuiRit=new Oeuvre("L'Homme qui rit",VictorHugo,"français");
        Oeuvre leCompteDeMonteCristo=new Oeuvre("Le Comte de Monte-Cristo",AlexandreDumas,"français");
        Oeuvre leCompteDeMonteCristo2=new Oeuvre("Le Comte de Monte-Cristo",AlexandreDumas,"anglais");
        Oeuvre zazieDansLeMetro=new Oeuvre("Zazie dans le metro",RaymondQueneau,"français");
        municipale.stocker(lesMiserables,2);
        municipale.stocker(lHommeQuiRit,1);
        municipale.stocker(leCompteDeMonteCristo,3);
        municipale.stocker(zazieDansLeMetro,1);
        municipale.stocker(leCompteDeMonteCristo2,1);
        municipale.listerExemplaires("français");
        System.out.println(municipale.compterExemplaires(lesMiserables));
        ;

    }
}