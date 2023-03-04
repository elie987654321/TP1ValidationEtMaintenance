import java.util.ArrayList;

public class Partie {

    // Attributs
    private Joueur banquier;
    private Joueur joueur;
    private Paquet paquet;


    // Constructeur
    public Partie() {
        this.banquier = new Joueur();
        this.joueur = new Joueur();
        this.paquet = new Paquet();
    }

    // Accesseurs et mutateurs
    public Joueur getBanquier() {
        return banquier;
    }

    public void setBanquier(Joueur banquier) {
        this.banquier = banquier;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public Paquet getPaquet() {
        return paquet;
    }

    public void setPaquet(Paquet paquet) {
        this.paquet = paquet;
    }



    public void distribiuerCartesInitials()
    {

    }


    // Regarde si la partie est terminee ou non
    public void deciderVainqueur()
    {

    }

    public void jouerBanquier()
    {

    }

    public void jouerJoueur()
    {

    }
}