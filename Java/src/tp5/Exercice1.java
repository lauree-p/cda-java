package tp5;
import java.util.Date;

public class Exercice1 {

	private static int random = (int) (new Date().getTime());

	public static int random() {
		random = random ^ (random * random);
		return random;
	}

//	public static void main(String[] args) {
//		for (;;)
//			System.out.println("Aleatoire : " + Exercice1.random());
//	}
}