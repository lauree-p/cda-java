package tamagotchi;

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

public class Main {
	
	
	@SuppressWarnings("unused")
	private static StartWindow startWindow;
	@SuppressWarnings("unused")
	private static Window app;
	
	public static void main(String[] args) throws InvocationTargetException, InterruptedException {
			
		SwingUtilities.invokeAndWait(new Runnable() {
			
			@Override
			public void run() {
				startWindow = new StartWindow();
			}
			
		});
		
	    try {
	        Thread.sleep(1000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    
	    SwingUtilities.invokeLater(new Runnable() {
	    	
	    	@Override
			public void run() {
	    		startWindow.close();
			}
		});
	    
	    SwingUtilities.invokeLater(new Runnable() {
	    	
	    	@Override
			public void run() {
	    		Window app = new Window();
			}
		});
	    
	     
	}

}
