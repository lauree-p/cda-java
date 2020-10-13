package testInterface;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panels {
	
		public static JPanel panel() {
			
			JPanel pane = new JPanel();
			pane.setLayout(new FlowLayout());
			pane.setBackground(Color.cyan);
		 
			JLabel label = new JLabel("Bienvenue dans ma modeste application");
			
			pane.add(label);
			
			// URL de l'image
			String imgUrl = "images/start.jpg";
			ImageIcon icone = new ImageIcon(imgUrl);
			ImageIcon icone2 = new ImageIcon(imgUrl);
			// Création de JLable avec un alignement au centre
			JLabel labe2 = new JLabel(icone, JLabel.LEFT);
			JLabel labe3 = new JLabel(icone2, JLabel.RIGHT);
			pane.add(labe2);
			pane.add(labe3);
			
			return pane;
		}
		
	}