package objet;

public class MainClass {

	public static void main(String[] args) {
		Cat myCat1 = new Cat();
		Cat myCat2 = new Cat();
		
		myCat1.show();
		
		myCat2.show();
		myCat2.setName("CSS");
		myCat2.show();
		myCat2.setColor("blanc");
		myCat2.setAge(5);
		myCat2.show();
		
		Cat myCat3 = new Cat("Javascript","brun",2);
		Cat myCat4 = new Cat("PHP","brun",5);
		Cat myCat5 = new Cat("Console","blanc tacheté",8);
		
		System.out.println();
		
		myCat3.show();
		myCat4.show();
		myCat5.show();
		
		Cat lostCat = new Cat("roux");
		
		lostCat.show();
		
		myCat1.toString();
		myCat2.toString();
		myCat3.toString();
		myCat4.toString();
		myCat5.toString();
		lostCat.toString();	
		
		// Pas accessible avec le mot clef private
		// myCat1.nom;
		
		System.out.println("Mon myCat1 s'appelle " +myCat1.getName());
		
		myCat1.listen();
	}

}
