package StringBufferBuilder;

public class Methodess {

//	Dans Methodess créer une méthode qui prend un tableau de String 
//		Tester cette méthode dans TestMethodess et qui affiche et qui 
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
	
//	 dans Methodess créer une méthode qui utilise la méthode de 
//	 l’ex1 et donc qui prend au paramettre un tableau de string et 
//	 qui affiche true et qui retourne true si le plus long string dépasse 12 char
//	 Tester cette méthode dans TestMethodess avec assertTrue()
	static boolean StringPlusLong(String[] tabStr) {
		String e = stringLePlusLong(tabStr);
		if (e.length() > 12) {
			System.out.println(true);
			return true;
		
		}else return false;
		
	}
	
//	créer une méthode qui prend un string au paramètre et qui 
//	retourne le premier char s’il est majuscule et ‘z’ si le premier 
//	char n’est majuscule Tester à 2 reprises cette méthode avec les 2 cas
	static char premierChar(String str) {
			if (str.charAt(0) == Character.toUpperCase(str.charAt(0))) {
			return str.charAt(0);
			
		}else return 'z';
		
	}
	
	
}
