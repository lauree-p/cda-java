package tp6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import outils.Clavier;

public class Exercices {

	public static void main(String[] args) {
		
		// Exercice 1
		
//		int[] tableauInt = new int[5];
//		
//		remplirTableau(tableauInt);
//		
//		System.out.println("La moyenne : " + calculMoyenne(tableauInt));
//		System.out.println("La plus grande valeur du tableau est : " + laPlusGrandeValeur(tableauInt));
		
		// Exercice 2
		
		double[] tableauNotes = {5,12.5,18,7,10,11.5,17,14,9.5,6};
		
		
		afficheTabMoinsDix(auDessousDelaMoyenne(tableauNotes));
	}
	
	//----------------------Exercice 1----------------------
	
	public static double calculMoyenne(int[] tableauInt) {
		int somme = 0;
		double moyenne;
		
		for (int i = 0; i < tableauInt.length ; i++) {
			 somme += tableauInt[i];
		}
		
		moyenne = somme/tableauInt.length;
		return moyenne;
	}
	
	public static int laPlusGrandeValeur(int[] tableauInt) {
		int plusGrandeValeur = 0;
		Arrays.sort(tableauInt);
		plusGrandeValeur = tableauInt[tableauInt.length-1];
		
		return plusGrandeValeur;
	}
	
	public static void remplirTableau(int[] tableauInt) {
		for (int i = 0; i <5 ; i++) {
			System.out.println("Saissiez un nombre");
			tableauInt[i] = Clavier.lireInt();
		}
		System.out.println("Le tableau de 5 int : " + afficheTableau(tableauInt));
	}
	
	public static String afficheTableau(int[] tableauInt) {
		String tableauToString = Arrays.toString(tableauInt);
		return tableauToString;
	}
	
	//----------------------Exercice 2----------------------
	
	
	public static List<Double> auDessousDelaMoyenne(double[] tableauNotes) {
		
		List<Double> list = new ArrayList<Double>();

		for (int i = 0 ; i < tableauNotes.length ; i++) {
			if (tableauNotes[i] < 10) {
				list.add(tableauNotes[i]);
			}
		}

		return list;
		
	}
	
	public static void afficheTabMoinsDix(List<Double> list) {
		System.out.println(list.toString());
	}

}
