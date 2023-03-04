

package TestUnitaires;

import App.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PartieTest {

    private Partie partieTest;

    Carte asPique;
    Carte dixPique;


    @BeforeAll
    public void InitCartes()
    {
         asPique = new Carte("As de pique", 11);
         dixPique = new Carte("Dix de pique" , 10);
    }

    @BeforeEach
    public void InitPartie()
    {
          partieTest = new Partie();
    }

    @Test
    public void TestDeciderVainqueurJoueurPlusDePoint()
    {
        //Le joueur a plus de points que le banquier - le joueur gagne
        partieTest = new Partie();

        partieTest.getJoueur().piger(asPique);
        partieTest.getBanquier().piger(dixPique);

        assert(partieTest.DeciderVainqueur() == 'J');
    }

    @Test
    public void TestDeciderVainqueurBanquierPlusDePoint()
    {
        //Le banquier a plus de points que le joueur - le banquier gagne
        partieTest.getJoueur().piger(dixPique);
        partieTest.getJoueur().piger(dixPique);
        partieTest.getBanquier().piger(dixPique);
        partieTest.getBanquier().piger(asPique);

        assert(partieTest.DeciderVainqueur() == 'B');
    }

    @Test
    public void TestDeciderVainqueurEgalDePoint()
    {
        //Egalite - Le joueur gagne
        partieTest = new Partie();

        partieTest.getJoueur().piger(dixPique);
        partieTest.getBanquier().piger(dixPique);

        assert (partieTest.DeciderVainqueur() == 'J');
    }

    @Test
    public void TestDeciderVainqueurJoueurDepasse()
    {
        //Le joueur depasse - le banquier gagne
        partieTest = new Partie();

        partieTest.getJoueur().piger(asPique);
        partieTest.getJoueur().piger(asPique);

        assert (partieTest.DeciderVainqueur() == 'B');
    }

    @Test
    public void TestDeciderVainqueurBanquierDepasse()
    {

        //Le banquier depasse - le joueur gagne
        partieTest = new Partie();

        partieTest.getBanquier().piger(asPique);
        partieTest.getBanquier().piger(asPique);

        assert (partieTest.DeciderVainqueur() == 'J');
    }

    //Verifie que la fonction donne bien deux carte au joueur et deux cartes au banquier
    @Test
    public void TestDistribiuerCartesInitials()
    {
        //GIVEN

        int nbCarteJoueur;
        int nbCarteBanquier;
        int nbCartePaquet;

        //WHEN
        partieTest.DistribuerCartesInitials();
        nbCarteJoueur = partieTest.getJoueur().getMainDu21().size();
        nbCarteBanquier = partieTest.getBanquier().getMainDu21().size();
        nbCartePaquet = partieTest.getPaquet().getCartes().size();

        //THEN
        assertEquals(nbCarteJoueur, 2);
        assertEquals(nbCarteBanquier, 2);
        assertEquals(nbCartePaquet, 48);
    }



    @Test
    public void TestPigerCarteJoueur()
    {
        //GIVEN

        //WHEN
        partieTest.PigerCarteJoueur();

        //THEN
        assert(partieTest.getJoueur().getMainDu21().size() == 1);
    }

    @Test
    public void TestPigerCarteBanquier()
    {
        //GIVEN

        //WHEN
        partieTest.PigerCarteBanquier();

        //THEN
        assert(partieTest.getBanquier().getMainDu21().size() == 1);
    }
}