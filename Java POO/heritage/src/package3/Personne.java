package package3;
import java.util.ArrayList;


public class Personne {
    private String nom;
    private int anneeDarrivee;


    public Personne(String nom, int anneeDarrivee) {
        this.nom = nom;
        this.anneeDarrivee = anneeDarrivee;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAnneeDarrivee() {
        return anneeDarrivee;
    }

    public void setAnneeDarrivee(int anneeDarrivee) {
        anneeDarrivee = anneeDarrivee;
    }
}
class Secretaires extends Personne {
    private String NomLaboratoire;

    public Secretaires(String nom, int anneeDarrivee, String nomLaboratoire) {
        super(nom, anneeDarrivee);
        NomLaboratoire = nomLaboratoire;
    }

    public String getNomLaboratoire() {
        return NomLaboratoire;
    }

    public void setNomLaboratoire(String nomLaboratoire) {
        NomLaboratoire = nomLaboratoire;
    }

}
    class Enseignants extends Personne {
    private String section;
    private int salaire;
    private String nomlaboratoire;

        public Enseignants(String nom, int anneeDarrivee, String nomDeSection,String nomlaboratoire, int salaire) {
            super(nom, anneeDarrivee);
            this.section = nomDeSection;
            this.salaire = salaire;
            this.nomlaboratoire=nomlaboratoire;

        }

        @Override
        public String toString() {
            return "Enseignants{" +
                    "section='" + section + '\'' +
                    ", salaire=" + salaire +
                    '}';
        }
    }
class Etudiant extends Personne {
    private String section;

    public Etudiant(String nom, int anneeDarrivee, String section) {
        super(nom, anneeDarrivee);
        this.section = section;
    }
}
class EtudiantDechange extends Etudiant{
    private String universiteDorigine;

    public EtudiantDechange(String nom, int anneeDarrivee, String section, String universiteDorigine) {
        super(nom, anneeDarrivee, section);
        this.universiteDorigine = universiteDorigine;
    }

    class EtudiantRegulier extends Etudiant{
        private int noteMoyenne;

        public EtudiantRegulier(String nom, int anneeDarrivee, String section, int noteMoyenne) {
            super(nom, anneeDarrivee, section);
            this.noteMoyenne = noteMoyenne;
        }
    }

}





class Clbit{
    public static void main(String[] args) {
        Personne lydia=new Secretaires("Lydia",2016,"gtl");
        Personne hiba=new EtudiantDechange("hiba",2013,"n2","gtl");
        ArrayList<Personne> presents = new ArrayList<Personne>();





    }

}