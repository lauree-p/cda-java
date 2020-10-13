package testInterface;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;


@SuppressWarnings("serial")
public class StartWindow extends JWindow {

	public StartWindow(){
		super();
		build();
	}

	public void build() {
		setSize(340, 318);// On lui donne une taille pour qu'on puisse la voir
		setVisible(true);// On la rend visible
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setBackground(Color.white);
		// URL de l'image
		String imgUrl = "images/start.png";
		ImageIcon icone = new ImageIcon(imgUrl);
		// Création de JLable avec un alignement au centre
		JLabel labe2 = new JLabel(icone, JLabel.CENTER);
		add(labe2);
	}
	
	public void close() {
		try {
			Thread.sleep(3000);
			setVisible(false);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
