package initiation;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Commentaire sur votre class
 * @author LaurÃ©e
 */

//------------ PremiÃ¨re classe ------------

public class Initiation {

    /**
    * @param args commentaire sur les arguments
    */
	public static void main(String[] args) {
		
		// ici votre code !!!
		
		// 1------------ ExÃ©cution ------------
		
		// Pour constater une exeÌ?cution, nous avons besoin d'un affichage.
		
		System.out.print("Hello World");
		
		/**
		 * System est une classe de java qui appartient au package java.lang. 
		 * Il est installeÌ? par deÌ?fault, vous n'avez pas aÌ€ l'importer.
		 * Out est une meÌ?thode de la classe System. 
		 * Elle est appeleÌ?e en preÌ?cisant le nom de la classe devant le nom de la meÌ?thode, seÌ?pareÌ? par un point. 
		 * CÌ§a signifie qu'on va sortir du systeÌ€me. 
		 * Print est une meÌ?thode qui affiche dans la console son parameÌ€tre. 
		 */
		
		// 2------------ Affichez du texte ------------
		
		/**
		 * TODO Essayez les diffeÌ?rentes mise en forme sur votre texte : print permet d'afficher.
		 * println permet d'afficher et d'aller aÌ€ la ligne.
		 */
		
		// \n permet d'aller aÌ€ la ligne.
		
		System.out.println("Hello World,\nnous sommes le 22/08/2020 ");
		
		// \r permet un retour de chariot
		
		System.out.println("Hello World,\r nous sommes le 22/08/2020 ");
		
		// \t permet une tabulation
		
		System.out.println("Hello World,\t nous sommes le 22/08/2020 ");
		
		/**
		 * TODO Essayez ces diffeÌ?rentes deÌ?clarations variables :
		 */
		
		System.out.print("Hello World"); System.out.print("Aujourd'hui, nous sommes le 22 aout 2020");
		System.out.println("Hello World"); System.out.print("Aujourd'hui, nous sommes le 22 aout 2020 \n");

		// PremiÃ¨re possibilitÃ©
		
		String phrase;
		phrase = "Hello World";
		
		// DeuxiÃ¨me possibilitÃ©
		
		String phrase2 = new String();
		phrase2 = "Hello World";
		
		// TroisÃ¨me possibilitÃ©
		
		String phrase3 = "Hello World";
		
		// QuatriÃ¨me possibilitÃ©
		
		String phrase4 = new String("Hello World");
		
		/**
		 * String est une classe de java impleÌ?menteÌ?e par deÌ?faut. Elle permet de manipuler des chaiÌ‚ne de caracteÌ€re.
		 * new est un constructeur d'objet il permet d'instancier un objet de la classe indiqueÌ?e, ici String.
		 */
		
		// Essayez la concateÌ?nation.
		
		int jour = 22;
		String mois = "AoÃ»t";
		int annee = 2020;
		System.out.print("Aujourd'hui, nous sommes le "+ jour +" "+ mois +" " +annee +"\n");
		
		hello("Bob");
		
		// 3 - TODO
		
		System.out.println(bonjour("Bob"));
		
		// 5 - TODO
		Date maDate = new Date();
	    Long time = maDate.getTime();
	    System.out.println(time);
	    System.out.println(maDate.getClass());
	    System.out.println(time.getClass());
	    
	    afficheDate(maDate);
	    
		// FIN de la mÃ©thode principale (main)
	}
	
	// 3------------ Premiere mÃ©thodes ------------
	
	// ! Attention de bien deÌ?finir la meÌ?thode en dehors de la meÌ?thode principale mais aÌ€ lâ€™inteÌ?rieur de la classe.
	
	/**
	 * s est notre parameÌ€tre. Il est de type String.
	 * Vous devez le preÌ?cisez lors de la deÌ?finition de la meÌ?thode.
	 * D'ailleurs, la meÌ?thode n'acceptera rien d'autre en parameÌ€tre et provoquera une erreur.
	 * void indique que la fonction ne retourne rien.
	 * 
	 * Dit hello Ã  une personne
	 * @param s
	 */
	public static void hello(String s){ 
		System.out.println("Hello "+s);
	}
	
	/*
	 * TODO : CrÃ©er la fonction Â« bonjour Â» pour qu'elle retourne du texte.
	 * 
	 * void est remplaceÌ? par le type qui est retourneÌ?.
	 * Ici : String. Le mot-clef return sort de la meÌ?thode est retourne ce qui lui succeÌ€de.
	 * 
	 * RÃ©sultat attendu : Lorsque vous exÃ©cutez cela dans le main :
	 * System.out.println (bonjour("Bob"));
	 * 
	 * Vous obtenez cela :
	 * 
	 * Bonjour Bob !
	 * 
	 * Nâ€™oubliez pas d'indenter vos sources ( faire des retraits). Vous y gagnerez en clartÃ©, lisibilitÃ©.
	 */
	
