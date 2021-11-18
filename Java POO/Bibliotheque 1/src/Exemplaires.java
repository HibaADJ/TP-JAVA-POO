class Exemplaire{
    private Oeuvre exemplaireOeuvre;
    private Document exemplairDocument;

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


    public String afficher() {
        return "Un exemplaire de: \n " +exemplaireOeuvre.afficher();
    }

}