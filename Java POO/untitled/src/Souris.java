public class Souris {
    private double poids;
    private String couleur;
    private int age;
    private int esperanceDeVie;
    private int Esperance_De_Defaut=36;
    private boolean clounee;

    public double getPoids() {
        return poids;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getAge() {
        return age;
    }

    public int getEsperanceDeVie() {
        return esperanceDeVie;
    }

    public Souris(double poids, String couleur, int age, int esperanceDeVie) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = age;
        this.esperanceDeVie = esperanceDeVie;
        System.out.println("Une nouvelle souris !");
    }

    public Souris(){
        this.age=0;
        this.esperanceDeVie=this.Esperance_De_Defaut;
        System.out.println("Une nouvelle souris !");
    }
    public Souris(Souris sourisClone){
        this.poids=sourisClone.poids;
        this.age=sourisClone.age;
        this.esperanceDeVie=sourisClone.getEsperanceDeVie()*4/5;
        this.clounee=true;
        System.out.println("Clonage d’une souris ! ");

    }
    public void vieillir(){
        this.age=this.age+10;
        if (this.clounee && this.age>=esperanceDeVie/2){
            this.couleur="verte";
        }

    }

    @Override
    public String toString() {
        if (clounee==true) {
            return "Une souris de couleur " + couleur+ " " + "clounée" + " d'age "+age+ " mois "+" et pesant "+poids+" gramme"+"";
        }
        else {
            return "Une souris de couleur " + couleur+" "  + " d'age "+age+ " mois " + " et pesant "+poids+" gramme"+"";

        }
        }
        public void evoluer (){

        this.age=this.age+(esperanceDeVie-this.age);
        }



}
class Laboratoir{
    public static void main(String[] args) {
        Souris hiba=new Souris();
        Souris sara=new Souris(hiba);
        System.out.println(hiba.getEsperanceDeVie());
        System.out.println(sara.getEsperanceDeVie());
        hiba.vieillir();
        hiba.vieillir();
        hiba.vieillir();
        System.out.println(hiba);
        sara.vieillir();
        sara.vieillir();
        sara.vieillir();
        System.out.println(sara);
        Souris maya = new Souris(hiba);
        maya.evoluer();


    }
}
