package outils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateCustom {
	
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
		System.out.println("Saisissez une année");
		String annee = Clavier.lireString();
		return annee;
	}
	
	/**
	 *  Permet de saisir une date
	 * @throws ParseException 
	 */
	public static void saisirDate(String jour, String mois, String annee) {
		int iJour = Integer.parseInt(jour);
		int iMois = Integer.parseInt(mois);
		int iAnnee = Integer.parseInt(annee);
		boolean verif = true;

		if ((iAnnee < 1970) || (iAnnee < 2100)) {
		} else {
			System.out.println("Erreur année trop petite ou trop grande");
			verif = false;
		}
		if ((iJour > 0 && iJour < 32)) {
			if ((iJour == 31) && ((iMois != 1) || (iMois !=3) || (iMois != 5) || (iMois != 7) || (iMois != 7) || (iMois != 7)) ) {
				System.out.println("Erreur pas de jour 31 dans ce mois");
				verif = false;
			}
		} else {
			verif = false;
			System.out.println("Erreur jour > 31 ou plus petit que 1");
		}
			
		if ((iMois < 12) && (iMois > 0)) {
			if ((iMois == 2) && (iJour <= 29)) {
				if (iJour == 29) {
					if ((((iAnnee % 4) == 0) && ((iAnnee % 100) != 0)) || ((iAnnee % 400) == 0)) {
						System.out.println("Année bisexetille");
					} else {
						System.out.println("Année non Bisexetille");
						verif = false;
					}
				}
			}
			
		} else {
			verif = false;
			System.out.println("Erreur : mois > 12 ou mois< 0");
		}
		
		
		if (verif) {
			System.out.println("La date est bonne ! ");
			String sDate= jour + "/" + mois + "/" +annee;
		    SimpleDateFormat formate = new SimpleDateFormat("dd/MM/yyyy");
			try {
				Date date = formate.parse(sDate);
			    System.out.println(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("Erreur dans la date");
		}
	    
	}
	
	public static boolean bisextileOrNot(int annee) {
		boolean bisextile = false;
		if ((annee % 4) == 0 && (annee % 100) != 0 || (annee % 400) == 0 ) {
			bisextile = true;
		}
		return bisextile;
	}
	


}