package tp3;

import java.util.Random;
import outils.Clavier;

public class CorrectionExercice2 {
    /**
     * Trouver le plus grand nombre entre 2 ( if + else ) Trouver le plus grand
     * nombre entre 2 ( if ) Trouver le plus grand nombre entre 4
     * 
     * @param args
     */
    public static void main(String[] args) {
        int nombre1;
        int nombre2;
        
        //System.out.println("Veuillez saisir le premier nombre"); nombre1 =
        //Clavier.lireInt(); System.out.println("Veuillez saisir le second nombre");
         nombre2 = Clavier.lireInt();
        //System.out.println("Le plus grand des deux est " + lePlusGrandDesDeux(5, 2));
        //System.out.println("Le plus grand des deux est " + lePlusGrandDesDeux(2, 5));
        //System.out.println("Le plus grand des deux est " + lePlusGrandDesDeux(5, 5));
      
        System.out.println("Test 1 " + (lePlusGrandDesQuatreter(1, 3, 5, 8) == 8));
        System.out.println("Test 2 " + (lePlusGrandDesQuatreter(10, 3, 5, 8) == 10));
        System.out.println("Test 3 " + (lePlusGrandDesQuatreter(1, 9, 5, 8) == 9));
        int a = 1;
        System.out.println("Test 4 " + (lePlusGrandDesQuatreter(a, 9, 12, 8) == 12));
        System.out.println(a);
        // lePlusGrandDesDeuxbis(nombre1, nombre2);

    }

    public static int lePlusGrandDesDeux(int nombre1, int nombre2) {
        int resultat;

        if (nombre1 > nombre2) {
            resultat = nombre1;
        } else {
            resultat = nombre2;
        }

        return resultat;
    }

    public static int lePlusGrandDesDeuxbis(int nombre1, int nombre2) {
    	// version préférée
        int lePlusGrand;
        lePlusGrand = nombre2;

        if (nombre1 > nombre2) {
            lePlusGrand = nombre1;
        }
        return lePlusGrand;
    }

    public static int lePlusGrandDesDeuxReturn(int nombre1, int nombre2) {
        if (nombre1 > nombre2) {
            return nombre1;
        }
        return nombre2;
    }
    public static int lePlusGrandDesDeuxTernaire(int nombre1, int nombre2) {
        int result = (nombre1 > nombre2) ? nombre1 : nombre2;
        // return (nombre1 > nombre2)?nombre1:nombre2;
        return result;
    }
    public static int lePlusGrandDesQuatre(int nombre1, int nombre2, int nombre3, int nombre4) {

        int lePlusGrand1;
        int lePlusGrand2;
        int lePlusGrand;
        lePlusGrand1 = nombre2;
        lePlusGrand2 = nombre4;
        if (nombre1 > nombre2) {
            lePlusGrand1 = nombre1;
        }
        if (nombre3 > nombre4) {
            lePlusGrand2 = nombre3;
        }
        lePlusGrand = lePlusGrand2;
        if (lePlusGrand1 > lePlusGrand2) {
            lePlusGrand = lePlusGrand1;
        }
        return lePlusGrand;
    }

    public static int lePlusGrandDesQuatrebis(int nombre1, int nombre2, int nombre3, int nombre4) {
        int lePlusGrand = nombre1;

        if (lePlusGrand < nombre2) {
            lePlusGrand = nombre2;
        }
        if (lePlusGrand < nombre3) {
            lePlusGrand = nombre3;
        }
        if (lePlusGrand < nombre4) {
            lePlusGrand = nombre4;
        }
        return lePlusGrand;
    }
    
    public static int lePlusGrandDesQuatreter(int nombre1, int nombre2, int nombre3, int nombre4) {
        if (nombre1 < nombre2) {
            nombre1 = nombre2;
        }
        if (nombre1 < nombre3) {
            nombre1 = nombre3;
        }
        if (nombre1 < nombre4) {
            nombre1 = nombre4;
        }
        return nombre1;
    }
}