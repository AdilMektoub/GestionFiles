package StringBufferBuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GestionFiles {
	
	//Partie 1 :je crée une méthode qui prend en paramètre un StringBuilder (nom) et 
	//retourne un string « Bonjour nom » (append()
	static String BonjourNom(StringBuilder nom) {
		StringBuilder s = new StringBuilder("Bonjour ");
		s.append(nom);
		
		return s.toString();	
	}
		//Partie 2 :je crée une méthode qui prend en paramètre un StringBuilder (nom) et 
		//retourne un string « Bonjour nom » et qui remplace Bonjour par Bonsoir (replace())
	static String RemplaceBonjourBonsoir(StringBuilder nom) {
		StringBuilder s = new StringBuilder("Bonjour ");
		s.replace(0, 6, "Bonsoir"); // remplace du premier charactere au dernier charactere
		s.append(nom);
	
		return s.toString(); 
	}
	
	//Partie 3 :je crée une méthode qui prend en paramètre un StringBuilder (nom) et 
		//retourne un stringbuilder avec le premier char en maj (méthodes de stringBuilder)
	static StringBuilder premierCharMaj(StringBuilder nom) {
		nom.setCharAt(0, Character.toUpperCase(nom.charAt(0)));
		return nom;
		}
	
public static void main(String[] args) throws IOException {
	String[] stagiaires = { "Adeline","Inga", "Imén", "Sébastien", "Nicolas", "Dalia"};
	int[] notes = { 7, 20, 16, 12, 14 , 15};
	StringBuilder sb1 = new StringBuilder("anis");
	System.out.println(BonjourNom(sb1));
	System.out.println(RemplaceBonjourBonsoir(sb1));
	System.out.println(premierCharMaj(sb1));
	
	//Partie 4
	//je crée un dossier dans le bureau de vos ordinateur « testJAVA » 
	File dossier = new File("C://Users/Admin/Desktop/testJAVA/");
	
	if (!dossier.exists())
	dossier.mkdir();
//	à l’intérieur je crée un fichier txt appelé testJ.txt :
//	j'insére dans testJ.txt les noms des stagiaires un nom pour chaque ligne
	File file = new File("C://Users/Poste 2/Admin/Desktop/testJAVA/testJ.txt");
	if (!file.exists())
	try {
		file.createNewFile();
	} catch (IOException e) {
		e.printStackTrace();
	}
	FileWriter writer = new FileWriter(file);
	BufferedWriter bw = new BufferedWriter(writer); // Récuperer l'ecriture
	for (String i : stagiaires) {
		bw.write(i);
		bw.newLine();
	}
	bw.close();
	
	//Partie 5 :je lis le fichier cVotreExercice.txt ligne par ligne
		//	Et j'insére chaque nom dans un arrayList<Sting> qui s’appelle lesAutres.
		//	j'affiche cet Arraylist
	ArrayList<String> list = new ArrayList<String>();
	File file1 = new 
	File("C://Users/Admin/Desktop/testJAVA/cVotreExercice.txt");            
	BufferedReader reader = new BufferedReader(new InputStreamReader
			(new FileInputStream(file1), "UTF-8")); //Récuperer la lecture
	String s = reader.readLine();
	while(s != null) {
		list.add(s);
		s = reader.readLine();
	}
	reader.close();
	System.out.println(list);

	// Partie 6 : Dans le dossier testJAVA je crée 2 fichier text :
		//	Le 1er s’appelle sup5.txt qui contient les noms de stagiaires dont la taille est supérieure ou égals à 5
	File sup5 = new File
			("C://Users/Admin/Desktop/testJAVA/sup5.txt");
	//	Le 2eme s’appelle inf5.txt qui contient les noms de stagiaires dont la taille est inférieur ou égals à 5
	File inf5 = new File
			("C://Users/Admin/Desktop/testJAVA/inf5.txt");
	if (!sup5.exists() && !inf5.exists())
	try {
		sup5.createNewFile(); inf5.createNewFile(); 
	} catch (IOException e) {
		e.printStackTrace();
	}
	FileWriter writerSup5 = new FileWriter(sup5);
	BufferedWriter bwSup5 = new BufferedWriter(writerSup5);
	for (String i : stagiaires) {
		if( i.length() >= 5) {
			bwSup5.write(i);
			bwSup5.newLine();
		}
	}
	bwSup5.close();
	
	FileWriter writerInf5 = new FileWriter(inf5);
	BufferedWriter bwInf5 = new BufferedWriter(writerInf5);
	for (String i : stagiaires) {
		if( i.length() <= 5) {
		bwInf5.write(i);
		bwInf5.newLine();
		}
	}
	bwInf5.close();
	
	// Partie 7 : j'imagine que nous avons un tableau de noms de stagiaires
//	Et l’autre tableau notes contient des entiers qui sont les notes respectives des stagiaires 
//	je crée un 4eme fichier dans notre dossier qui s’appelle notes.txt
//	Qui contient de façon correcte les noms et leurs notes en face et je lis ce fichier dans la console
//	Exemple :
//	Adeline a eu 7/20
//	Inga a eu 20/20	
	File notess = new File("C://Users/Admin/Desktop/testJAVA/notes.txt");
	if (!notess.exists())
	try {
		notess.createNewFile();
	} catch (IOException e) {
		e.printStackTrace();
	}
	FileWriter writ = new FileWriter(notess); // (notess, Charset.forName("UTF-8"));
	BufferedWriter bw1 = new BufferedWriter(writ);
	for(int i = 0; i < notes.length ; i++) {
		bw1.write(stagiaires[i] + " a eu " + notes[i] + "/20");
		bw1.newLine();
	}
	bw1.close();
	
	BufferedReader reader1 = new BufferedReader(new InputStreamReader
			(new FileInputStream(notess), "UTF-8"));
	String s1 = reader1.readLine();
	while(s1 != null) {
		System.out.println(s1);
		s1 = reader1.readLine();
	}
	reader1.close();
	
}
}