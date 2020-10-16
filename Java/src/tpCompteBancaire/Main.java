package tpCompteBancaire;

public class Main {

	public static void main(String[] args) {
		
//		CompteBancaire compteBancaire = new CompteBancaire();
//		CompteBancaire compteBancaire1 = new CompteBancaire();
//		CompteBancaire compteBancaire2 = new CompteBancaire();
//		
//		System.out.println(compteBancaire);
//		System.out.println(compteBancaire1);
//		System.out.println(compteBancaire2);
//		
//		System.out.println("Saisisez une chaine");
//		Scanner sc = new Scanner(System.in);
//		String chaineLue = sc.nextLine();
//		System.out.println("Voici la chaîne saisie :" + chaineLue);
//		
//		// Changement de type
//		System.out.println("Saisissez un nombre");
//		int nombreLu = sc.nextInt();
//		System.out.println("Nombre : " + nombreLu);
//		
//		// Important
//		sc.nextLine(); // <---- Replace le curseur
//		
//		// Retour au String
//		System.out.println("Saisisez une nouvelle chaine :");
//		String reChaineLue = sc.nextLine();
//		System.out.println("Voici la chaîne saisie : " + reChaineLue);
//		sc.close();
		
//		CompteBancaire compteBancaire1 = new CompteBancaire();
//		CompteBancaire compteBancaire2 = new CompteBancaire();
//		CompteBancaire compteBancaire3 = new CompteBancaire();
//		
//		System.out.println("Information premier compte\n");
//		
//		compteBancaire1.saisieDesInformationsBancaires();
//		compteBancaire1.affichageDesInformations();
//		
//		System.out.println("Information seconde compte\n");
//		
//		compteBancaire2.saisieDesInformationsBancaires();
//		compteBancaire2.affichageDesInformations();
//		
//		System.out.println("Information troisième compte\n");
//		
//		compteBancaire3.saisieDesInformationsBancaires();
//		compteBancaire3.affichageDesInformations();
		
		Client client1 = new Client();
		Client client2 = new Client();
		Client client3 = new Client();
		
		client1.saisieDesInformationsClient();
		client1.affichageDesInformationsClient();
		
		client2.saisieDesInformationsClient();
		client2.affichageDesInformationsClient();
		
		client3.saisieDesInformationsClient();
		client3.affichageDesInformationsClient();
	}

}
