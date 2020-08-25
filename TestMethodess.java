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
	
//	créer une méthode qui affiche « début de tests » au début des tests
	@BeforeClass
	public static void testBeforeC() {
		System.out.println("Début des test");
	}

//	créer une méthode qui affiche « Test suivant » après chaque test
	@After
	public void testSuivant() {
		System.out.println("Test Suivant");
	} 
	
 //	Créer une méthode qui affiche « fin de tests » à la fin de l’exécution des tests
	@AfterClass
	public static void finDesTest() {
		System.out.println("Fin des test");
		}
	

}
