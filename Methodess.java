package StringBufferBuilder;

public class Methodess {

//	Dans Methodess cr�er une m�thode qui prend un tableau de String 
//		Tester cette m�thode dans TestMethodess et qui affiche et qui 
//		retourne le string le plus long :
	
	static String stringLePlusLong(String[] tabStr) {
		String longString = "";
		for (String string : tabStr) {
			if (string.length() > longString.length()) {
				longString = string;
				System.out.println(longString);
			}
		}
		return longString;
		
	}
	
//	 dans Methodess cr�er une m�thode qui utilise la m�thode de 
//	 l�ex1 et donc qui prend au paramettre un tableau de string et 
//	 qui affiche true et qui retourne true si le plus long string d�passe 12 char
//	 Tester cette m�thode dans TestMethodess avec assertTrue()
	static boolean StringPlusLong(String[] tabStr) {
		String e = stringLePlusLong(tabStr);
		if (e.length() > 12) {
			System.out.println(true);
			return true;
		
		}else return false;
		
	}
	
//	cr�er une m�thode qui prend un string au param�tre et qui 
//	retourne le premier char s�il est majuscule et �z� si le premier 
//	char n�est majuscule Tester � 2 reprises cette m�thode avec les 2 cas
	static char premierChar(String str) {
			if (str.charAt(0) == Character.toUpperCase(str.charAt(0))) {
			return str.charAt(0);
			
		}else return 'z';
		
	}
	
	
}
