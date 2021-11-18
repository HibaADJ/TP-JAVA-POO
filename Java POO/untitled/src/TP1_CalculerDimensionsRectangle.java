import java.util.Scanner;
public class TP1_CalculerDimensionsRectangle {
    double largeur;
    double longueur;

    public Double calculPerimetre() {
        double perimetre = longueur + largeur * 2;
        return perimetre;
    }

    public Double calculAire() {
        double aire = longueur * largeur;
        return aire;
    }
}

class Rectangle {
    public static void main(String[] args) {
        TP1_CalculerDimensionsRectangle rectangle = new TP1_CalculerDimensionsRectangle();
        rectangle.longueur = 3.5;
        rectangle.largeur = 2.5;
        System.out.println("L'aire du rectangle = : "+ rectangle.calculAire());
        System.out.println("Le périmetre du rectangle = : "+ rectangle.calculPerimetre());

    }
}

