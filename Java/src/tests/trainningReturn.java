package tests;
import outils.Clavier;

public class trainningReturn {

	public static void main(String[] args) {
		 
//		string1();
//		int1();
//		deuxValeurs();
//		printEtValeur();
//		
//		String reString1 = string1();
//		int reInt1 = int1();
//		String rePrintEtValeur = printEtValeur();
		System.out.println("hello");
		inputUsergameMode();
		int gameMode2 = getGameMode();
		System.out.println(gameMode2);
	}

	public static String string1() {
		String string1 = "Je suis un string";
		return string1;
	}
	
	public static int int1() {
		int int1 = 15;
		return int1;
	}
	
	public static void deuxValeurs() {
		int int2 = 15;
		String string2 = "Je suis un string";
	}
	
	public static String printEtValeur() {
		int int3 = 15;
		String string3 = "Je suis un string";
		System.out.println(string3);
		
		return string3;
	}
	
	/**
	 * 
	 */
	public static int inputUsergameMode() {
		int inputGameMode = 0;
		System.out.println("Entrer votre nombre");
		inputGameMode = Clavier.lireInt();
		
		return inputGameMode;
	}
	
	/**
	 * 
	 */
	public static int getGameMode() {
		int gameMode = inputUsergameMode();
		
		return gameMode;
	}
}
