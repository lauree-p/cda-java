package TP3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class maClassDate {
	
	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) {
		aujourdhui();
		maintenant();
		saisirDate(scanJour(),scanMois(),scanAnnee());
	}
	
	/**
	 *  Affiche la date d'ajourd'hui en console, dans le format : 21/09/2020
	 */
	public static void aujourdhui() {
		LocalDateTime myDateObj = LocalDateTime.now();
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println(formattedDate);
	}

	/**
	 *  Affiche l'heure de actuel
	 */
	public static void maintenant() {
		LocalDateTime myHourObj = LocalDateTime.now();
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formattedTime = myHourObj.format(timeFormat);
		System.out.println(formattedTime);
		
	}
	
	/**
	 *  Permet de saisir une date
	 * @throws ParseException 
	 */
	public static void saisirDate(String jour, String mois, String annee) {
		
		int iJour = Integer.parseInt(jour);
		int iMois = Integer.parseInt(mois);
		int iAnnee = Integer.parseInt(annee);
		
		
		
		// Si l'ann�e >= 1900 && l'ann�e =< 2100
			// Si le mois est inf�rieur ou egale � 12
				// Si le jour est inf�rieur ou egale a 31
					// Si le jour est egale a 31 et le mois est different de 1, 3, 5, 7, 9 ou 11
						// Erreur
					// Si le mois est egale � 2
						// Si le jour est superieur � 29
							// Erreur
						// Si le jour est egale � 29 est que l'ann�e n'est pas divisible par 4 et non divisible par 100 ou si l'annee est divisible par 400 
							// Erreur
				// Sinon 
					// Erreur
			// Sinon
				// Erreur
		// Sinon
			// Erreur
		
		if ((iAnnee > 1900) && (iAnnee < 2100)) {
			if (iMois <= 12) {
				if (iJour == 31 || iMois == 2) {
					if ((iMois != 1) || (iMois != 3) || (iMois != 5) || (iMois != 7) || (iMois != 9) || (iMois != 11)){
						System.out.println("ERROR : Le jour est egale a 31 et le mois est different de 1, 3, 5, 7, 9 ou 11");
					}
					if (iMois == 2) {
						if (iJour > 29) {
							System.out.println("ERROR : F�vrier n'a pas de jour > � 29");
						}
						if ((iJour == 29) && (((iAnnee % 4) != 0) && ((iAnnee % 100) != 0)) || ((iAnnee % 400) == 0)) {
							System.out.println("ERROR");
						}
					}
				}
			} 
			else {System.out.println("ERROR : Il n'y a pas de mois sup�rieur � 12");}
		} else {System.out.println("ERROR : Votre ann�e est p�rim�e");}
		
		
	    String sDate= jour + "/" + mois + "/" +annee;   
	    SimpleDateFormat formate = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date = formate.parse(sDate);
		    System.out.println(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//-------------------------------------
	
	public static String scanJour() {
		System.out.println("Saisissez un jour");
		String jour = Clavier.lireString();
		return jour;
	}

	public static String scanMois() {
		System.out.println("Saisissez un mois");
		String mois = Clavier.lireString();
		return mois;
	}
	
	public static String scanAnnee() {
		System.out.println("Saisissez une ann�e");
		String annee = Clavier.lireString();
		return annee;
	}

}