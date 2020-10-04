package tamagotchi;

/**
 * 
 * @author LAU.POUSSIN
 * 
 * Réaliser un Tamagotchi
	caractéristique : couleur
	caractéristique : santé, ex : s'il fume sa santé diminue, et sa faim augmente.
	caractéristique : taille ( en cm ou en mètre )
	caractéristique : espérance de vie
	caractéristique : Nom
	caractéristique : masqué ou non
	
	- action : manger
	- action : aller au toilette
	- action : se teindre les cheveux, mais en roux
	- action : se reposer
	- action : se reproduire
	- action : exprimer son humeur ex : sauter de joie
	- action : voir des amis
	- action : Faire du sport : augmente la santé
	- action : mourir
	- action : il peut enlever le masque ( caractéristique : masqué ou non )
	- action : se laver	
	action : Choisir un type ( Tamagotchi de type chien / Chat ... Dragon ) à la création 
 */
public class Tamagotchi {
	
	private String type;
	private String name;
	private String color;
	private int health = 100;
	private double size;
	private int dayLife = 365;
	private boolean mask;
	
	private int hungry;
	private int thristy;
	private int weight;
	
	private String humeur;
	private int hygiene;
	private int fatigue;
	
	
	
	//-------------------------- Getters and Setters
	
	/**
	 * @param type
	 * @param name
	 * @param color
	 * @param health
	 * @param size
	 * @param timeLife
	 */
	public Tamagotchi(String type, String name, String color, int health, double size, int dayLife, boolean mask, int hungry, int thirsty, int weight ) {
		super();
		this.type = type;
		this.name = name;
		this.color = color;
		this.health = health;
		this.size = size;
		this.dayLife = dayLife;
		this.mask = mask;
		this.hungry = hungry;
		this.thristy = thirsty;
		this.weight = weight;
	}
	
	public Tamagotchi() {
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

	//-------------------------- FIN Getters and Setters
	
	@Override
	public String toString() {
		return "Tamagotchi [type=" + type + ", name=" + name + ", color=" + color + ", health=" + health + ", size="
				+ size + ", dayLife=" + dayLife + "]";
	}
	
	public void manger() {
		
	}
	
	
	
	
}
