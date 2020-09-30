package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import tp3.CorrectionExercice2;
import tp3.Exercice2;

public class Test_tp3_Exercice2 extends CorrectionExercice2 {

	@Test
	public void testLePlusGrandDesDeux() {
		
		// lePlusGrandDesDeux()
		assertEquals(5, tp3.CorrectionExercice2.lePlusGrandDesDeux(2, 5));
		assertEquals(5, tp3.CorrectionExercice2.lePlusGrandDesDeux(5, 2));
		assertEquals(5, tp3.CorrectionExercice2.lePlusGrandDesDeux(5, 5));
	}
	
	@Test
	public void testLePlusGrandDesDeuxbis() {
		
		// lePlusGrandDesDeuxbis
		assertEquals(5, tp3.CorrectionExercice2.lePlusGrandDesDeuxbis(2, 5));
		assertEquals(5, tp3.CorrectionExercice2.lePlusGrandDesDeuxbis(5, 2));
		assertEquals(5, tp3.CorrectionExercice2.lePlusGrandDesDeuxbis(5, 5));
	}

	@Test
	public void testLePlusGrandDesDeuxReturn() {
		
		// lePlusGrandDesDeuxReturn
		assertEquals(5, tp3.CorrectionExercice2.lePlusGrandDesDeuxReturn(2, 5));
		assertEquals(5, tp3.CorrectionExercice2.lePlusGrandDesDeuxReturn(5, 2));
		assertEquals(5, tp3.CorrectionExercice2.lePlusGrandDesDeuxReturn(5, 5));
	}

	@Test
	public void testLePlusGrandDesDeuxTernaire() {
		
		// lePlusGrandDesDeuxTernaire
		assertEquals(5, tp3.CorrectionExercice2.lePlusGrandDesDeuxTernaire(2, 5));
		assertEquals(5, tp3.CorrectionExercice2.lePlusGrandDesDeuxTernaire(5, 2));
		assertEquals(5, tp3.CorrectionExercice2.lePlusGrandDesDeuxTernaire(5, 5));
	}
	
	@Test
	public void testLePlusGrandDesQuatre() {
		
		// lePlusGrandDesQuatre
		assertEquals(9, tp3.CorrectionExercice2.lePlusGrandDesQuatre(9, 1 , 8 , 2));
		assertEquals(9, tp3.CorrectionExercice2.lePlusGrandDesQuatre(1, 9 , 8 , 2));
		assertEquals(9, tp3.CorrectionExercice2.lePlusGrandDesQuatre(1, 8 , 9 , 2));
		assertEquals(9, tp3.CorrectionExercice2.lePlusGrandDesQuatre(1, 2 , 8 , 9));
	}
	
	@Test
	public void testLePlusGrandDesQuatrebis() {
		
		// lePlusGrandDesQuatrebis
		assertEquals(9, tp3.CorrectionExercice2.lePlusGrandDesQuatrebis(9, 1 , 8 , 2));
		assertEquals(9, tp3.CorrectionExercice2.lePlusGrandDesQuatrebis(1, 9 , 8 , 2));
		assertEquals(9, tp3.CorrectionExercice2.lePlusGrandDesQuatrebis(1, 8 , 9 , 2));
		assertEquals(9, tp3.CorrectionExercice2.lePlusGrandDesQuatrebis(1, 2 , 8 , 9));
	}
	
	@Test
	public void testLePlusGrandDesQuatreter() {
		
		// lePlusGrandDesQuatreter
		assertEquals(9, tp3.CorrectionExercice2.lePlusGrandDesQuatreter(9, 1 , 8 , 2));
		assertEquals(9, tp3.CorrectionExercice2.lePlusGrandDesQuatreter(1, 9 , 8 , 2));
		assertEquals(9, tp3.CorrectionExercice2.lePlusGrandDesQuatreter(1, 8 , 9 , 2));
		assertEquals(9, tp3.CorrectionExercice2.lePlusGrandDesQuatreter(1, 2 , 8 , 9));
	}
}
