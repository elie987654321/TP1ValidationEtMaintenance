package TestUnitaires;

import App.*;

import org.junit.jupiter.api.*;

import java.text.MessageFormat;
import java.time.Duration;
import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class PaquetTest {

    private Paquet paquetTest;
    private static Instant startedAt;

    @BeforeEach
    public void initPaquetTest() {
        paquetTest = new Paquet();
    }

    @AfterEach
    public void undefPaquetTest() {
        paquetTest = null;
    }

    @BeforeAll
    static public void initStartingTime() {
        startedAt = Instant.now();
    }

    @AfterAll
    static public void showTestDuration() {
        Instant endedAt = Instant.now();
        long duration = Duration.between(startedAt, endedAt).toMillis();
        System.out.println(MessageFormat.format("Durée des tests : {0} ms", duration));
    }

    @Test
    void initPaquet_remplitUnPaquetde52Cartes() {
        // GIVEN
        int nombreDeCartes = 0;

        // WHEN
        paquetTest.initPaquet();
        for(Carte carte : paquetTest.getCartes()) {
            if (carte  instanceof Carte){
                nombreDeCartes++;
            }
        }

        // THEN
        assertEquals(nombreDeCartes, 52);
        for(Carte carte : paquetTest.getCartes())
        {
            System.out.println(carte.getNom() + " "+ carte.getValeur());
        }
    }

    @Test
    void piger_unPaquet_retourneUneCarte() {
        // GIVEN
        paquetTest.initPaquet();

        // WHEN
        Carte resultat = paquetTest.piger();

        // THEN
        Assertions.assertEquals(resultat.getClass(), Carte.class);
        System.out.println(resultat.getNom() + " "+ resultat.getValeur());
    }

    @Test
    void piger_unPaquetVide_retourneRien() {
        // GIVEN

        // WHEN
        Carte resultat = paquetTest.piger();

        // THEN
        Assertions.assertEquals(resultat, null);
    }

    @Test
    void piger_unPaquet_enleveLaCarteDuPaquet() {
        // GIVEN
        paquetTest.initPaquet();
        int nombreDeCartes = 0;

        // WHEN
        Carte resultat = paquetTest.piger();
        for(Carte carte : paquetTest.getCartes()) {
            if (carte != resultat) {
                nombreDeCartes++;
            }
        }

        // THEN
        assertEquals(nombreDeCartes, 51);
        System.out.println("La carte enlevee " + resultat.getNom() + " "+ resultat.getValeur() + "\n");
        System.out.println("Le reste du paquet:");
        for(Carte carte : paquetTest.getCartes())
        {
            System.out.println(carte.getNom() + " "+ carte.getValeur());
        }
    }
}