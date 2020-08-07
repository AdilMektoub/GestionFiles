package StringBufferBuilder;

public class BDDTrie {

	static String[] trieTab2(int[] tab, String[]tabString) {
		int min_elt, pos_min, i;
		String nom;
		for ( i = 0; i < tab.length -1; i++) {
			min_elt = tab[i+ 1];
			nom=tabString[i+1];
			pos_min = i+1;
			for (int j = i+2; j < tab.length; j++) {
				if (tab[j] < min_elt) {
					min_elt = tab[j];
					nom=tabString[j];
					pos_min = j;
				}
			}
			if (min_elt < tab[i]) {
				tab[pos_min] = tab[i];
				tabString[pos_min] = tabString[i];
				tab[i] = min_elt;
				tabString[i] = nom;
			}
		}
		return tabString;
	}
	static int[] AsciiFirstLetter(String[] tab) {
		int[] tabInt = new int[tab.length];
		for (int i = 0; i < tab.length; i++) {
			tabInt[i] = (int)tab[i].charAt(0);
		}
		affiche(tabInt);
		return tabInt;
		
	}
	
	private static void affiche(int[] tabInt) {
		System.out.println(tabInt);	
	}
	
}
