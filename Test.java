package StringBufferBuilder;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import com.mysql.fabric.xmlrpc.base.Array;

public class Test {

	public static void main(String[] args) {
		

		System.out.println("PARTIE 1 ----------------------");
		//CHAT
		Chat monChat = new Chat() {
			public void mioler(String nom) {
				System.out.println(nom + " Miole");	
			}
		};
		monChat.mioler("BissBiss");
		//EXPRESSION LAMBDA
		Chat nom = (s) -> System.out.println(s + " je Miole");
		nom.mioler("Avec Expression : Bissbiss");
		
		
		System.out.println("PARTIE 2 --------------------------");
		//TRIE DES MAJUSCULES 1er façon
		String[] stagiaires = { "Anis", "Inga", "Imén", "Sébastien", "Nicolas", "Dalia" };
		
		TriMaj t = new TriMaj() {
			public void trierEnMaj(ArrayList<String> trierString) {
				for (String s : trierString) {
				char p = s.charAt(0);
				ArrayList<String> ordreCroissant = new ArrayList<String>(); 
				ordreCroissant.add((int) p, s);
				Collections.sort(ordreCroissant);
				System.out.print(ordreCroissant);
				}
			}
		};
		
		
		//2éme Façon
		ArrayList newList = new ArrayList(Arrays.asList(stagiaires));
		
		System.out.println("ma liste initiale");
		System.out.println(newList);
		TriMaj trimaj = new TriMaj () {
			public void trierEnMaj(ArrayList<String> List) {
			for (int i = 0; i < List.size(); i++) {
				List.set(i, List.get(i).toUpperCase());
			}
			Collections.sort(List);
			System.out.println(List);
			}
			};
			System.out.println("Majuscule et trie avec classe anonymes");
			trimaj.trierEnMaj(newList);
			//EXPRESSION LAMBDA
			TriMaj trimaj2 = (List)-> {
				for (int i = 0; i < List.size(); i++) {
					List.set(i, List.get(i).toUpperCase());
				}
				Collections.sort(List);
				System.out.println(List);
			};
			System.out.println("Majuscule et trie avec expression Lambda");
			trimaj2.trierEnMaj(newList);
			System.out.println(" ");
		}
	
	//Suite 
//	System.out.println("PARTIE 3 ----------------------------------");
//		//FICHIER
//		File f = new File("C://Users//Admin//Desktop");
//		Fichier file1 = new Fichier() {
//			
//		}
		
		
		
		
		
}


