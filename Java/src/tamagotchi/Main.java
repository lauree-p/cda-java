/**
 * 
 */
package tamagotchi;

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
		Menus menus = new Menus();
		Utils utils = new Utils();
		Actions actions = new Actions();
		// Title 
		menus.startGame();
		utils.sleep(1000);
		// Type
		menus.type();
		myTama.chooseType();
		menus.typeChoosen(myTama);
		// Sex
		myTama.randomSexe();
		menus.sexe(myTama);
		// Name
		menus.name(myTama.getType());
		myTama.chooseName();
		menus.nameChoosen(myTama);
		// Loading
		utils.sleep(1000);
		menus.loading();
		// Game
		menus.game(myTama);
		actions.chooseAction(myTama);
	}

}
