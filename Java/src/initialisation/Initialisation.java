package initialisation;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Commentaire sur votre class
 * @author Laurée
 */

//------------ Première classe ------------

public class Initialisation {

    /**
    * @param args commentaire sur les arguments
    */
	public static void main(String[] args) {
		
		// ici votre code !!!
		
		// 1------------ Exécution ------------
		
		// Pour constater une exécution, nous avons besoin d'un affichage.
		
		System.out.print("Hello World");
		
		/**
		 * System est une classe de java qui appartient au package java.lang. 
		 * Il est installé par défault, vous n'avez pas à l'importer.
		 * Out est une méthode de la classe System. 
		 * Elle est appelée en précisant le nom de la classe devant le nom de la méthode, séparé par un point. 
		 * Ça signifie qu'on va sortir du système. 
		 * Print est une méthode qui affiche dans la console son paramètre. 
		 */
		
		// 2------------ Affichez du texte ------------
		
		/**
		 * TODO Essayez les différentes mise en forme sur votre texte : print permet d'afficher.
		 * println permet d'afficher et d'aller à la ligne.
		 */
		
		// \n permet d'aller à la ligne.
		
		System.out.println("Hello World,\nnous sommes le 22/08/2020 ");
		
		// \r permet un retour de chariot
		
		System.out.println("Hello World,\r nous sommes le 22/08/2020 ");
		
		// \t permet une tabulation
		
		System.out.println("Hello World,\t nous sommes le 22/08/2020 ");
		
		/**
		 * TODO Essayez ces différentes déclarations variables :
		 */
		
		System.out.print("Hello World"); System.out.print("Aujourd'hui, nous sommes le 22 aout 2020");
		System.out.println("Hello World"); System.out.print("Aujourd'hui, nous sommes le 22 aout 2020 \n");

		// Première possibilité
		
		String phrase;
		phrase = "Hello World";
		
		// Deuxième possibilité
		
		String phrase2 = new String();
		phrase2 = "Hello World";
		
		// Troisème possibilité
		
		String phrase3 = "Hello World";
		
		// Quatrième possibilité
		
		String phrase4 = new String("Hello World");
		
		/**
		 * String est une classe de java implémentée par défaut. Elle permet de manipuler des chaîne de caractère.
		 * new est un constructeur d'objet il permet d'instancier un objet de la classe indiquée, ici String.
		 */
		
		// Essayez la concaténation.
		
		int jour = 22;
		String mois = "Août";
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
	    
		// FIN de la méthode principale (main)
	}
	
	// 3------------ Premiere méthodes ------------
	
	// ! Attention de bien définir la méthode en dehors de la méthode principale mais à l’intérieur de la classe.
	
	/**
	 * s est notre paramètre. Il est de type String.
	 * Vous devez le précisez lors de la définition de la méthode.
	 * D'ailleurs, la méthode n'acceptera rien d'autre en paramètre et provoquera une erreur.
	 * void indique que la fonction ne retourne rien.
	 * 
	 * Dit hello à une personne
	 * @param s
	 */
	public static void hello(String s){ 
		System.out.println("Hello "+s);
	}
	
	/*
	 * TODO : Créer la fonction « bonjour » pour qu'elle retourne du texte.
	 * 
	 * void est remplacé par le type qui est retourné.
	 * Ici : String. Le mot-clef return sort de la méthode est retourne ce qui lui succède.
	 * 
	 * Résultat attendu : Lorsque vous exécutez cela dans le main :
	 * System.out.println (bonjour("Bob"));
	 * 
	 * Vous obtenez cela :
	 * 
	 * Bonjour Bob !
	 * 
	 * N’oubliez pas d'indenter vos sources ( faire des retraits). Vous y gagnerez en clarté, lisibilité.
	 */
	
	/**
	 * Dit bonjour à une personne
	 * @param s prénom
	 * @return string
	 */
	public static String bonjour(String s){ 
		return "Bonjour " + s + " !";
	}
	
	// 4------------ Commentez vos méthodes ------------
	
