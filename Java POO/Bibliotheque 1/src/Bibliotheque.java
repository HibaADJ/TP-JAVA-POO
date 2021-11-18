import java.util.ArrayList;
import java.util.Objects;

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