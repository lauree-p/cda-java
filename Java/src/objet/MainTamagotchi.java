package objet;

import outils.Clavier;

public class MainTamagotchi {

	public static void main(String[] args) {
		
		mainMenu();
		Tamagotchi myTama = new Tamagotchi();
		menuType();
		myTama.setType(choiceType());
		menuName(myTama.getType());
		myTama.toString();
		

	}
	
	/*
	 * Menu for game
	 */
	public static void mainMenu() {
		System.out.println("*************************************");
		System.out.println("-------------TAMAGOTCHI-------------");
		System.out.println("*************************************");
	}

	/**
	 * Menu for create your unique Tamagotchi
	 */
	public static void menuType() {
		System.out.println("Choisissez votre type de compagnon :");
		System.out.println("\t- 1 : Chien\n\t- 2 : Chat\n\t- 3 : Poney\n\t- 4 : Hamster\n\t- 5 : Chinchila");
	}
	
	public static String choiceType() {
		int type = Clavier.lireInt();
		String typeStr = "";
		boolean correctChoice = true;
		
		while (!correctChoice) {
			switch (type) {
			case 1 :
				typeStr = "Chien";
				break;
			case 2 :
				typeStr = "Chat";
				break;
			case 3 :
				typeStr = "Poney";
				break;
			case 4 :
				typeStr = "Hamster";
				break;
			case 5 :
				typeStr = "Chinchila";
				break;
			default : 
				correctChoice = false;
				break;
			}
		}
		
		System.out.println("------------------------------------");
		
		return typeStr;

	}
	
	public static void menuName(String type) {
		System.out.println("Choisissez le nom de votre "+type);
	}
	
}
