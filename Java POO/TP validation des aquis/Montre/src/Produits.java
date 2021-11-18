public class Produits {
    private int prixDeBase;
    private String nom;



}
public class Bracelets {
    private String type;
    private int prix;

    public Bracelets(String type) {
        if (type == "cuire") {
            this.type = type;
            this.prix = 20;
        }
        if (type == "argent") {
            this.type = type;
            this.prix = 25;
        }
        if (type == "or") {
            this.type = type;
            this.prix = 200;
        }
    }
}
public class Fermoir {
    private String type;
    private int prix;

    public Fermoir(String type) {
        if (type == "cuivre") {
            this.type = type;
            this.prix = 20;
        }
        if (type == "argent") {
            this.type = type;
            this.prix = 25;
        }
        if (type == "or") {
            this.type = type;
            this.prix = 200;
        }
    }
}

public class Montre{

    }
}

class test{
    public static void main(String[] args) {
        Montre swatch = new Montre()
    }
}