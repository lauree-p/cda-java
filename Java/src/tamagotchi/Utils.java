package tamagotchi;

public class Utils {

	/**
	 * 
	 * @param x
	 */
	public void sleep(int x) {
		try {
			Thread.sleep(x);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Clear console with println
	 */
	public void clearConsole() {
		for (int i = 0; i < 150; i++) {
			System.out.println();
		}
	}
}
