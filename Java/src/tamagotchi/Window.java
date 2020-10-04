package tamagotchi;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Window extends JFrame{
 
	public Window(){
		super();
		
		build();
	}
 
	//Création de JFrame
	public void build(){
		setTitle("Tamagotchi"); //On donne un titre à l'application
		setSize(450,500); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);//On dit à l'application de se fermer lors du clic sur la croix
		setContentPane(Panels.panel());
	}
	
}