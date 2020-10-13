package tamagotchi;

public class Actions {
	
	Menus menus = new Menus();
	Utils utils = new Utils();
	Clavier clavier = new Clavier();
	
	public void chooseAction(Tamagotchi myTama) {
		int intAction = Clavier.lireInt();
		switch (intAction) {
		case 1:
			informations(myTama);
			break;
		case 2:
			feedingTime(myTama);
			break;
		case 3:
			toilet();
			break;
		case 4:
			playTime();
			break;
		case 5:
			discipline();
			break;
		case 6:
			healh();
			break;
		case 7:
			lights();
			break;
		case 8:
			noteBook();
			break;
		case 9:
			custom();
			break;
		// TODO accessoires
		default:
			System.out.println("Erreur : Saisissez 1 ou 2");
			chooseAction(myTama);
			break;
		}
	}

	//-------------- Informations

	public void informations(Tamagotchi myTama) {
		utils.clearConsole();
		menus.startGame();
		menus.menuTop();
		// TODO : if is cat
		menuInformation(myTama);
		menus.menuBot();
		chooseInformation(myTama);
	}

	public void menuInformation(Tamagotchi myTama) {
		System.out.println("\t\t\t Temps de vie restant : " + myTama.getDayLife() + " jours");

		System.out.println("Nom : " + myTama.getName());
		System.out.println("Sexe : " + myTama.getSexe());
		System.out.println("Couleur : " + myTama.getColor());

		System.out.println("Vie : " + myTama.getHealth());
		System.out.println("Faim : " + myTama.getHungry());
		System.out.println("Soif : " + myTama.getThristy());

		System.out.println("Poids : " + myTama.getWeight() + " kg");
		System.out.println("Taille : " + myTama.getSize() + " cm");

		System.out.println("Humeur : " + myTama.getMood());
		System.out.println("Hygiene : " + myTama.getHygiene());
		System.out.println("Niveau de fatigue : " + myTama.getTirednesse()+"\n");

		System.out.println("\t\t\t\t\t(1)RETOUR");

	}
	
	public void chooseInformation(Tamagotchi myTama) {
		int intActionInformation = Clavier.lireInt();

		switch (intActionInformation) {
		case 1:
			menus.game(myTama);
			chooseAction(myTama);
			break;
		default:
			informations(myTama);
			break;
		}
	}
	
	//-/Informations --------- FeedingTime

	public void feedingTime(Tamagotchi myTama) {
		utils.clearConsole();
		menus.startGame();
		menus.menuTop();
		// TODO : if is cat
		menuInformation(myTama);
		menus.menuBot();
		chooseInformation(myTama);
	}
	
	public void menuFeedingTime() {
		System.out.println("(1)MEAL");

		System.out.println("(2)DESSERT");
		System.out.println("(3)CANDY");
		System.out.println("\t\t\t(4)RETOUR");
	}
	
	public void chooseFeedingTime() {
		
	}
	
	//-/FeedingTime ---------- FeedingTime

	public void toilet() {

	}

	public void playTime() {

	}

	public void discipline() {

	}

	public void healh() {

	}

	public void lights() {

	}

	public void noteBook() {

	}
	
	public void custom() {

	}
}