	/**
	 * Pour que le code reste clair, il est nécessaire de le commenter. 
	 * 
	 * Commencez à tapez /** au dessus de la méthode, puis entrer. Cela génère automatiquement le commentaire.
	 * 
	 * Pour voir le commentaire d'une méthode il suffit de laisser le pointeur sur le nom de la méthode 
	 * tout en maintenant le bouton Ctrl enfoncé.
	 * 
	 * Vérifiez l'affichage de vos commentaire. En survolant, l'appel de vos méthodes
	 */
	
	// 5------------ Importation de bibliothèque ------------
	
	/**
	 * Certain objet comme les dates par exemple, nécessite l'importation d'une bibliothèque.
	 * TODO Juste après package, avant la définition de la classe. Faites appel à l'importation.
	 * 
	 * package initiation;
	 * import java.util.Date;
	 * Vous pourrez ensuite écrire la fonction :
	 */
	
	/**
	* Affiche la date d'aujourd'hui 
	*/
	public static void aujourdhui(){
	    Date maDate = new Date();
	    System.out.println("aujourd'hui nous sommes le " + maDate);
	}
	
	/**
	 * Quand vous ne connaissez pas un objet servez vous de la documentation et de l'autocomplétion (Ctrl + espace)
	 * pour voir les méthodes qui peuvent être appliquez à un objet.
	 * On peut maintenant faire appelle à des méthodes qui sont propres à cette classe.
	 * 
	 * 	    long time = maDate.getTime();
	 * 
	 * Cette méthode retourne le nombre de millisecondes depuis 01/01/1970.
	 * La gestion de date et d’heure a longtemps été la bête noire des développeurs Java.
	 * Il est vrai que le problème est complexe. Travailler en base 60 pour les secondes et les minutes puis en base 24
	 * pour les heures n’est pas très simple.
	 * 
	 * Mais la palme revient à la gestion des mois qui n’ont pas tous le même nombre de jours, voir pire puisque certains
	 * mois ont un nombre de jours variable suivant les années. Les ordinateurs utilisent une technique différente, 
	 * en ne travaillant pas directement avec des dates et heures mais en nombre de secondes ou de millisecondes 
	 * depuis une date de référence (généralement le 1er janvier 1970 à 0 heure).
	 * 
	 * Ce mode de représentation n’est cependant pas très pratique pour un humain.
	 * La valeur 1597753879831 n’est pas très évocatrice, par contre 22/8/2020 est beaucoup plus parlant. 
	 * C’est pourquoi de nombreuses fonctions permettent le passage d’un format à l’autre.
	 *
	 */

	/* 
	 * TODO
	 * 
	 * 5.1. Afficher votre variable time
	 * 
	 * 5.2 Utilisez la méthode getClass qui donne la nature de l'objet Date, puis l'afficher. Trouver le moyen de faire
	 * la même chose avec votre variable time.
	 * 
	 * Il n'est pas nécessaire de connaître tous les noms des classes utilisées. 
	 * Il faut savoir importer des classes, selon votre besoin.
	 * 
	 * 5.3 Créer la fonction afficheDate(Date uneDate) qui affichera une date donnée en paramétre au format "dd MM yyyy".
	 * Pour cela vous utiliserez une nouvelle classe, SimpleDateFormat (qu'il faudra donc importer).
	 * Faites une recherche pour voir comment fonctionne cette classe.
	 * Vous pourrez ensuite faire appel à cette nouvelle fonction.
	 */
	
	// 5.3 - TODO
	
	/**
	 * Affiche une date donnée au format "dd MM yyyy"
	 * @param Date uneDate
	 */
	public static void afficheDate(Date uneDate) {
		SimpleDateFormat monFormat = new SimpleDateFormat("dd MM yyyy");
		System.out.println(monFormat.format(uneDate));
	}
	
	/**
	 * format() est une méthode de la classe SimpleDateFormat
	 * "dd" <=> day
	 * "MM" <=> month
	 * "yyyy" <=> year
	 */

}
