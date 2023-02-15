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

    // Methodes
    //
    public void donnerCarte(){

    }

    // Envoie c si le joueur veut conserver ou d s'il veut piger
    public void conserver(char decision){

    }

    // Regarde si la partie est terminee ou non
    public void deciderVainqueur(){

    }

    public void jouerBanquier(){

    }

    public void jouerJoueur(){

    }
}
