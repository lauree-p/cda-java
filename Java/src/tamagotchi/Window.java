package tamagotchi;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
		// URL de l'image
		String imgUrl = "images/start.png";
		ImageIcon icone = new ImageIcon(imgUrl);
		// Création de JLable avec un alignement au centre
		JLabel labe2 = new JLabel(icone, JLabel.CENTER);
		add(labe2);
	}
	
}