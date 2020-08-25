package StringBufferBuilder;

import static org.junit.Assert.*;

import org.junit.*;


public class TestMethodess {	
	
	@Test
	public void TestLongueur1() {
		String tab1[] = {"anisAyoubKatyKd", "dalia", "inga"};
		assertEquals("anisAyoubKatyKd", Methodess.stringLePlusLong(tab1));
	}
	
	//string le plus long
	@Test
	public void TestLongueur2() {
		String tab2[] = {"anisAyoubKatyKd", "dalia", "inga"};
		assertTrue(Methodess.StringPlusLong(tab2));
	}
	
	//le premier character
	@Test
	public void permierCharMaj() {
		String a = "zdil";
		assertEquals("zdil", Methodess.premierChar(a));
	}
	
//	cr�er une m�thode qui affiche � d�but de tests � au d�but des tests
	@BeforeClass
	public static void testBeforeC() {
		System.out.println("D�but des test");
	}

//	cr�er une m�thode qui affiche � Test suivant � apr�s chaque test
	@After
	public void testSuivant() {
		System.out.println("Test Suivant");
	} 
	
 //	Cr�er une m�thode qui affiche � fin de tests � � la fin de l�ex�cution des tests
	@AfterClass
	public static void finDesTest() {
		System.out.println("Fin des test");
		}
	

}
