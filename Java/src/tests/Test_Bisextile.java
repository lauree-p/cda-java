package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import outils.DateCustom;

public class Test_Bisextile extends DateCustom {

	@Test
	public void testBisextileOrNot() {
		assertEquals(true, bisextileOrNot(2016));
		assertEquals(true, bisextileOrNot(2000));
		
		assertEquals(false, bisextileOrNot(2005));
		assertEquals(false, bisextileOrNot(2100));
		assertEquals(false, bisextileOrNot(1900));
		
		// Other years bisextile 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, 2048, 2052, 2056, 2060, 2064, 2068, 2072, 2076, 2080, 2084, 2088, 2092, 2096. 
		assertEquals(true, bisextileOrNot(2004));
		assertEquals(true, bisextileOrNot(2008));
		assertEquals(true, bisextileOrNot(2012));
		assertEquals(true, bisextileOrNot(2020));
		assertEquals(true, bisextileOrNot(2024));
		assertEquals(true, bisextileOrNot(2028));
		assertEquals(true, bisextileOrNot(2032));
		assertEquals(true, bisextileOrNot(2036));
		assertEquals(true, bisextileOrNot(2040));
		assertEquals(true, bisextileOrNot(2044));
		assertEquals(true, bisextileOrNot(2048));
		assertEquals(true, bisextileOrNot(2052));
		assertEquals(true, bisextileOrNot(2056));
		assertEquals(true, bisextileOrNot(2060));
		assertEquals(true, bisextileOrNot(2064));
		assertEquals(true, bisextileOrNot(2068));
		assertEquals(true, bisextileOrNot(2072));
		assertEquals(true, bisextileOrNot(2076));
		assertEquals(true, bisextileOrNot(2080));
		assertEquals(true, bisextileOrNot(2084));
		assertEquals(true, bisextileOrNot(2088));
		assertEquals(true, bisextileOrNot(2092));
		assertEquals(true, bisextileOrNot(2096));
		
		// Other years NOT bisextile
		assertEquals(false, bisextileOrNot(2003));
		assertEquals(false, bisextileOrNot(2005));
		assertEquals(false, bisextileOrNot(2006));
		assertEquals(false, bisextileOrNot(2007));
		assertEquals(false, bisextileOrNot(2009));
		assertEquals(false, bisextileOrNot(2010));
		assertEquals(false, bisextileOrNot(2011));
		assertEquals(false, bisextileOrNot(2013));
		assertEquals(false, bisextileOrNot(2014));
		assertEquals(false, bisextileOrNot(2015));
		assertEquals(false, bisextileOrNot(2017));
		assertEquals(false, bisextileOrNot(2018));
		assertEquals(false, bisextileOrNot(2019));
		assertEquals(false, bisextileOrNot(2021));
		assertEquals(false, bisextileOrNot(2022));
		assertEquals(false, bisextileOrNot(2023));
		assertEquals(false, bisextileOrNot(2025));
		assertEquals(false, bisextileOrNot(2026));
		assertEquals(false, bisextileOrNot(2027));
		assertEquals(false, bisextileOrNot(2029));
		assertEquals(false, bisextileOrNot(2030));
		assertEquals(false, bisextileOrNot(2031));
		assertEquals(false, bisextileOrNot(2033));
	}

}
