package TP2;

public class TP2 {
	

	
	public static void main(String[] args) {

	    test();
	}
	
	public static void test() {
		
		// Que se passe t'il si je veux ajouter un entier avec un de�?cimal ?
		int entier = 2;
		double decimal = 2.5;
		
		System.out.println(entier+decimal);
		
		// Comment ajouter une chaine et un entier ?
		String hello = "hello"+entier;
	    System.out.println(hello);
	    
	    System.out.println();
	    
	    // '3' + 1 = ; 'A' + 2 = ; 3 + "Abc"  = ; "A" + 2 = 
	    System.out.println('3' + 1);
	    System.out.println('A' + 2);
	    System.out.println(3 + "Abc");
	    System.out.println("A" + 2);
	    
	    System.out.println();
	    
	    
	}
	
}
