import java.util.ArrayList;

public class Joueur {

    // Attributs
    private ArrayList<Carte> mainDu21;
    private int points;

    // Constructeur par défaut
    public Joueur() {
        this.mainDu21 = new ArrayList<Carte>();
        this.points = 0;
    }

    // Constructeur complet
    public Joueur(ArrayList<Carte> mainDu21, int points) {
        this.mainDu21 = mainDu21;
        this.points = points;
    }

    // Accesseurs et mutateurs
    public ArrayList<Carte> getMainDu21() {
        return mainDu21;
    }

    public void setMainDu21(ArrayList<Carte> mainDu21) {
        this.mainDu21 = mainDu21;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    // Methodes
    public void conserver(){

    }

    public void piger(){

    }

    // Tostring
    @Override
    public String toString() {
        return "Joueur{" +
                "mainDu21=" + mainDu21 +
                ", points=" + points +
                '}';
    }
}
