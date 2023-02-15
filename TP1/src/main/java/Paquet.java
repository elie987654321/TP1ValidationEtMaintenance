import java.util.ArrayList;

public class Paquet {

    // Attributs
    private ArrayList<Carte> paquet;

    // Constructeur
    public Paquet() {
        this.paquet = new ArrayList<Carte>();
    }

    // Methode
    public void initPaquet(){
        this.paquet.add(new Carte("As de pique", 11));

    }

    public Carte piger(){
        return new Carte("As",11);
    }

    public void enleverCarte(Carte carte){

    }
}
