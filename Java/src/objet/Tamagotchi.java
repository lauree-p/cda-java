package objet;

/**
 * 
 * @author LAU.POUSSIN
 * 
 * Réaliser un Tamagotchi
	- caractéristique : couleur
	- caractéristique : santé, ex : s'il fume sa santé diminue, et sa faim augmente.
	- caractéristique : taille ( en cm ou en mètre )
	- caractéristique : espérance de vie
	- caractéristique : Nom
	
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
	- action : Choisir un type ( Tamagotchi de type chien / Chat ... Dragon ) à la création
 */
public class Tamagotchi {
	
	private String type;
	private String name;
	private String color;
	private int health;
	private double size;
	private int timeLife;
	
	
	
	//-------------------------- Getters and Setters
	
	/**
	 * @param type
	 * @param name
	 * @param color
	 * @param health
	 * @param size
	 * @param timeLife
	 */
	public Tamagotchi(String type, String name, String color, int health, double size, int timeLife) {
		super();
		this.type = type;
		this.name = name;
		this.color = color;
		this.health = health;
		this.size = size;
		this.timeLife = timeLife;
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
	 * @return the timeLife
	 */
	public int getTimeLife() {
		return timeLife;
	}
	/**
	 * @param timeLife the timeLife to set
	 */
	public void setTimeLife(int timeLife) {
		this.timeLife = timeLife;
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
	
	@Override
	public String toString() {
		return "Tamagotchi [type=" + type + ", name=" + name + ", color=" + color + ", health=" + health + ", size="
				+ size + ", timeLife=" + timeLife + "]";
	}

	//-------------------------- FIN Getters and Setters
	
	
}
