import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JoueurTest {

    private Joueur joueurTest;

    @BeforeEach
    public void initJoueur()
    {
        this.joueurTest = new Joueur();
    }

    @Test
    public void TestAjoutValeur()
    {
        //GIVEN
        Carte carte = new Carte("As de pique",11);
        Carte carte2 = new Carte("Deux de pique", 2);

        //WHEN
        joueurTest.piger(carte);
        joueurTest.piger(carte2);

        //THEN
        Assertions.assertEquals(joueurTest.getPoints() , 13);

    }

    @Test
    public void TestAjoutCarte()
    {
        //GIVEN
        Carte carte = new Carte("As de pique",11);
        Carte carte2 = new Carte("Deux de pique", 2);

        //WHEN
        joueurTest.piger(carte);
        joueurTest.piger(carte2);

        //THEN
        Assertions.assertEquals(carte, joueurTest.getMainDu21().get(0));
        Assertions.assertEquals(carte2, joueurTest.getMainDu21().get(1));

    }

    @Test
    void testToString() {
        //GIVEN
        Carte carte = new Carte("As de pique",11);
        Carte carte2 = new Carte("Deux de pique", 2);

        //WHEN
        joueurTest.piger(carte);
        joueurTest.piger(carte2);


    }
}