import java.util.Arrays;
import java.util.Scanner;

public class Pendu {

	public static void main(String[] args) {
		
		chooseGameMode();
		
	}
	
	/**
	 *  Allow player to choose the game mode
	 */
	public static void chooseGameMode() {
		@SuppressWarnings("resource")
		Scanner scGameMode = new Scanner(System.in);
		System.out.println("Choisissez votre mode de jeu :\n 1 - 1 Joueur \n 2 - 2 Joueurs");
		String gameMode = scGameMode.nextLine();
		
		// If player choose game mode one player
		if (gameMode == "1") {
			onePlayer();
		}
		// Else if player choose game mode two players
		else if (gameMode == "2") {
			twoPlayers();
		}
		// Not correct
		else {
			
		}
	}
	
	/**
	 *  Game mode for one player
	 */
	public static void onePlayer() {
		
	}
	
	/**
	 *  Game mode for two players
	 */
	public static void twoPlayers() {
		System.out.println("Game mode");
		chooseWord();
	}
	
	/**
	 * Allow player to choose one word to guess
	 * @return
	 */
	public static String chooseWord() {
		System.out.println("Joueur 1 : Saisissez un mot à deviner");
		@SuppressWarnings("resource")
		Scanner scWordToFind = new Scanner(System.in);
		String wordToFind = scWordToFind.nextLine();
		System.out.println(wordToFind);
		return wordToFind;
	}
	
	/**
	 * Copy the word array and return the word in String with holes
	 * @param arrayWord
	 * @return
	 */
	public static String arrayWordToWordHole(String[] arrayWord) {
		String[] wordWithHole = arrayWord;
		
		for (int i = 1 ; i < wordWithHole.length-1; i++) {
			wordWithHole[i] = "_";
		}
		
		System.out.println(Arrays.toString(wordWithHole));
		String joinedString = String.join(", ", wordWithHole);
		System.out.println(joinedString);
		
		return joinedString;
	}
	
	/**
	 * Convert the wordToFind in String[]
	 * @param wordToFind
	 * @return
	 */
	public static String[] wordToFindToArrayWord(String wordToFind) {
		String[] arrayWord = wordToFind.split("");
		return arrayWord;
	}
	
	/**
	 * Display an array to String
	 * @param arrayString
	 */
	public static void displayArray(String[]arrayString) {
		System.out.println(Arrays.toString(arrayString));
	}
	


}
