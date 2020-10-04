package tamagotchi;

import javax.swing.SwingUtilities;

public class Main {

	public static void main(String[] args) {
		
		StartWindow startWindow = new StartWindow();
		
		
	}

	public static void runwindowStart() {
		SwingUtilities.invokeLater(new Runnable() {
			StartWindow startWindow = new StartWindow();
			public void run() {
				//StartWindow startWindow = new StartWindow();
				startWindow.close();
			}

		});
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				//startWindow.close();
			}

		});
	}
	
	public static void runttartWindowS() {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				appWindow();
			}

		});
	}

	static StartWindow startWindow() {
		StartWindow startWindow = new StartWindow();
		startWindow.close();
		return startWindow;
	}

	static Window appWindow() {
		Window app = new Window();
		
		return app;
	}

}
