package tpCompteBancaire;

import java.util.Scanner;

public class CompteBancaire {
	
	private Integer numCompte;
	private String nomCompte;
	private float solde;
	
	/**
	 * @param numCompte
	 * @param nomCompte
	 * @param solde
	 */
	public CompteBancaire(Integer numCompte, String nomCompte, float solde) {
		this.numCompte = numCompte;
		this.nomCompte = nomCompte;
		this.solde = solde;
	}

	public CompteBancaire() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the numCompte
	 */
	public Integer getNumCompte() {
		return numCompte;
	}

	/**
	 * @param numCompte the numCompte to set
	 */
	public void setNumCompte(Integer numCompte) {
		this.numCompte = numCompte;
	}

	/**
	 * @return the nomCompte
	 */
	public String getNomCompte() {
		return nomCompte;
	}

	/**
	 * @param nomCompte the nomCompte to set
	 */
	public void setNomCompte(String nomCompte) {
		this.nomCompte = nomCompte;
	}

	/**
	 * @return the solde
	 */
	public float getSolde() {
		return solde;
	}

	/**
	 * @param solde the solde to set
	 */
	public void setSolde(float solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "CompteBancaire [numCompte=" + numCompte + ", nomCompte=" + nomCompte + ", solde=" + solde + "]";
	}
	
	
	public void saisieDesInformationsBancaires() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisie du numéro de compte");
		int scNumCompte = sc.nextInt();
		this.setNumCompte(scNumCompte);
		
		sc.nextLine(); // <---- Replace le curseur
		
		System.out.println("Saisie du nom du compte");
		String scNomCompte = sc.nextLine();
		this.setNomCompte(scNomCompte);
		
		System.out.println("Saisie du solde");
		float scSoldeCompte = sc.nextFloat();
		this.setSolde(scSoldeCompte);
	}
	
	public void affichageDesInformations() {
		System.out.println("Numéro de compte : "+ this.numCompte);
		System.out.println("Nom de compte : "+ this.nomCompte);
		System.out.println("Solde : "+ this.solde);
	}

}
