package polymorphisme;

 class Abstract {

}
class Personnage{
    private String nom;
    private final int niveauDeVie;
    public Personnage(String nom){
        this.nom=nom;
        this.niveauDeVie=100;
    }

    public String getNom(){
        return this.nom;
    }

    public void rencontrer(Personnage p){
        System.out.printf("Je suis %s, et toi tu es %s",this.nom,p.getNom());
    }
}

class Guerrier extends Personnage{
    private String arme;
    public Guerrier(String nom,String arme){
        super(nom);
        this.arme=arme;
    }

    @Override
    public void rencontrer(Personnage p) {
        System.out.printf("Moi %s, je suis un guerrier et toi alors %s",this.getNom(),p.getNom());
    }
}


class Main{
    public static void main(String[] args) {
        Personnage moi=new Guerrier("Christian Lisangola","M16");
        Personnage elle=new Personnage("Lydia");
        moi.rencontrer(elle);
    }
}