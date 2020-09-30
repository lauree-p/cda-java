package tp3;

import outils.Clavier;

public class CorrectionExercice1 {
    public static void main(String[] args) {
        
        System.out.println("Veuillez saisir votre note");
        double note = outils.Clavier.lireDouble();
        
        // test du code
        for(double i = -1; i <= 22; i = i + 0.5) {
            System.out.println("note : " + i);
            admissionNote(i);            
        }

    }
    
    public static void mention(double note) {
        String mention = "Vous avez la mention ";         // Méthode 2
        if(note >= 16 ) {
            mention += "très bien";
        } else if (note >= 14) {
            mention += "bien";
        } else if (note >= 12) {
            mention += "assez bien";
        }else {
            mention = "";
        }
        System.out.println(mention);
    }
    
    
    public static void admissionNote(double note) {

        String admission = "Vous êtes ";
        
        if ( note >= 0 &&  note <= 20)
        {
         
            if (note >= 10) {
                admission += "admis.";
                
                // mention
                mention(note);
                
            } else if (note >= 8) {
                admission += "sur liste d'attente";
            } else {
                admission += "refusé(e)";
    
            }
            
            // Affichage 
            System.out.println(admission);
            
        } else {
            System.out.println("Note invalide.");
        }
    }
}