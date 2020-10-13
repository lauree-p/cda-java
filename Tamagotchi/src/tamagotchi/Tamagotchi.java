package tamagotchi;

import tools.Clavier;

/**
 * 
 * @author LAU.POUSSIN
 * 
 *         Réaliser un Tamagotchi caractéristique : couleur caractéristique :
 *         santé, ex : s'il fume sa santé diminue, et sa faim augmente.
 *         caractéristique : taille ( en cm ou en mètre ) caractéristique :
 *         espérance de vie caractéristique : Nom caractéristique : masqué ou
 *         non
 * 
 *         - action : manger / hungry - action : aller au toilette / hy - action
 *         : se teindre les cheveux, mais en roux - action : se reposer - action
 *         : se reproduire - action : exprimer son humeur ex : sauter de joie -
 *         action : voir des amis - action : Faire du sport : augmente la santé
 *         - action : mourir - action : il peut enlever le masque (
 *         caractéristique : masqué ou non ) - action : se laver action :
 *         Choisir un type ( Tamagotchi de type chien / Chat ... Dragon ) à la
 *         création
 */
public class Tamagotchi {

	private String type;
	private String sexe;
	private String color;
	private String name;

	private int dayLife = 365;
	private int health = 100;

	private int hungry;
	private int thristy;

	private int weight;
	private double size;

	private String mood;
	private int hygiene;
	private int tirednesse;

	private boolean mask;

	/**
	 * 
	 */
	public Tamagotchi() {

	}

	/**
	 * @param type
	 * @param sexe
	 * @param color
	 * @param name
	 * @param dayLife
	 * @param health
	 * @param hungry
	 * @param thristy
	 * @param weight
	 * @param size
	 * @param mood
	 * @param hygiene
	 * @param tirednesse
	 * @param mask
	 */
	public Tamagotchi(String type, String sexe, String color, String name, int dayLife, int health, int hungry,
			int thristy, int weight, double size, String mood, int hygiene, int tirednesse, boolean mask) {
		this.type = type;
		this.sexe = sexe;
		this.color = color;
		this.name = name;
		this.dayLife = dayLife;
		this.health = health;
		this.hungry = hungry;
		this.thristy = thristy;
		this.weight = weight;
		this.size = size;
		this.mood = mood;
		this.hygiene = hygiene;
		this.tirednesse = tirednesse;
		this.mask = mask;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	public void chooseType() {
		int intType = Clavier.lireInt();

		switch (intType) {
		case 1:
			this.setType("Chien");
			break;
		case 2:
			this.setType("Chat");
			break;
		default:
			System.out.println("Erreur : Saisissez 1 ou 2");
			chooseType();
			break;
		}
	}

	/**
	 * @return the sexe
	 */
	public String getSexe() {
		return sexe;
	}

	/**
	 * @param sexe the sexe to set
	 */
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public void randomSexe() {
		int ramdom = (int) (Math.random() * 2 + 1);
		switch (ramdom) {
		case 1:
			this.setSexe("Garçon");
			break;
		case 2:
			this.setSexe("Fille");
			break;
		}
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Allow the gamer to choose the name of tama
	 * 
	 * @param type
	 * @return String choiceName
	 */
	public void chooseName() {
		String name = Clavier.lireString();
		this.setName(name);
	}

	/**
	 * @return the dayLife
	 */
	public int getDayLife() {
		return dayLife;
	}

	/**
	 * @param dayLife the dayLife to set
	 */
	public void setDayLife(int dayLife) {
		this.dayLife = dayLife;
	}

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * @return the hungry
	 */
	public int getHungry() {
		return hungry;
	}

	/**
	 * @param hungry the hungry to set
	 */
	public void setHungry(int hungry) {
		this.hungry = hungry;
	}

	/**
	 * @return the thristy
	 */
	public int getThristy() {
		return thristy;
	}

	/**
	 * @param thristy the thristy to set
	 */
	public void setThristy(int thristy) {
		this.thristy = thristy;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @return the size
	 */
	public double getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(double size) {
		this.size = size;
	}

	/**
	 * @return the mood
	 */
	public String getMood() {
		return mood;
	}

	/**
	 * @param mood the mood to set
	 */
	public void setMood(String mood) {
		this.mood = mood;
	}

	/**
	 * @return the hygiene
	 */
	public int getHygiene() {
		return hygiene;
	}

	/**
	 * @param hygiene the hygiene to set
	 */
	public void setHygiene(int hygiene) {
		this.hygiene = hygiene;
	}

	/**
	 * @return the tirednesse
	 */
	public int getTirednesse() {
		return tirednesse;
	}

	/**
	 * @param tirednesse the tirednesse to set
	 */
	public void setTirednesse(int tirednesse) {
		this.tirednesse = tirednesse;
	}

	/**
	 * @return the mask
	 */
	public boolean isMask() {
		return mask;
	}

	/**
	 * @param mask the mask to set
	 */
	public void setMask(boolean mask) {
		this.mask = mask;
	}

	/**
	 * 23 lines
	 * 
	 * @return
	 */
	public Runnable drawMyTama() {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@#((((((@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@//(####(/%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#//####(//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@**&@#//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#/*@@@@@@@**&@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@**@@#**@@@@@@@**&@%*/@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@#/*(#**%@@@@@@@@@##**(@@,/%@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@(*/####/**********,&@@@@,*%@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@(**######(#(@@@@@@@@@@@@,*&@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@**((#####(###(@@@@@@@@@@@@@@(*(@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@**(###%  *((@@@@@@@@@, *@@@@(*(@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@&****(######&@@@@. *@@@@@@@@@@@(****@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@/*&@@@@@@@@@,,,,,,,@@@@@@@@@(*(@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@&/*((**/@@@@@@@@@@@@@@@@@@@@@**(((**@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@&((((((/*/******************/#((((((@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@&##(((((((**%@@@@/*(&@@@/*/(((((((#(@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@%%#((((//(##**((/**##(//((((%%&@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@&%%%&(((////(((////((#%%%%@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		return null;

	}

}
