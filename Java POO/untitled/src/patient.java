import java.util.Scanner;
class Patient {

    private double taille;
    private double poids;


    public double getTaille() {
        return taille;
    }

    public double getPoids() {
        return poids;
    }


    public void setTaille(double taille) {
        this.taille = taille;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }
    public double imc (){
        return poids/(taille*taille) ;
    }
}
class Shape{
    public static void main(String[] args) {
        Patient personne1=new Patient();
        Scanner clavier = new Scanner(System.in);
        System.out.println("Indiquez le poids du patient :");
        double p = clavier.nextDouble();
        System.out.println("Indiquez la taille  du patient :");
        double t=clavier.nextDouble();
        personne1.setTaille(t) ;
        personne1.setPoids(p) ;
        System.out.println("Le poids en kg :"+ personne1.getPoids());
        System.out.println("La taille en m :"+personne1.getTaille());
        System.out.println("L'indice de Masse Corporelle est "+personne1.imc()+" kg/m2");

    }
}