package App;

import App.Joueur;
import App.Paquet;

public class main {

    public static void main(String args[]) {
        // Initialisation du paquet
        Paquet paquet = new Paquet();
        paquet.initPaquet();

        // Initialisation du banquier et joueur
        Joueur banquier = new Joueur();
        Joueur joueur = new Joueur();

        // Initialisation de la partie
        Partie partie = new Partie();
    }
}