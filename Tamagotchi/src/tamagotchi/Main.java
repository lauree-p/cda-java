/**
 * 
 */
package tamagotchi;

import tools.Utils;

/**
 * @author pouss
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Initialisation
		Tamagotchi myTama = new Tamagotchi();
		// Title 
		Menus.startGame();
		Utils.sleep(1000);
		// Type
		Menus.type();
		myTama.chooseType();
		Menus.typeChoosen(myTama);
		// Sex
		myTama.randomSexe();
		Menus.sexe(myTama);
		// Name
		Menus.name(myTama.getType());
		myTama.chooseName();
		Menus.nameChoosen(myTama);
		// Loading
		Utils.sleep(1000);
		//Menus.loading();  // TODO Decommenté
		// Game
		Menus.game(myTama);
		Actions.chooseAction(myTama);
	}

}