	/**
	 * Dit bonjour Ã  une personne
	 * @param s prÃ©nom
	 * @return string
	 */
	public static String bonjour(String s){ 
		return "Bonjour " + s + " !";
	}
	
	// 4------------ Commentez vos mÃ©thodes ------------
	
	/**
	 * Pour que le code reste clair, il est nÃ©cessaire de le commenter. 
	 * 
	 * Commencez aÌ€ tapez /** au dessus de la meÌ?thode, puis entrer. Cela geÌ?neÌ€re automatiquement le commentaire.
	 * 
	 * Pour voir le commentaire d'une meÌ?thode il suffit de laisser le pointeur sur le nom de la meÌ?thode 
	 * tout en maintenant le bouton Ctrl enfonceÌ?.
	 * 
	 * VeÌ?rifiez l'affichage de vos commentaire. En survolant, l'appel de vos meÌ?thodes
	 */
	
	// 5------------ Importation de bibliothÃ¨que ------------
	
	/**
	 * Certain objet comme les dates par exemple, nÃ©cessite l'importation d'une bibliotheÌ€que.
	 * TODO Juste apreÌ€s package, avant la deÌ?finition de la classe. Faites appel aÌ€ l'importation.
	 * 
	 * package initiation;
	 * import java.util.Date;
	 * Vous pourrez ensuite Ã©crire la fonction :
	 */
	
	/**
	* Affiche la date d'aujourd'hui 
	*/
	public static void aujourdhui(){
	    Date maDate = new Date();
	    System.out.println("aujourd'hui nous sommes le " + maDate);
	}
	
	/**
	 * Quand vous ne connaissez pas un objet servez vous de la documentation et de l'autocomplÃ©tion (Ctrl + espace)
	 * pour voir les mÃ©thodes qui peuvent Ãªtre appliquez Ã  un objet.
	 * On peut maintenant faire appelle Ã  des mÃ©thodes qui sont propres Ã  cette classe.
	 * 
	 * 	    long time = maDate.getTime();
	 * 
	 * Cette meÌ?thode retourne le nombre de millisecondes depuis 01/01/1970.
	 * La gestion de date et dâ€™heure a longtemps eÌ?teÌ? la beÌ‚te noire des deÌ?veloppeurs Java.
	 * Il est vrai que le probleÌ€me est complexe. Travailler en base 60 pour les secondes et les minutes puis en base 24
	 * pour les heures nâ€™est pas treÌ€s simple.
	 * 
	 * Mais la palme revient aÌ€ la gestion des mois qui nâ€™ont pas tous le meÌ‚me nombre de jours, voir pire puisque certains
	 * mois ont un nombre de jours variable suivant les anneÌ?es. Les ordinateurs utilisent une technique diffeÌ?rente, 
	 * en ne travaillant pas directement avec des dates et heures mais en nombre de secondes ou de millisecondes 
	 * depuis une date de reÌ?feÌ?rence (geÌ?neÌ?ralement le 1er janvier 1970 aÌ€ 0 heure).
	 * 
	 * Ce mode de repreÌ?sentation nâ€™est cependant pas treÌ€s pratique pour un humain.
	 * La valeur 1597753879831 nâ€™est pas treÌ€s eÌ?vocatrice, par contre 22/8/2020 est beaucoup plus parlant. 
	 * Câ€™est pourquoi de nombreuses fonctions permettent le passage dâ€™un format aÌ€ lâ€™autre.
	 *
	 */

	/* 
	 * TODO
	 * 
	 * 5.1. Afficher votre variable time
	 * 
	 * 5.2 Utilisez la mÃ©thode getClass qui donne la nature de l'objet Date, puis l'afficher. Trouver le moyen de faire
	 * la mÃªme chose avec votre variable time.
	 * 
	 * Il n'est pas neÌ?cessaire de connaiÌ‚tre tous les noms des classes utiliseÌ?es. 
	 * Il faut savoir importer des classes, selon votre besoin.
	 * 
	 * 5.3 CrÃ©er la fonction afficheDate(Date uneDate) qui affichera une date donnÃ©e en paramÃ©tre au format "dd MM yyyy".
	 * Pour cela vous utiliserez une nouvelle classe, SimpleDateFormat (qu'il faudra donc importer).
	 * Faites une recherche pour voir comment fonctionne cette classe.
	 * Vous pourrez ensuite faire appel Ã  cette nouvelle fonction.
	 */
	
	// 5.3 - TODO
	
	/**
	 * Affiche une date donnÃ©e au format "dd MM yyyy"
	 * @param Date uneDate
	 */
	public static void afficheDate(Date uneDate) {
		SimpleDateFormat monFormat = new SimpleDateFormat("dd MM yyyy");
		System.out.println(monFormat.format(uneDate));
	}
	
	/**
	 * format() est une mÃ©thode de la classe SimpleDateFormat
	 * "dd" <=> day
	 * "MM" <=> month
	 * "yyyy" <=> year
	 */

}
