package fr.diginamic.immobilier.entites;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Ma classe de test sur mes méthodes de la classe Maison
 */
public class MaisonTest {

    //Fixtures aurait peut être été souhaité ?

    @Test
    public void testAjouterPiece() {
        Maison maison = new Maison();
        Piece piece = new SalleDeBain(0,15);
        maison.ajouterPiece(piece);
        assertEquals(1,maison.nbPieces());

        maison.ajouterPiece(null);
        assertEquals(1,maison.nbPieces());
    }

    @Test
    public void testCalculerSurface() {
        Maison maison = new Maison();
        Piece piece = new SalleDeBain(0,15);
        Piece piece2 = new Salon(0,25);
        maison.ajouterPiece(piece);
        maison.ajouterPiece(piece2);
        double resultat = 40.0;
        assertEquals(String.valueOf(resultat),String.valueOf(maison.calculerSurface()));

        maison.ajouterPiece(null);
        assertEquals(String.valueOf(resultat),String.valueOf(maison.calculerSurface()));
    }

    @Test
    public void testSuperficieTypePiece() {
        Maison maison = new Maison();
        Piece piece = new Salon(0,15);
        Piece piece2 = new Salon(2,25);
        maison.ajouterPiece(piece);
        maison.ajouterPiece(piece2);
        assertEquals(String.valueOf(40.0),String.valueOf(maison.superficieTypePiece("Salon")));

        maison.ajouterPiece(null);
        assertEquals(String.valueOf(0.0),String.valueOf(maison.superficieTypePiece(null)));
    }

    @Test
    public void testSuperficieEtage() {
        Maison maison = new Maison();
        Piece piece = new Salon(0,15);
        Piece piece2 = new Salon(2,25);
        maison.ajouterPiece(piece);
        maison.ajouterPiece(piece2);
        maison.ajouterPiece(null);
        assertEquals(String.valueOf(25.0),String.valueOf(maison.superficieEtage(2)));
    }
}