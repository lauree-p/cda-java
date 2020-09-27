package tp1;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @author LAU.POUSSIN
 */

public class Tp1 {

	public static void main(String[] args) {
		
		tp1();
		
		stringToDate(demandeDateNaissance());
	}
	
	public static void tp1() {
		// Affiche hello();
	    System.out.println(hello("Bob"));
	    
	    // Fonction aujourd'hui
	    aujourdhui();
	    
	    // Affiche aujourd'huii
	    System.out.println(aujourdhui());
	    
	    // Fonction afficheDate
	    afficheDate(aujourdhui());
	    
	    // Fonction etatCivil
	    // afficheEtatCivil("Poussin","Laurélenne","09 09 1994","Béziers");
	    
	    // Fonction etatCivil
	    afficheEtatCivil(demandeNom(),demandePrenom(),demandeDateNaissance(),demandeLieuNaissance());
	}

	/**
	 * Dire bonjour
	 * @param s
	 * @return String
	 */
	public static String hello(String s){ 
		return "Bonjour "+s;
	}
	
	/**
	 * Retourne la date d'aujourd'hui
	 * @return Date
	 */
	public static Date aujourdhui() {
		Date maDate = new Date();
		return maDate;
	}
	
	/**
	 * Prend une date en paramètre la convertie en long 
	 * @param date
	 * @return long
	 */
	public static long maDateToLong(Date pdate) {
		long dateToLong = pdate.getTime();
		System.out.println(dateToLong);
		return dateToLong;
	}

	/**
	 * Prend une date en paramètre la convertie au format dd/MM/yyyy et l"affiche
	 * @param Date
	 */
	public static void afficheDate(Date pmaDate) {
		SimpleDateFormat monFormat= new SimpleDateFormat("dd MM yyyy");
		System.out.println(monFormat.format(pmaDate));
	}
	
	/**
	 * Affiche le sur la première ligne votre nom et votre pre�?nom
	 * Affiche sur la deuxième votre date de naissance
	 * Affiche sur la troisième votre ville de naissance
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param villeNaissance
	 */
	public static void afficheEtatCivil(String pnom, String pprenom, String pdateNaissance, String pvilleNaissance) {
		System.out.println("Vous avez bien saisi toutes vos informations personnelles ! Merci !");
		System.out.println("VOTRE ETAT CIVIL :");
		System.out.println(pnom+" "+pprenom);
		System.out.println(pdateNaissance);
		System.out.println(pvilleNaissance);
	}
	
	/**
	 * Demande le nom à l'user
	 * @return String
	 */
	public static String demandeNom() {
		System.out.println("Quel est votre nom ?");
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		String votreNom = sc.nextLine();
		return votreNom;
	}

	/**
	 * Demande son prénom à l'user
	 * @return String
	 */
	public static String demandePrenom() {
		System.out.println("Quel est votre prénom ?");
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		String votrePrenom = sc.nextLine();
		return votrePrenom;
	}
	
	/**
	 * Demande sa date de naissance à l'user
	 * @return String
	 */
	public static String demandeDateNaissance() {
		System.out.println("Quel est votre date de naissance ? Format : dd/MM/yyyy");
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		String votreDateNaissance = sc.nextLine();
		return votreDateNaissance;
	}
	
	/**
	 * Demande son lieu de naissance à l'user
	 * @return String
	 */
	public static String demandeLieuNaissance() {
		System.out.println("Quel est votre lieu de naissance ?");
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		String votreLieuNaissance = sc.nextLine();
		return votreLieuNaissance;
	}
	
	/**
	 * Convertir le String date de naissance en Date 
	 * Tant que le format n'est pas valide on redemande à l'user
	 * @param pdateNaissance
	 */
	public static void stringToDate(String pdateNaissance){ 
		
	    boolean valid = false;
	    
	    while (valid == false) {
			try {
				Date ddateNaissance = new SimpleDateFormat("dd/MM/yyyy").parse(pdateNaissance);
				System.out.println(pdateNaissance+"\n"+ddateNaissance);  
				valid = true;
			} 
			catch (ParseException e) {
				//e.printStackTrace();
				System.out.println("Mauvais Format recommencer svp !");  
				demandeDateNaissance();
			}  
	    }
	    
	}
}
