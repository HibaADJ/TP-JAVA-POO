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