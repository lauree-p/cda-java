package objet;

public class Cat {

	// private : pas d'acces au variable , obigé de passé par les getters & setters
	private String name = "Javatoune";
	private String color = "noir";
	private int age;
	
	public Cat() {
		
	}
	
	/**
	 * @param name
	 * @param color
	 * @param age
	 */
	public Cat(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}
	

	/**
	 * @param color
	 */
	public Cat(String color) {
		super();
		this.color = color;
		this.name = "Sans nom";
	}

	/**
	 * Show the cat 
	 */
	public void show() {
		System.out.println("Mon chat s'appelle " + this.name + ", il est " + this.color + " . Il a " + this.age + " ans.");
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + ", age=" + age + "]";
	}

	public void listen() {
		System.out.println("RRRrrrrrrrrr");
	}
	

}
