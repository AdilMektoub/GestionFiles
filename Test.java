package StringBufferBuilder;

import java.awt.EventQueue;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import com.mysql.fabric.xmlrpc.base.Array;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import ExpressionLambda.TriMaj;

public class Test {

	//Déclaration variable Static de la methode affichage
	static String url = "jdbc:mysql://localhost:3306/bib";
	static  String user = "root";
	static String passwd = "";
	
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
		
			
	System.out.println("PARTIE 3 ----------------------------------");
		//FICHIER
		File f = new File("C://Users//Admin//Desktop");
		Fichier file1 = new Fichier() {
			public void lire(File fichier, String[] tab) throws IOException {
				if (!fichier.exists()) {
					fichier.createNewFile();
					System.out.println("fichier" + fichier + " a été créer avec succés");
					
				}
				BufferedWriter bw = new BufferedWriter(new FileWriter(f));
				for (String elt : tab) {
					bw.write(elt);
					bw.newLine();
				}
				bw.close();
}

			@Override
			public void Lire(File f, String[] tab) throws IOException {
				// TODO Auto-generated method stub
				
			}};
		file1.lire(f, stagiaires);
		//expression Lambda SUITE 
		File f2 = new File("C://Users//Admin//Desktop");
		Fichier file2 = (fichier,tab) -> {
			if (!fichier.exists()) {
				fichier.createNewFile();
				System.out.println("fichier " + fichier + " à été créer abvec succés");
			}
			BufferedWriter bw = new BufferedWriter(new FileWriter(f2));
			for (String elt : tab) {
				bw.write(elt);
				bw.newLine();
			}
			bw.close();
		};
		file2.Lire(f2, stagiaires);
		
		//connection à la BDD
    	EventQueue.invokeLater(new Runnable() {
            public void run() {
                // Votre fonction Run
                // Vos information de connexion à une base de données
                String BDD = "bib";
                String url = "jdbc:mysql://localhost:3306/" + BDD;
                String user = "root";
                String passwd = "";
                
                // L'essaie de connexion à votre base de donées
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conn =
                            (Connection) DriverManager.getConnection(url, user, passwd);
                    System.out.println("Connecter");
                    //si ça se connecte pas exception
                } catch (Exception e){
                    e.printStackTrace();
                    System.out.println("Erreur");
                    System.exit(0);
                }
            }
        });
    	
    			
	}
	//Affichage d'élément de la BDD	
	public static ArrayList<String> affichageUtilisateurs(  ) { 
		ArrayList<String> list = new ArrayList<String>();
		try { Connection connection = 
				(Connection) DriverManager.getConnection( url, user, passwd ) ;
			//String strSql = "SELECT * FROM T_Users WHERE login='" + login + "' AND password='" + password + "'";
			String strSql = "SELECT * FROM Utilisateur"; //  WHERE login=? AND password=?
			try ( PreparedStatement statement  = (PreparedStatement) connection.prepareStatement( strSql ) ) {
//				statement.setString( 1, login );
//				statement.setString( 2, password );
				try ( ResultSet resultSet = statement.executeQuery() ) { 
					while ( resultSet.next() ) { //(int id, int id_livre, String nom, String login, String password)	
								list.add(resultSet.getString( "titre" )); }
				}
			}
		} catch ( Exception exception ) {
			throw new RuntimeException( exception );
		}
		return list;
	}
}

//package Expression Lambda;
//
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
//
//import com.mysql.fabric.xmlrpc.base.Array;
//
//public class Test {
//
//	public static void main(String[] args) {
//		
//
//		System.out.println("PARTIE 1 ----------------------");
//		//CHAT
//		Chat monChat = new Chat() {
//			public void mioler(String nom) {
//				System.out.println(nom + " Miole");	
//			}
//		};
//		monChat.mioler("BissBiss");
//		//EXPRESSION LAMBDA
//		Chat nom = (s) -> System.out.println(s + " je Miole");
//		nom.mioler("Avec Expression : Bissbiss");
//		
//		
//		System.out.println("PARTIE 2 --------------------------");
//		//TRIE DES MAJUSCULES 1er façon
//		String[] stagiaires = { "Anis", "Inga", "Imén", "Sébastien", "Nicolas", "Dalia" };
//		
//		TriMaj t = new TriMaj() {
//			public void trierEnMaj(ArrayList<String> trierString) {
//				for (String s : trierString) {
//				char p = s.charAt(0);
//				ArrayList<String> ordreCroissant = new ArrayList<String>(); 
//				ordreCroissant.add((int) p, s);
//				Collections.sort(ordreCroissant);
//				System.out.print(ordreCroissant);
//				}
//			}
//		};

//2éme Façon
//ArrayList newList = new ArrayList(Arrays.asList(stagiaires));
//
//System.out.println("ma liste initiale");
//System.out.println(newList);
//TriMaj trimaj = new TriMaj () {
//	public void trierEnMaj(ArrayList<String> List) {
//	for (int i = 0; i < List.size(); i++) {
//		List.set(i, List.get(i).toUpperCase());
//	}
//	Collections.sort(List);
//	System.out.println(List);
//	}
//	};
//	System.out.println("Majuscule et trie avec classe anonymes");
//	trimaj.trierEnMaj(newList);
//	//EXPRESSION LAMBDA
//	TriMaj trimaj2 = (List)-> {
//		for (int i = 0; i < List.size(); i++) {
//			List.set(i, List.get(i).toUpperCase());
//		}
//		Collections.sort(List);
//		System.out.println(List);
//	};
//	System.out.println("Majuscule et trie avec expression Lambda");
//	trimaj2.trierEnMaj(newList);
//	System.out.println(" ");
//}










