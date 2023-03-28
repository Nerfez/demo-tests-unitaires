package fr.diginamic.utils;

import static org.junit.Assert.*;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testLevenshteinDistance()
    {
        CharSequence char1 = "clement";
        CharSequence char2 = "clef";
        CharSequence char3 = "olivier";
        CharSequence char4 = "olive";

        int resultat = StringUtils.levenshteinDistance(char1,char2);
        int resultat2 = StringUtils.levenshteinDistance(char3,char4);
        int resultat3 = StringUtils.levenshteinDistance(char2,char4);
        int resultat4 = StringUtils.levenshteinDistance(null,char4);
        assertEquals(4, resultat);
        assertEquals(2, resultat2);
        assertEquals(4, resultat3);
        assertEquals(0, resultat4);
    }
}