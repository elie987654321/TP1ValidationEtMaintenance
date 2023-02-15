import java.util.Arrays;

public class Carte {

    // Attributs
    private String nom;
    private int valeur;

    // Constructeur
    public Carte(String nom, int valeur) {
        this.nom = nom;
        this.valeur = valeur;
    }

    // Accesseurs et mutateurs
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

}
