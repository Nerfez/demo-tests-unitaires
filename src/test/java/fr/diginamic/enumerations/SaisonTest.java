package fr.diginamic.enumerations;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SaisonTest {

    @Test
    public void testValueOfLibelle() throws InterruptedException {
        String libelle = "Printemps";
        String libelle2 = "Automne";
        String libelle3 = "PasDeSaison";

        assertEquals(Saison.PRINTEMPS, Saison.valueOfLibelle(libelle));
        assertEquals(Saison.AUTOMNE, Saison.valueOfLibelle(libelle2));
        assertNull(Saison.valueOfLibelle(libelle3));
    }
}