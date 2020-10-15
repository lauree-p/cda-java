package tpCompteBancaire;

import java.util.Scanner;

public class Client {

	String nom;
	String prenom;
	String adresseLigne1;
	String adresseLigne2;
	String adresseCP;
	String adresseVille;
	String dateDeNaissance;
//	GregorianCalendar dateDeNaissance;

	public Client() {
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param adresseLigne1
	 * @param adresseLigne2
	 * @param adresseCP
	 * @param adresseVille
	 * @param dateDeNaissance
	 */
	public Client(String nom, String prenom, String adresseLigne1, String adresseLigne2, String adresseCP,
			String adresseVille, String dateDeNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresseLigne1 = adresseLigne1;
		this.adresseLigne2 = adresseLigne2;
		this.adresseCP = adresseCP;
		this.adresseVille = adresseVille;
		this.dateDeNaissance = dateDeNaissance;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the adresseLigne1
	 */
	public String getAdresseLigne1() {
		return adresseLigne1;
	}

	/**
	 * @param adresseLigne1 the adresseLigne1 to set
	 */
	public void setAdresseLigne1(String adresseLigne1) {
		this.adresseLigne1 = adresseLigne1;
	}

	/**
	 * @return the adresseLigne2
	 */
	public String getAdresseLigne2() {
		return adresseLigne2;
	}

	/**
	 * @param adresseLigne2 the adresseLigne2 to set
	 */
	public void setAdresseLigne2(String adresseLigne2) {
		this.adresseLigne2 = adresseLigne2;
	}

	/**
	 * @return the adresseCP
	 */
	public String getAdresseCP() {
		return adresseCP;
	}

	/**
	 * @param adresseCP the adresseCP to set
	 */
	public void setAdresseCP(String adresseCP) {
		this.adresseCP = adresseCP;
	}

	/**
	 * @return the adresseVille
	 */
	public String getAdresseVille() {
		return adresseVille;
	}

	/**
	 * @param adresseVille the adresseVille to set
	 */
	public void setAdresseVille(String adresseVille) {
		this.adresseVille = adresseVille;
	}

	/**
	 * @return the dateDeNaissance
	 */
	public String getDateDeNaissance() {
		return dateDeNaissance;
	}

	/**
	 * @param dateDeNaissance the dateDeNaissance to set
	 */
	public void setDateDeNaissance(String dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public void saisieNom() {
		System.out.println("Saisie du nom");
		Scanner sc = new Scanner(System.in);
		String scNom = sc.nextLine(); 
		this.setNom(scNom);
	}

	public void saisiePrenom() {
		System.out.println("Saisie du prénom");
		Scanner sc = new Scanner(System.in);
		String scPrenom = sc.nextLine(); 
		this.setPrenom(scPrenom);
		
	}

	public void saisieAdresseCP() {
		System.out.println("Saisie du code CP");
		Scanner sc = new Scanner(System.in);
		String scAdresseCP = sc.nextLine();
		this.setAdresseCP(scAdresseCP);
	}

	public void saisieDateDeNaissance() {
		System.out.println("Saisie de la date de naissance");
		Scanner sc = new Scanner(System.in);
		String scDateDeNaissance = sc.nextLine();
		this.setDateDeNaissance(scDateDeNaissance);
	}

	public void saisieAdresseLigne1() {
		System.out.println("Saisie adresse ligne 1");
		Scanner sc = new Scanner(System.in);
		String scAdresseLigne1 = sc.nextLine();
		this.setAdresseLigne1(scAdresseLigne1);
	}

	public void saisieAdresseLigne2() {
		System.out.println("Saisie adresse ligne 2");
		Scanner sc = new Scanner(System.in);
		String scAdresseLigne2 = sc.nextLine();
		this.setAdresseLigne2(scAdresseLigne2);
	}
	
	public void saisieAdresseVille() {
		System.out.println("Saisie adresse ville");
		Scanner sc = new Scanner(System.in);
		String scAdresseVille = sc.nextLine();
		this.setAdresseVille(scAdresseVille);
	}

	public void saisieDesInformationsClient() {
		this.saisieNom();
		this.saisiePrenom();
		this.saisieAdresseLigne1();
		this.saisieAdresseLigne2();
		this.saisieAdresseCP();
		this.saisieAdresseVille();
		this.saisieDateDeNaissance();
	}

	public void affichageDesInformationsClient() {
		System.out.println(this.nom);
		System.out.println(this.prenom);
		System.out.println(this.adresseLigne1);
		System.out.println(this.adresseLigne2);
		System.out.println(this.adresseCP);
		System.out.println(this.adresseVille);
		System.out.println(this.dateDeNaissance);
		
	}
	
	
	
	
}
