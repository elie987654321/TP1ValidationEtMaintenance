import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

public class CarteTest {
    @Test
    public void TestEqualsVraisSiNomEtValeurIdentiques()
    {
        //GIVEN
        Carte carteTest1 = new Carte("As de pique", 11);
        Carte carteTest2 = new Carte("As de pique", 11);

        //WHEN
        boolean carteEgal = carteTest1.equals(carteTest2);

        //THEN
        Assertions.assertTrue(carteEgal);
    }

    @Test
    public void TestEqualsFauxSiDeuxNomDifferent()
    {
        //GIVEN
        Carte carteTest1 = new Carte("As de trefle", 11);
        Carte carteTest2 = new Carte("As de pique", 11);

        //WHEN
        boolean carteEgal = carteTest1.equals(carteTest2);

        //THEN
        Assertions.assertFalse(carteEgal);
    }

    @Test
    public void TestEqualsFauxSiDeuxValeursDifferentes()
    {
        //GIVEN
        Carte carteTest1 = new Carte("As de pique", 11);
        Carte carteTest2 = new Carte("As de pique", 10);

        //WHEN
        boolean carteEgal = carteTest1.equals(carteTest2);

        //THEN
        Assertions.assertFalse(carteEgal);
    }

}
