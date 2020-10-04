package tamagotchi;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Window extends JFrame{
 
	public Window(){
		super();
		
		build();
	}
 
	//Cr�ation de JFrame
	public void build(){
		setTitle("Tamagotchi"); //On donne un titre � l'application
		setSize(450,500); //On donne une taille � notre fen�tre
		setLocationRelativeTo(null); //On centre la fen�tre sur l'�cran
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);//On dit � l'application de se fermer lors du clic sur la croix
		setContentPane(Panels.panel());
	}
	
}