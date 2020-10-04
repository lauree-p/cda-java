package testInterface;

import javax.swing.SwingUtilities;

public class TestSwing {

	public static void main(String[] args) {
		
		Runnable doHelloWorld = new Runnable() {
		     public void run() {
		         System.out.println("Hello World on " + Thread.currentThread());
		     }
		 };

		 SwingUtilities.invokeLater(doHelloWorld);
		 System.out.println("This might well be displayed before the other message.");
		 

	}
	
	/**
	 * SetTimeOut
	 * 
	 * @param runnable
	 * @param delay
	 */
	public static void wait(int delay) {

		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
