package tp4;

/**
 * Cet exemple vous ferra, sans aucun doute, mieux comprendre les choses.
 * Je vous invite à le tester et à le modifier de façon à ce que vous compreniez bien toute la sémantique de cette instruction.
 */

public class Tp46 {

	public static void main(String[] args) {
		for (int i = 0; i < 12; i++) {
		      switch (i) {
		        case 9:
		          System.out.println("Neuf");
		          break;
		        case 8:
		          System.out.print("Huit");
		          System.out.println("");
		          break;
		        case 7:
		          {
		            System.out.print("Sept");
		            System.out.println("");
		          }
		          break;
		        case 6:
		          System.out.print("Six ");
		        case 5:
		          System.out.println("Cinq");
		          break;
		        case 4:
		        case 3:
		          System.out.print("Quatre Trois ");
		        case 2:
		          System.out.println("Deux");
		          break;
		        case 1:
		          System.out.println("Un");
		          break;
		        default:
		          System.out.println("Zero");
		          break;
		      }
		    }
		    System.out.println("Fin");
		    
		    // Test

	}

}
