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


